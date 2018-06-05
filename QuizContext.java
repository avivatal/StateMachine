public class QuizContext {

    IQuizState currentState;
    int points;

    public QuizContext(){
        currentState = new DidntAnswerQuizState();
        currentState.entry();
        points = 0;
    }

    public void setPoints() {
        points++;
    }

    public void setCurrentState(IQuizState currentState) {
        this.currentState = currentState;
        currentState.entry();
    }

    public IQuizState getCurrentState() {
        return currentState;
    }
}
