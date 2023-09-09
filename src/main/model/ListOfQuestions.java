package model;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ListOfQuestions {
    public ArrayList<String> LOC;

    // EFFECTS: constructs a ListOfQuestions with an ArrayList of all the questions
    public ListOfQuestions()
    {
        LOC = new ArrayList<>();
        LOC.add("What were your emotions like today?");
        LOC.add("How could today have been better?");
        LOC.add("What did you learn today?");
        LOC.add("A message to tommorrow self?");
        LOC.add("Highlight of the day?");
        LOC.add("What challenges did you overcome today");
        LOC.add("What did you accomplish today?");
        LOC.add("What made you smile today?");
        LOC.add("How did you show kindness to yourself?");
        LOC.add("What are you grateful for?");
        LOC.add("What positive choices did you make today?");
        LOC.add("How did you make others feel today?");
        LOC.add("What is worrying me?");
        LOC.add("What didn't work so well today?");
        LOC.add("What went wrong today?");
        LOC.add("How were you when you woke up today?");
    }

    // EFFECTS: returns three distinct questions in the form of an ArrayList
    public String[] selectThreeRandom()
    {
        Random rand = new Random();
        int upperLimit = LOC.size();
        Set<Integer> distinctNumbers = new HashSet<>();

        while (distinctNumbers.size() < 3) {
            int randomNumber = rand.nextInt(upperLimit);
            distinctNumbers.add(randomNumber);
        }

        String[] result = new String[3];

        // converts LOC to an Array to access each element by indexing
        String[] locTemp = LOC.toArray(new String[LOC.size()]);

        for (int i = 0; i < 3; i++) {
            result[i] = locTemp[i];
        }

        return result;

    }


}
