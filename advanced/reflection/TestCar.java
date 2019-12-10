public class TestCar{
    public static void main(String[] args) {
        Car car = new Car("BMW", 1000);
        System.out.println(car.getBrand()+":"+car.getPrice());
        car.start();

        // Class<?> cls = car.getClass();
        // System.out.println(cls);

        System.out.println( "Hello World".getClass().getName() );
        System.out.println( "Hello World".getClass().getClassLoader() );

        try {
            Class<?> cls = Class.forName("Car");
            System.out.println(cls);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}