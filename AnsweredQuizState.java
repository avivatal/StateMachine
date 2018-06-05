public class AnsweredQuizState implements IQuizState {

    @Override
    public void entry() {
        System.out.printf("enter AnsweredQuiz state\n");
    }

    @Override
    public void answerQuiz(QuizContext context) {

    }

    @Override
    public void nextWeek(QuizContext context){
        context.setCurrentState(new DidntAnswerQuizState());
    }
}
