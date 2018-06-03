public class StudiousState implements IArticlesState {

    @Override
    public void readArticle(ArticlesContext context) {
        context.setArticles();
        if(context.getArticles() == 8){
            context.setCurrentState(new ResearcherState());
        }
    }

    @Override
    public void entry() {
        System.out.println("enter Studious state\n");
    }
}
