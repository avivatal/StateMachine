public class PassiveState implements IForumState {

    @Override
    public void entry() {
        System.out.printf("enter Passive state\n");
    }

    @Override
    public void postInForum(ForumContext context) {
        context.setPosts();
        if(context.getPosts() == 2){
            context.setCurrentState(new ActiveState());
        }
    }

    @Override
    public void nextWeek(ForumContext context){
        context.zeroPosts();
    }
}
