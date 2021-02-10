public class A {
    int y = 1;

    public A() {
        y = 2;
        f();
    }

    void f() {
        System.out.println("Value = " + String.valueOf(y));
    }

    public static class B extends A {
        int y = 3;

        public B() {
            f();
        }

        void f() {
            System.out.println("Value = " + String.valueOf(y));
        }
    }

    public static void main(String[] args) {
        A o = new A.B();
    }
}
