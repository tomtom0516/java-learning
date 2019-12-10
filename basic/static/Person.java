public class Person {
    private String name;
    private int age;
    private static String city;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getCity() {
        return city;
    }

    public static void setCity(String city) {
        Person.city = city;
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getInfo() {
        return "name:" + this.name + " age: " + this.age + " city: " + city;
    }

}