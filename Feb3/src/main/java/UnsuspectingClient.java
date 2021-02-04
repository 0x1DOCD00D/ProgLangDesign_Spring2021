public class UnsuspectingClient {
    
    public static void main(String[] args) {
        Human [] people = HumanFactory.createPeople(2);
        for (Human h:people
             ) {
            System.out.println(h.mytype);
        }
    }

}
