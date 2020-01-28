public abstract class Question {
    private String question;

    public abstract boolean checkAnswer(String input);

    public String getQuestion() {
        return question;
    }
//    public void setQuestion(String question) {
//        this.question = question;
//    }
}
