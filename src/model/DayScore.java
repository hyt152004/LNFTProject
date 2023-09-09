package model;

import exception.dayScoreOutOfBoundsException;

public class DayScore {

    private static double dayScore;

    // EFFECTS: constructs a new DayScore 
    public DayScore(){
        DayScore.dayScore = -1;
    }

    // MODIFIES: this
    // EFFECTS: sets the dayScore to the given value.
    //          if given value is not within in [0, 10], then throw new dayScoreOutOfBoundsException
    public void setDayScore(int dayScore) throws dayScoreOutOfBoundsException{
        if (dayScore >= 0 && dayScore <= 10) {
            DayScore.dayScore = dayScore;
        }
            
        else {
            throw new dayScoreOutOfBoundsException();
        }
    }

    public int getDayScore(){
        return dayScore;
    }

}
