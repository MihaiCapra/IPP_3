package state;

public class Working implements State {
    @Override
    public void doAction(PostManContext postManContext) {
        System.out.println(StatusPostMan.WORKING);
        postManContext.setState(this);
    }

    public String toString(){
        return "[WORKING IN PROGRESS]";
    }
}
