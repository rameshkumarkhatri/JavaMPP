package lesson7.labs.prob1.partE;

public class D1 implements C, B {

    @Override
    public void method() {
//        C.super.method();
        System.out.println("D1");
    }

    public static void main(String[] arg) {
        D1 d1 = new D1();
        d1.method();
    }
}
