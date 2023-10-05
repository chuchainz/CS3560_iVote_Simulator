import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimulationDriver {
    public static void main(String[] args) {
        final int studentNum = 100;
        //Student[] students = { new Student(111)};


        //set up multi answer question
        Question multi = new MultipleChoice();

        multi.setQuestion("What is the height of the statue of liberty?");
        multi.add("305 ft", true);
        multi.add("306 ft",false);
        multi.add("307 ft", false);
        multi.add("92 m", false);
        multi.add("93 m",true);
        multi.add("94 m", false);

        //set up single answer question
        Question single = new SingleChoice();

        single.setQuestion("The word \"nerd\" was first coined by Dr. Seuss in one of his books");
        single.add("True", true);
        single.add("False", false);

        Student[] students = genStu(studentNum);
        genAns(students, multi);
        runVotingService(multi, students);
        genAns(students, single);
        runVotingService(single, students);

//        for (int i = 0; i < student.length; i++){
//            System.out.println(i);
//        }
        //runVotingService(single, student);

//        System.out.println("Hello world!");

//        List<String> yy = multi.getChoices();
//        System.out.println(yy);

    }
    public static void runVotingService(Question question, Student[] students) {
        VotingService vote = new VotingService(question);
        vote.theQuestion();

        for (Student student : students) {
            vote.addStuAns(student.getID(), student.getAnswers());
        }
        vote.displayResults();
    }


    public static Student[] genStu(int stuNum){
        Student[] student = new Student[stuNum];
        for (int i = 0; i < stuNum; i++) {
            student[i] = new Student();
        }
        return student;
    }

//    public static void genAns(Student[] students, Question question){
//        Random random = new Random();
//        for (Student s : students){
//            List<String> choice = question.getChoices();
//            int rand = random.nextInt(choice.size());
//            String randChoice = choice.get(rand);
//            s.setAnswers(randChoice);
//        }
//        //return;
//    }
    public static void genAns(Student[] students, Question question) {
        Random random = new Random();
        List<String> studentAnswers = new ArrayList<>();
        int rand;
        for (Student s : students) {
            if (question instanceof SingleChoice) {
                //single-choice questions, randomly select one
                List<String> choices = question.getChoices();
                rand = random.nextInt(choices.size());
                studentAnswers.add(choices.get(rand));
                //System.out.println(rand);
            } else if (question instanceof MultipleChoice) {
                //multiple choice questions, randomly select one or more
                List<String> choices = question.getChoices();
                rand = random.nextInt(choices.size()) + 2;
                for (int i = 0; i < rand; i++) {
                    rand = random.nextInt(choices.size());
                    studentAnswers.add(choices.get(rand));
                    System.out.print(choices.get(rand) + ", ");
                }
                System.out.println();
            }
            //System.out.println(s);
            s.setAnswers(studentAnswers);
        }
    }


}



