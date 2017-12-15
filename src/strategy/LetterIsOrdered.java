package strategy;

public class LetterIsOrdered implements Strategy {
    @Override
    public void packThePackage() {
        System.out.println("Use a standard letter to pack.");
    }
}
