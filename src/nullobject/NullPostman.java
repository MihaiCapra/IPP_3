package nullobject;

public class NullPostman extends AbstractPostman {

    @Override
    public String getName() {
        return "Not Available in Post Office Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
