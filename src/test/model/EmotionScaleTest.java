package test.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Before;
import org.junit.Test;

import exception.emotionScaleOutOfBoundsException;
import model.EmotionScale;

public class EmotionScaleTest {
    private EmotionScale emotionScale;


    @Before
    public void setUp() {
        emotionScale = new EmotionScale();
    }

    @Test
    public void testValidEmotionScale() {
        try {
            emotionScale.setEmotionScale(3);
        } catch (emotionScaleOutOfBoundsException e) {
            fail("emotionScaleOutOfBoundsException has been caught");
        } assertEquals(3, emotionScale.getEmotionScale());
    }

    @Test
    public void testBelowInBoundEmotionScale() {
        try {
            emotionScale.setEmotionScale(0);
        } catch (emotionScaleOutOfBoundsException e) {
            fail("emotionScaleOutOfBoundsException has been caught");
        } assertEquals(0, emotionScale.getEmotionScale());
    }

    @Test
    public void testAboveInBoundEmotionScale() {
        try {
            emotionScale.setEmotionScale(5);
        } catch (emotionScaleOutOfBoundsException e) {
            fail("emotionScaleOutOfBoundsException has been caught");
        } assertEquals(5, emotionScale.getEmotionScale());
    }

    @Test
    public void testBelowOutOfBoundEmotionScale() {
        try {
            emotionScale.setEmotionScale(-1);
            fail("emotionScaleOutOfBoundsException has NOT been caught");
        } catch (emotionScaleOutOfBoundsException e) {
            assertEquals(-1, emotionScale.getEmotionScale());
        } 
    }

    @Test
    public void testAboveOutOfBoundEmotionScale() {
        try {
            emotionScale.setEmotionScale(6);
            fail("emotionScaleOutOfBoundsException has NOT been caught");
        } catch (emotionScaleOutOfBoundsException e) {
            assertEquals(-1, emotionScale.getEmotionScale());
        } 
    }

}
