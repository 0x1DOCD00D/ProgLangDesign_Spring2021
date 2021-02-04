public class Human {
    int age;
    String thoughts;
    public String mytype;
    
 //   private Human(){}
    
    public Human(String thought) {
        assert (thought != null);
        mytype = "human";
        thoughts = new String(thought);
    }
    
    public String listenAndrespond(String saidThing) {
        return thoughts;
    }
}

