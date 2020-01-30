public class CheckboxQuestion extends Question{

    public CheckboxQuestion(String question, String[] answers, String[] possibleAnswers) {
        super((question + "\nEnter ALL correct answers in order, on one line, separated by commas: "), possibleAnswers, answers);
    }


    public boolean checkAnswer(String input){
        String[] tempInput = input.split(",");
        String[] tempAnswers = getAnswers();
        for (String answer : tempAnswers){
            answer = answer.toLowerCase();
        }
        for (String inputString : tempInput){
            inputString = inputString.trim().toLowerCase();
        }

        return tempAnswers.equals(tempInput);
    };

}
