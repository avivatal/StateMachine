public class PassedWithExcellencyState implements IExamState {

    @Override
    public void entry() {
        System.out.printf("enter PassedWithExcellency state\n");
    }

    @Override
    public void takeExam(double grade, ExamContext context) {

    }
}
