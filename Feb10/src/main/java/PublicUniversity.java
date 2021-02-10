import java.util.HashMap;

public class PublicUniversity extends University{
    HashMap<Integer, String> deptIdMap = new HashMap<>();
    @Override
    public void createNewDepartment(String name) {
        super.createNewDepartment(name);
    }

    public void createNewDepartment(int deptId) {
    }
}
