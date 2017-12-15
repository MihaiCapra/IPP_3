package state;

public class FinishedWorkDay implements State {
    @Override
    public void doAction(PostManContext postManContext) {
        System.out.println(StatusPostMan.FINSH_WORKING_DAY);
        postManContext.setState(this);
    }

    public String toString(){
        return "[GOING TO HOME]";
    }
}
