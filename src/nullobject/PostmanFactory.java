package nullobject;

public class PostmanFactory {

    private static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractPostman getPostman(String name){
        for (String n : names) {
            if (n.equalsIgnoreCase(name)) {
                return new RealPostman(name);
            }
        }
        return new NullPostman();
    }
}
