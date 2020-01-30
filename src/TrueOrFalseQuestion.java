public class TrueOrFalseQuestion extends Question{

    public TrueOrFalseQuestion(String question, String[] answers){
        super(question, answers, new String[]{"True", "False"});
    };

    public boolean checkAnswer(String input){
        return getAnswers()[0].toLowerCase().equals(input.toLowerCase());
    };
}
