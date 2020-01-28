public class TrueOrFalseQuestion extends Question{
    private String question;
    private String answer;

    public TrueOrFalseQuestion(String question, String answer){
        this.question = question;
        this.answer = answer;
    };

    public boolean checkAnswer(String input){
        return answer.toLowerCase().equals(input.toLowerCase());
    };

    public String getQuestion() {
        return question;
    }
}
