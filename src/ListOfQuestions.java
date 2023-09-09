import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ListOfQuestions {
    public ArrayList<String> LOC;

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

    public void selectThreeRandom()
    {
        Random rand = new Random();
        int upperLimit = LOC.size();
        Set<Integer> distinctNumbers = new HashSet<>();

        while (distinctNumbers.size() < 3) {
            int randomNumber = rand.nextInt(upperLimit);
            distinctNumbers.add(randomNumber);
        }

        for (int num : distinctNumbers) {
            System.out.println(LOC.get(num));
        }

    }

    public static void main(String[] args) {
        ListOfQuestions questions = new ListOfQuestions();
        questions.selectThreeRandom();
    }

}
