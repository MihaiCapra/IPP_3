package strategy;

public class FragilePackIsOrdered implements Strategy{
    @Override
    public void packThePackage() {
        System.out.println("Pack in Box and surround with foam plastic balls.");
    }
}
