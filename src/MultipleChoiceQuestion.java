public class MultipleChoiceQuestion extends Question {

    public MultipleChoiceQuestion(String question, String[] answers, String[] possibleAnswers) {
        super(question, answers, possibleAnswers);
    }

    public boolean checkAnswer(String input){
        return input.toLowerCase()==(getAnswers()[0].toLowerCase());
    };
}
