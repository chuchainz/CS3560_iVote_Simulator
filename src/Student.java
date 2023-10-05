import java.util.*;

public class Student{
    private UUID ID;
    private List<String> answers = new ArrayList();
    public Student(){
    }
    public Student(int i){
        setID(UUID.randomUUID());
    }

    public void setID(UUID randomUUID) {
        this.ID = randomUUID;
    }
    public UUID getID(){
        return this.ID;
    }
    public void addAns(String answer){
        this.answers.add(answer);
    }
    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    //    public void showAns(){
//        System.out.println(getAnswers());
//    }
    public List<String> getAnswers() {return answers;}

}
