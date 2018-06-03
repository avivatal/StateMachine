public class PassedState implements IExamState {

    @Override
    public void entry() {
        System.out.printf("enter Passed state\n");
    }
    @Override
    public void takeExam(double grade, ExamContext context) {

    }
}
