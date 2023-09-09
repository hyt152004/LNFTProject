package model;
public class DayScore {

    static int dayScore;

    public DayScore(){
        DayScore.dayScore = -1;
    }

    public void setDayScore(int dayScore){
        if(dayScore < 0 || dayScore > 11)
        DayScore.dayScore = dayScore;
        else{
            // throws exception i think
        }
    }

    public int getDayScore(){
        return dayScore;
    }

}
