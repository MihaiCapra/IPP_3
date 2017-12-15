package template;

public abstract class Package {
    abstract void orderSet();
    abstract void startCreatePack();
    abstract void packageDone();

    public final void createPackage(){
        orderSet();
        startCreatePack();
        packageDone();
    }
}
