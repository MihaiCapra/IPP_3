package state;

public class PostManContext {
    private State state;

    public PostManContext(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
