public class CanTakeTestState implements IExamState {

    @Override
    public void entry() {
        System.out.printf("enter CanTakeTest state\n");
    }

    @Override
    public void takeExam(double grade, ExamContext context) {
        if(grade < 56){
            context.setCurrentState(new FailedState());
        }
        else if(grade >= 90){
            context.setCurrentState(new PassedWithExcellencyState());
        }
        else {
            context.setCurrentState(new PassedState());
        }
    }
}
