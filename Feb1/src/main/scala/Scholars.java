public abstract class Scholars {
    protected String message = "My incentive is to be a scholar!";
    public abstract String publish(int Incentive);   
   
    public static void main(String[] args) {
        Scholars sch = new Professor();
        System.out.println(sch.publish(5));
        System.out.println(sch.message);
    }
}

class Professor extends Scholars{
    protected String message = "Professor's incentive is ";
    @Override
    public String publish(int Incentive) {
        return message + String.valueOf(Incentive);
    }
}

class Student extends Scholars{
    @Override
    public String publish(int Incentive) {
        return "I publish student blog entries";
    }
}

