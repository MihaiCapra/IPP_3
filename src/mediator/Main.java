package mediator;

public class Main {
    public static void main(String[] args){
        PostMan Bob = new PostMan("Bob");
        PostMan David = new PostMan("David");

        Bob.showCurrentStatus(Status.NOT_AT_WORK);
        David.showCurrentStatus(Status.WORKING);
    }
}
