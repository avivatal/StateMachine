public class ActiveState implements IForumState {

    @Override
    public void entry() {
        System.out.printf("enter Active state");
    }

    @Override
    public void postInForum(ForumContext context) {
        context.setPosts();
    }

    @Override
    public void nextWeek(ForumContext context) {
        context.zeroPosts();
        context.setCurrentState(new PassiveState());
    }
}