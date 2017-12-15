package mediator;

public class PostOffice {
    public static void showStatus(PostMan postman, Status status){
        System.out.println(String.format("[%s][%s]",postman.getName(), status));
    }
}
