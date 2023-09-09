package model;

import exceptions.dayScoreOutOfBoundsException;

public class DayScore {

    static int dayScore;

    public DayScore(){
        DayScore.dayScore = -1;
    }

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
