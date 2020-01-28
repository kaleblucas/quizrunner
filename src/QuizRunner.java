import java.util.ArrayList;

public class QuizRunner {
    public static void main(String[] args) {
        //TODO: CREATE QUESTIONS, RUN QUIZ.
        Question yearQuestion = new TrueOrFalseQuestion("The year is 2019.", "False");
        Question dayQuestion = new TrueOrFalseQuestion("Today is Wednesday.", "False");
        Question timeQuestion = new TrueOrFalseQuestion("The time is now.", "True");
        ArrayList<Question> questionList = new ArrayList<>();
        questionList.add(yearQuestion);
        questionList.add(dayQuestion);
        questionList.add(timeQuestion);

        Quiz firstQuiz = new Quiz(questionList);
        firstQuiz.runQuiz();
    }
}
