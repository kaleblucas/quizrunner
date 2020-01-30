import java.util.ArrayList;

public class QuizRunner {
    public static void main(String[] args) {
        //TODO: CREATE QUESTIONS, RUN QUIZ.
        Question trueOrFalseQuestion = new TrueOrFalseQuestion("The year is 2019.", new String[]{"False"});
        Question multipleChoiceQuestion = new MultipleChoiceQuestion("Which is the best day?", new String[]{"Friday"}, new String[]{"Wednesday","Tuesday", "Thursday", "Friday"});
        Question checkBoxQuestion = new CheckboxQuestion("The WORST days are?", new String[]{"Monday", "Tuesday", "Saturday"}, new String[]{"Monday", "Tuesday"});
        ArrayList<Question> questionList = new ArrayList<>();
        questionList.add(trueOrFalseQuestion);
        questionList.add(multipleChoiceQuestion);
        questionList.add(checkBoxQuestion);

        Quiz firstQuiz = new Quiz(questionList);
        firstQuiz.runQuiz();
    }
}
