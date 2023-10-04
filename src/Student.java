import java.util.*;

public class Student extends Question{
    private UUID ID;
    private Map<String, Boolean> answers = new HashMap();
    public Student(){
        setID(UUID.randomUUID());
    }

    public void setID(UUID randomUUID) {
        this.ID = randomUUID;
    }
    public UUID getID(){
        return this.ID;
    }
    public void addAns(String answer, boolean x){
        this.answers.put(answer, x);
    }
    public void showAns(){
        System.out.println(getAnswers());
    }

}
