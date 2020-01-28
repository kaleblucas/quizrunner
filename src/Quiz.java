import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions = new ArrayList<>();
    private int correctAnswers = 0;
    private Scanner input = new Scanner(System.in);

    public Quiz(ArrayList<Question> questions){
        this.questions = questions;
    };

    public void runQuiz(){
        for(Question question : questions){
            System.out.println(question.getQuestion());
            String response = input.nextLine();
            if(question.checkAnswer(response)){
                correctAnswers++;
            }
        }
        System.out.println("Your score is: " + gradeQuiz());

    };
    public void addQuestion(){

    };

    public double gradeQuiz(){
        return (correctAnswers/questions.size())*100;
    };

    public ArrayList<Question> getQuestions() {
        return questions;
    }
    public int getCorrectAnswers() {
        return correctAnswers;
    }
    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
    public void setCorrectAnswers(int correctAnswers) {
        this.correctAnswers = correctAnswers;
    }
}
