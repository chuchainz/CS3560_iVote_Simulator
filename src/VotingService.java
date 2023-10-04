import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class VotingService {
    private Map<UUID, List<String>> allAnswers = new HashMap<>();
    Question question;

    public VotingService(Question question){
        this.question = question;
    }
    public void addStuAns(UUID uuid, List<String> answer){
        this.allAnswers.put(uuid, answer);
    }
    public void displayResults(){
        List<String> answers = this.question.answers;
        int right = 0, wrong = 0;
        for(List<String> studentAnswers : allAnswers.values()){
            if(studentAnswers.equals(answers)){
                right++;
            } else {
                wrong++;
            }
        }
        System.out.println();
        System.out.println("Correct Answer(s): " + answers);
        System.out.println("Amount correct: " + right + "Amount Wrong: " + wrong);
    }

    public void theQuestion(){
        this.question.showQuestion();
        this.question.showChoices();
    }
}
