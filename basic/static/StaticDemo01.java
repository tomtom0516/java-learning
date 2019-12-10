public class StaticDemo01 {
    public static void main(String[] args) {
        Person per1 = new Person("Kelly", 37);
        Person per2 = new Person("Yapeng", 44);
        Person.setCity("CD");
        System.out.println(per1.getInfo());
        System.out.println(per2.getInfo());

    }
}