class Single {

    private static Single instance = new Single();

    private Single() {}

    public static Single getInstance() {
        return Single.instance;
    }

    public void sayHello() {
        System.out.println("Hello World");
    }
    
}

public class SingleDemo {
    public static void main(String[] args) {
        Single sin = Single.getInstance();
        sin.sayHello();
    }
}