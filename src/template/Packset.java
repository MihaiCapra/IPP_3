package template;

public class Packset extends Package {
    @Override
    void orderSet() {
        System.out.println("Order Set. Start creating the Packset.");
    }

    @Override
    void startCreatePack() {
        System.out.println("Order Completed. Creating Packset.");
    }

    @Override
    void packageDone() {
        System.out.println("Packset --> packed. Done!");
    }
}
