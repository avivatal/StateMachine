public class CannotTakeTestState implements IExamState {

    @Override
    public void entry() {
        System.out.printf("enter CannotTakeTest state\n");
    }

    @Override
    public void takeExam(double grade, ExamContext context) {
    }


}
