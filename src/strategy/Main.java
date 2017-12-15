package strategy;

public class Main {
    public static void main(String[] args){
        Context context = new Context(new HeavyPackageIsOrdered());
        System.out.print("Heavy package => ");
        context.executeStrategy();

        Context fragile = new Context(new FragilePackIsOrdered());
        System.out.print("Frigile object => ");
        fragile.executeStrategy();
    }
}
