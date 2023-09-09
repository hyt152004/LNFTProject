package test.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.*;

import exception.dayScoreOutOfBoundsException;
import model.DayScore;

public class DayScoreTest {
    private DayScore myDay;


    @Before
    public void setUp() {
        myDay = new DayScore();
    }

    @Test
    public void testValidSetDayScore() {
        try {
            myDay.setDayScore(5);
        } catch (dayScoreOutOfBoundsException e) {
            fail("dayScoreOutOfBoundsException has been caught");
        } assertEquals(5, myDay.getDayScore());
    }

    @Test
    public void testBelowInBoundSetDayScore() {
        try {
            myDay.setDayScore(0);
        } catch (dayScoreOutOfBoundsException e) {
            fail("dayScoreOutOfBoundsException has been caught");
        } assertEquals(0, myDay.getDayScore());
    }

    @Test
    public void testAboveInBoundSetDayScore() {
        try {
            myDay.setDayScore(10);
        } catch (dayScoreOutOfBoundsException e) {
            fail("dayScoreOutOfBoundsException has been caught");
        } assertEquals(10, myDay.getDayScore());
    }

    @Test
    public void testBelowOutOfBoundSetDayScore() {
        try {
            myDay.setDayScore(-1);
            fail("dayScoreOutOfBoundsException has NOT been caught");
        } catch (dayScoreOutOfBoundsException e) {
            assertEquals(-1, myDay.getDayScore());
        } 
  
    }

    @Test
    public void testAboveOutOfBoundSetDayScore() {
        try {
            myDay.setDayScore(11);
            fail("dayScoreOutOfBoundsException has NOT been caught");
        } catch (dayScoreOutOfBoundsException e) {
            assertEquals(-1, myDay.getDayScore());
        } 
    }


}