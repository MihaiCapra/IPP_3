package template;

public class Letter extends Package{

    @Override
    void orderSet() {
        System.out.println("Order Set. Start creating the Letter.");
    }

    @Override
    void startCreatePack() {
        System.out.println("Order Completed. Packing Letter.");
    }

    @Override
    void packageDone() {
        System.out.println("Letter packed. Done!");
    }
}
