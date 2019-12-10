import java.io.FileReader;
import java.util.Properties;
import java.lang.reflect.*;

public class ReflectApp01 {

    private static String CUSTOMIZATION_FILE = "customization.properties";

    public static void main(String[] args) throws Exception {

        // get class
        Class<?> cls = Class.forName(getValue("className"));
        System.out.println(cls);

        // get method
        Method m = cls.getMethod(getValue("methodName"));
        System.out.println(m);

        // invode method (need to create new instance first)
        m.invoke(cls.getConstructor().newInstance());

    }


    public static String getValue(String key) throws Exception {
        Properties pro = new Properties();
        FileReader in = new FileReader(CUSTOMIZATION_FILE);
        pro.load(in);
        // System.out.println("classname: " + pro.getProperty("className"));
        // System.out.println("methodname: " + pro.getProperty("methodName"));
        return pro.getProperty(key);
    }

}