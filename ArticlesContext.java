public class ArticlesContext{

    private IArticlesState currentState;

    private int articles;

    public ArticlesContext(){
        currentState = new RegularState();
        currentState.entry();
        articles = 0;
    }

    public void setArticles() {
        articles++;
    }

    public int getArticles() {
        return articles;
    }

    public void setCurrentState(IArticlesState currentState) {
        this.currentState = currentState;
        currentState.entry();
    }

    public IArticlesState getCurrentState() {
        return currentState;
    }
}
