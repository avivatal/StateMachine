public class ExamContext {

    private IExamState currentState;

    public ExamContext(){
        currentState = new BeforeExamState();
    }

    public void setCurrentState(IExamState currentState) {
        this.currentState = currentState;
        currentState.entry();
    }

    public IExamState getCurrentState() {
        return currentState;
    }
}
