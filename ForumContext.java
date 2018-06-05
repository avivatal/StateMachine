public class ForumContext {

    private int posts;
    private IForumState currentState;

    public ForumContext(){
        posts = 0;
        currentState = new PassiveState();
        currentState.entry();
    }

    public void setPosts(){
        posts++;
    }

    public void zeroPosts(){
        posts = 0;
    }

    public int getPosts() {
        return posts;
    }

    public void setCurrentState(IForumState state){
        currentState = state;
        currentState.entry();
    }

    public IForumState getCurrentState() {
        return currentState;
    }
}
