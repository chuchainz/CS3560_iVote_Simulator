import java.util.*;

public class Student {
    private UUID ID;
    private Set<String> answers = new HashSet<>();
    // default constructor
    public Student() {
        this.ID = UUID.randomUUID();
        this.answers = new HashSet<>();
    }
    // inputted constructor
    public Student(UUID id, HashSet<String> answers){
        this.ID = id;
        this.answers = answers;
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
    public void setAnswers(HashSet<String> answers) {
        this.answers = answers;
    }

    //    public void showAns(){
//        System.out.println(getAnswers());
//    }
    public Set<String> getAnswers() {return answers;}

}
