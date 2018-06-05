public class ResearcherState implements IArticlesState {

    @Override
    public void readArticle(ArticlesContext context) {
        context.setArticles();
    }

    @Override
    public void entry() {
        System.out.println("enter Researcher state\n");
    }
}
