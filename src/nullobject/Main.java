package nullobject;

public class Main {
    public static void main(String[] args) {

        AbstractPostman postmanBob =   PostmanFactory.getPostman("Rob");
        AbstractPostman postmanDavid = PostmanFactory.getPostman("David");
        AbstractPostman postmanJulie = PostmanFactory.getPostman("Julie");
        AbstractPostman postmanLaura = PostmanFactory.getPostman("Laura");

        System.out.println("[POST OFFICE]");
        System.out.println(postmanBob.getName());
        System.out.println(postmanDavid.getName());
        System.out.println(postmanJulie.getName());
        System.out.println(postmanLaura.getName());
    }
}