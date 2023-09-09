package test.model;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.ListOfQuestions;

public class ListOfQuestionsTest {

    private ListOfQuestions loc;

    @Before
    public void setUp() {
        loc = new ListOfQuestions();
    }

    @Test
    public void testValidSetDayScore() {
        assertEquals(3, loc.selectThreeRandom().length);
    }
}
