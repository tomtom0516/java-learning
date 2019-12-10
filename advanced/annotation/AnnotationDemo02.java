// import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class AnnotationDemo02 {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Info");
        System.out.println(cls);

        Method toStringMethod = cls.getMethod("toString");

        if ( toStringMethod.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation my = toStringMethod.getAnnotation(MyAnnotation.class);
            System.out.println(my);
            String key = my.key();
            String value = my.value();
            System.out.println(key + " --> " + value);
        }

    }
}