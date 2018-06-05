public class ExamContext {

    private IExamState currentState;

    public ExamContext(){
        currentState = new CannotTakeTestState();
        currentState.entry();
    }

    public void setCurrentState(IExamState currentState) {
        this.currentState = currentState;
        currentState.entry();
    }

    public IExamState getCurrentState() {
        return currentState;
    }
}
