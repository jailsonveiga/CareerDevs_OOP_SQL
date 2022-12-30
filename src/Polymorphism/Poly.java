package Polymorphism;

class Bird {
    public void sing() {
        System.out.println("tweet, tweet, tweet");
    }
}

class Robin extends Bird{
    public void sing() {
        System.out.println("twiddleeeedee");
    }
}

public class Poly {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.sing();

        Robin r = new Robin();
        r.sing();
    }
}
