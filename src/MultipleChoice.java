public class MultipleChoice extends Question {
    public void setChoices(String choices, boolean answer){
        //add all of our choices into the choice list
        this.choices.add(choices);
        //if the answer boolean is "true" then we add it to the answer list
        if (answer){
            this.answers.add(choices);
        }
    }
}
