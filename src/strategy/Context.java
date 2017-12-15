package strategy;

public class Context {
    private Strategy mStrategy;

    public Context(Strategy strategy){
        this.mStrategy = strategy;
    }

    public void executeStrategy(){
        mStrategy.packThePackage();
    }
}
