import java.util.ArrayList;
import java.util.List;

public abstract class Question {
    String questions;
    List<String> choices = new ArrayList<>();
    List<String> answers = new ArrayList<>();

    //setters to get our questions, choices, and answers
    public void setQuestion(String question){
        this.questions = question;
    }
    abstract void add(String choice, boolean answer);

    //getters to get our questions, choices, and answers
    public String getQuestion(){
        return this.questions;
    }
    public List<String> getChoices(){
        return this.choices;
    }
    public List<String> getAnswers(){
        return this.answers;
    }

    //methods to show our question and choices
    public void showQuestion(){
        System.out.println(questions);
    }
    public void showChoices(){
        for (String i : this.choices){
            System.out.println(i);
        }
    }

}
