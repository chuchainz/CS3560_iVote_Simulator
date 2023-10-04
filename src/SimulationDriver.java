import java.util.List;

public class SimulationDriver {
    public static void main(String[] args) {
        final int studentNum = 30;

        //set up multi answer question
        Question multi = new MultipleChoice();

        multi.setQuestion("What is the height of the statue of liberty?");
        multi.setAnswers("305 ft", true);
        multi.setAnswers("306 ft",false);
        multi.setAnswers("307 ft", false);
        multi.setAnswers("92 m", false);
        multi.setAnswers("93 m",true);
        multi.setAnswers("94 m", false);

        //set up single answer question
        Question single = new SingleChoice();

        single.setQuestion("The word \"nerd\" was first coined by Dr. Seuss in one of his books");
        single.setAnswers("True", true);
        single.setAnswers("False", false);

        Student[] students = new Student[studentNum];

        for (int i = 0; i < studentNum; i++) {
            students[i] = new Student();
        }

        // Simulate answers for students
        for (Student student : students) {
            List<String> multiAnswers = multi.getChoices();
            for (String answer : multiAnswers) {
                boolean selected = Math.random() < 0.5; // 50% chance of selecting
                student.addAns(answer, selected);
            }
        }

        // Print out the students and their answers
        for (Student student : students) {
            System.out.println("Student ID: " + student.getID());
            System.out.println("Answers:");
            student.showAns();
            System.out.println();
        }
        System.out.println("Hello world!");
    }
}



