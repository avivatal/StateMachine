public interface IQuizState {

    public void entry();

    public void answerQuiz(QuizContext context);

    public void nextWeek(QuizContext context);
}
