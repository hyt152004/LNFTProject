package model;

public class Reflection {

    private DayScore dayScore;
    private EmotionScale emotionScale;
    private JournalEntry journalEntry;
    private Day day;
    
    public Reflection(DayScore dayScore, EmotionScale emotionScale, JournalEntry journalEntry, Day day){
        this.dayScore = dayScore;
        this.emotionScale = emotionScale;
        this.journalEntry = journalEntry;
        this.day = day;
    }


}
