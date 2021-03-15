import java.util.ArrayList;

public class RunTheCode {
    public static void main(String[] args) {
        System.out.println(new B().f());
//        Airport o = new Airport() with Ship
//        Class doer = C.class;//ISomeDoer.class;
//        System.out.println(doer.getName());
//        while (doer != null){
//            System.out.println(doer.getName());
//            doer = doer.getSuperclass();
//        }
//        new IPartOfTellyDashboard(){};
    }
}

//The forms using the keyword super are valid only in an instance method, instance initializer, or 
// constructor of a class, or in the initializer of an instance variable of a class. If they appear 
// anywhere else, a compile-time error occurs.
class A{
    static int field = 100;
    public int f(){
        int v = 3;
        return v;
    }
}
class B extends A{
    static {
        ArrayList<Integer> lst = new ArrayList<>(field);
    }
    @Override
    public int f(){
        super.field = 3;
        return super.field;
    }
}
