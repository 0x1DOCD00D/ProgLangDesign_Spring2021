public class DerivedClass extends BaseClass{
    int attribute1 = 2;
    
    public static void main(String[] args) {
       BaseClass someVar = new DerivedClass(); 
        someVar.setAttribute(20);

    }
}
