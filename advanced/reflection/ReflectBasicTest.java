import java.lang.reflect.*;

public class ReflectBasicTest{
    public static Car initByDefaultConst() throws Throwable {

        //通过类装载器获取Car类
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class<?> clazz = loader.loadClass("Car");

        //获取Car的构造器
        Constructor<?>[] cons = clazz.getDeclaredConstructors();
        for ( Constructor<?> con : cons) {
            System.out.println(con);
        }

        System.out.println("---------------------------------------");

        //获取Car的方法
        Method[] methods = clazz.getDeclaredMethods();
        for ( Method m : methods) {
            System.out.println(m);
        }

        System.out.println("---------------------------------------");

        //获取Car的私有字段
        Field[] fields = clazz.getDeclaredFields();
        for ( Field f : fields ) {
            System.out.println(f);
        }

        System.out.println("---------------------------------------");
        
        // Class<?>[] para = new Class[2];
        // para[0] = String.class;
        // para[1] = int.class;
        // Constructor<?> cons1 = clazz.getDeclaredConstructor(para);
        // Car car = (Car) con.newInstance("BMW", 1000);

        // Constructor<?> con = clazz.getConstructor((Class[]) null);
        Constructor<?> con = clazz.getDeclaredConstructor((Class[]) null);
        Car car = (Car) con.newInstance();

        return car;

    }

    public static void main(String[] args) throws Throwable{
        Car car = initByDefaultConst();
        car.start();
    }
}