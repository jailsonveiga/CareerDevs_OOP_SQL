package encapsulation;

public class Main {
    public static void main(String[] args) {

        Student s = new Student();
        s.setName("Suzie");
        s.setAge(17);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
