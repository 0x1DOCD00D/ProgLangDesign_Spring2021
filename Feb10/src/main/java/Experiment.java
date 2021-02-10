public class Experiment {
    public Object function() {
        int i = 1_0000_0000;
        class A {
            public Object function() {
                int i = 1_0000_0000;
                class A1 {
                    public Object function() {
                        return new A1();
                    }
                    public int k = 2_000;
                }
                return new A();
            }
            public int k = 2_000;
        }
        return new A();
    }

    public static void main(String[] args) {
        Object retval = new Experiment().function();
        System.out.println(retval);
    }
}
