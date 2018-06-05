public class DidntAnswerQuizState implements IQuizState {

    @Override
    public void entry() {
        System.out.printf("enter DidntAnswerQuiz state\n");
    }

    @Override
    public void answerQuiz(QuizContext context) {
        context.setPoints();
        context.setCurrentState(new AnsweredQuizState());
    }

    @Override
    public void nextWeek(QuizContext context) {

    }
}
