package state;

public class Main {
    public static void main(String[] args){
        PostManContext postManContext = new PostManContext();

        StartWorkDay startWorkDay = new StartWorkDay();
        startWorkDay.doAction(postManContext);
        System.out.println(postManContext.getState().toString());

        Working working = new Working();
        working.doAction(postManContext);
        System.out.println(postManContext.getState().toString());

        FinishedWorkDay finishedWorkDay = new FinishedWorkDay();
        finishedWorkDay.doAction(postManContext);
        System.out.println(postManContext.getState());
    }
}
