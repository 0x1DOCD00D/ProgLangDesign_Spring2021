import java.util.List;
        
public class Company {
    List employees;
    
    class Subsidiary extends Company {
        List overseeingCommittee;
    }
    
    static class HRDepartment {
        
    }
    
    class Employee {
        
    }
    
    public Employee hireEmployee(){
        return new Employee();
    }
}
