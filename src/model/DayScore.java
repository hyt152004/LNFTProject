package model;
public class DayScore {

    static int dayScore;

    public DayScore(){
        DayScore.dayScore = -1;
    }

    public void setDayScore(int dayScore){
        DayScore.dayScore = dayScore;
    }

    public int getDayScore(){
        return dayScore;
    }

}
