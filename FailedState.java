public class FailedState implements IExamState {

    @Override
    public void entry() {
        System.out.printf("enter Failed state\n");
    }

    @Override
    public void takeExam(double grade, ExamContext context) {

    }
}
