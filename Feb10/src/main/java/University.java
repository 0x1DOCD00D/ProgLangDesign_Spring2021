import scala.concurrent.duration.Deadline;

import java.util.ArrayList;
import java.util.List;

public class University {
    public class Department{
        public String deptName = "";
        public Department(String name){
            assert (name != null && !name.isEmpty());
            deptName = name;
        }
        private Department(){}
    }
    List<Department> departmentList = new ArrayList<>();

    public void createNewDepartment(String name){
        departmentList.add(new Department(name));
    }
}
