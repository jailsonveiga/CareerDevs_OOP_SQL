package Inheritance;

public class Main {
    public static void main(String[] args) {

        Mouse1 m1 = new Mouse1();

        System.out.println("Mouse 1:");

        m1.leftClick();
        m1.rightClick();
        m1.scrollUp();
        m1.scrollDown();

        m1.setColor("red");

        System.out.println("- - - - - - - - - -");

        Mouse2 m2 = new Mouse2();

        System.out.println("Mouse 2:");

        m2.leftClick();
        m2.rightClick();
        m2.scrollUp();
        m2.scrollDown();

        m2.connect();

    }
}
