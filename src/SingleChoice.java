public class SingleChoice extends Question{
    public void setChoices(String choices, boolean answer){
        //add all of our choices into the choice list
        this.choices.add(choices);
        //if the answer boolean is "true" and no answer is in the list yet, then we add it to the answer list
        if (answer && answers.isEmpty()){
            this.answers.add(choices);
        }
    }
}
