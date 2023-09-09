package model;

import java.time.LocalDate;
import java.util.Scanner;

public class LNFT {
    
    private Scanner input;
    private User user;
    private LocalDate todayDate;
    
    //LETS GET THIS STARTED!!!
    public LNFT(){
        runLNFT();
    }

    //EFFECTS: initalize variables
    public void init(){
        input = new Scanner(System.in);
        user = new User();
        todayDate = LocalDate.now();
    }

    //EFFECTS: runs application
    //MODIFIES: this
    public void runLNFT(){
        boolean keepRunning = true;
        String command;

        System.out.println("\n"+ "Today's date:" + todayDate.getMonth() + " " + todayDate.getDayOfMonth() + ", " + todayDate.getYear());

        init();

        while(keepRunning == true){
            displayDayMenu();
            command = input.nextLine();
            command = command.toLowerCase();

            if(command == "q"){
                keepRunning = false;
            } else {
                processCommand(command);
            }
        }

        System.out.println("\n Well that's a wrap... (run beautiful + inspirational quote)");
    }

    //EFFECTS: prints display menu on console
    public void displayDayMenu(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("a -> Update dayscore");
        System.out.println("b -> Update emotion scale");
        System.out.println("c -> Answer daily questions");
        System.out.println("d -> Abstract journal entry");
        System.out.println("e -> Upload pictures (we'll get to this someday)");
        System.out.println("q -> Exit ");
        System.out.println("-------------------------------------------------------------");
    }

    //EFFECTS: calls next function from display menu according to the command
    public void processCommand(String command){
        if (command.equals("a")) {
            updateDayScore();
        } else if (command.equals("b")) {
            updateEmotionScale();
        } else if (command.equals("c")) {
            answerDailyQuestions();
        } else if (command.equals("d")) {
            addJournalEntry();
        } else if (command.equals("e")) {
            //nothing yet... does not have enough knowledge to implement
        } else {
            System.out.println("Invalid command");
            // throws exception
        }   
    }

    //EFFECTS: updates dayScore
    public void updateDayScore(){
        System.out.println("How would you rate your day out of 10 today? (0 -> Terrible, 10 -> BEST DAY)");
        double dayScore = input.nextFloat();

    }

    //EFFECTS: updates Emotion scale
    public void updateEmotionScale(){
        System.out.println("What is your emotion today?");//idk how this is working yet
        int emotion = input.nextInt();
    }

    //EFFECTS: answers daily questions
    public void answerDailyQuestions(){

    }

    //EFFECTS: add free hournal
    public void addJournalEntry(){
        
    }









}
