package ex_19_OOps2.Poly.methodoverriding;

public class Lab1 {

    public static void main(String[] args) {
        Pramod p = new Pramod();
        p.home();
        p.p1();

        Father f1 = new Father();
        f1.home();
        f1.f1();

        Father f2 = new Pramod();
        f2.home();


    }
}
