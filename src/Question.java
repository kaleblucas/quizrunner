public abstract class Question {
    private String question;
    private String[] possibleAnswers;
    private String[] answers;

    public Question(String question, String[] answers){
        this.question = question;
        this.answers = answers;
    }
    public Question(String question, String[] answers, String[] possibleAnswers){
        this(question, answers);
        this.possibleAnswers = possibleAnswers;
    }


    public abstract boolean checkAnswer(String input);

    public String listStringOfPossibleAnswers(){
        String possibleAnswerList = "";
        for (String possibleAnswer : this.possibleAnswers){
            possibleAnswerList += ("\n" + possibleAnswer);
        };
        return possibleAnswerList;
    };

    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String[] getPossibleAnswers() {
        return possibleAnswers;
    }
    public void setPossibleAnswers(String[] possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }
    public String[] getAnswers() {
        return answers;
    }
    public void setAnswers(String[] answers) {
        this.answers = answers;
    }
}
