package nullobject;

public class RealPostman extends AbstractPostman {

    public RealPostman(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}