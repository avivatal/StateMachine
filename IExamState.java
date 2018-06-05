public interface IExamState {

    public void entry();

    public void takeExam(double grade, ExamContext context);
}
