package state;

public class StartWorkDay implements State {
    @Override
    public void doAction(PostManContext postManContext) {
        System.out.println(StatusPostMan.START_WORKING_DAY);
        postManContext.setState(this);
    }

    public String toString(){
        return "[STARTED WORKING DAY]";
    }
}
