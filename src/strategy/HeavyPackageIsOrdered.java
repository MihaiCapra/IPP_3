package strategy;

public class HeavyPackageIsOrdered implements Strategy {
    @Override
    public void packThePackage() {
        System.out.println("Pack the object in wood box");
    }
}
