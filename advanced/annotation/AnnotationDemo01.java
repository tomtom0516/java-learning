import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class AnnotationDemo01 {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Info");
        System.out.println(cls);

        Method toStringMethod = cls.getMethod("toString");

        Annotation ans[] = toStringMethod.getAnnotations();
        
        for (Annotation an : ans) {
            System.out.println(an);
        }

    }
}