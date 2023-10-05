import java.util.*;

public class VotingService {
    private Map<UUID, List<String>> allAnswers = new HashMap<>();
    Question question;

    public VotingService(Question question){
        this.question = question;
    }
    public void addStuAns(UUID uuid, List<String> answer){
        this.allAnswers.put(uuid, answer);
    }

    public void displayResults() {
        List<String> correctAnswers = this.question.answers;
        Map<String, Integer> choiceCounts = new HashMap<>();

        for (String choice : this.question.choices) {
            choiceCounts.put(choice, 0); // Initialize choice counts to 0
        }

        int totalCorrect = 0;
        int totalWrong = 0;
        System.out.print(allAnswers);
        for (List<String> studentAnswers : allAnswers.values()) {
            System.out.println(studentAnswers);
            boolean isCorrect = true;
            //Set<String> correct = new HashSet<>();

            if (new HashSet<>(studentAnswers).containsAll(correctAnswers)){
                //System.out.printf("hi");
                totalCorrect++;
            } else {
                totalWrong++;
            }

            for (String answer : studentAnswers) {
                choiceCounts.put(answer, choiceCounts.get(answer) + 1);
            }

//            if (isCorrect) {
//                totalCorrect++;
//            } else {
//                totalWrong++;
//            }
        }

        System.out.println();
        System.out.println("Correct Answer(s): " + correctAnswers);

        for (String choice : this.question.choices) {
            System.out.println("\"" + choice + "\" = " + choiceCounts.get(choice));
        }

        System.out.println("Total Correct: " + totalCorrect);
        System.out.println("Total Wrong: " + totalWrong + "\n");
    }






    public void theQuestion(){
        this.question.showQuestion();
        this.question.showChoices();
    }
}
