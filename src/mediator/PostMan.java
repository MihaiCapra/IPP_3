package mediator;

public class PostMan {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PostMan(String name){
        this.name  = name;
    }

    public void showCurrentStatus(Status status){
        PostOffice.showStatus(this,status);
    }
}
