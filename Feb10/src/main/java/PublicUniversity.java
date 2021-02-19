import java.util.HashMap;

public class PublicUniversity extends University{
    HashMap<Integer, String> deptIdMap = new HashMap<>();
    @Override
    public void createNewDepartment(String name) {
        super.createNewDepartment(name + " university");
    }

    @Override
    public int typeOfLandOwnership() {
        return 1;
    }

    public void createNewDepartment(int deptId) {
    }
}
