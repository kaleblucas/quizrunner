import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question {
    private String question;
    private String[] possibleAnswers;
    private String answer;

    public MultipleChoiceQuestion(String question, String[] possibleAnswers, String answer){
        this.question = question;
        this.possibleAnswers = possibleAnswers;
        this.answer = answer;
    };

    public boolean checkAnswer(String input){
        int index = Integer.parseInt(input);
        return possibleAnswers[index].equals(answer);
    };
}
