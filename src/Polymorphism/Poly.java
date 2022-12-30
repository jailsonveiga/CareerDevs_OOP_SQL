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

}
