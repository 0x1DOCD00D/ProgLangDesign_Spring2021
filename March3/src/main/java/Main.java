package com.mg;
interface MCall {
    default int f1() {
        return 2;
    }
}
public class Main implements MCall {
    static {
        fvar = 7;
    }
    static int fvar = 0;
    public int fvar1 = 2_0;
    public int f() {
        return fvar = 1;
    }
    interface MCall {
        default int f() {
            return 2;
        }
    }
    public class Nested extends Main implements Main.MCall {
        int fvar = 1;

        public int f() {
            fvar = Main.this.fvar1;
            return fvar;
        }
    }
    public static void main(String[] args) {
        Main.MCall call1 = new Main().new Nested();         //statement 1
        Main call2 = new Main().new Nested();               //statement 2
        Main.Nested call3 = (Main.Nested) new Main();       //statement 3
        com.mg.MCall call4 = new Main();                    //statement 4
        System.out.println(call1.f());                      //statement 5
        System.out.println(call2.f());                      //statement 6
        System.out.println(call3.f());                      //statement 7
        System.out.println(call4.f());                      //statement 8
    }
}
