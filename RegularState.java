public class RegularState implements IArticlesState {

    @Override
    public void readArticle(ArticlesContext context) {
        context.setArticles();
        if(context.getArticles() == 3){
            context.setCurrentState(new StudiousState());
        }
    }

    @Override
    public void entry() {
        System.out.println("enter Regular state\n");
    }
}
