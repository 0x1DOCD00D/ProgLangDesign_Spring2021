import java.util.ArrayList;
import java.util.List;

//import University.*;
public class Student {
    University singleObj = new PublicUniversity();
    public List<University> checkUnivStatus = new ArrayList<>();
    {
//        int bb;
//        {
//            int bb = 2;
//        }
    }

    public Student() {
//        checkUnivStatus.add(new PublicUniversity());
        checkUnivStatus.add(new PrivateUniversity());
//        checkUnivStatus.add(new PublicUniversity());
//        checkUnivStatus.add(new PrivateUniversity());
//        checkUnivStatus.add(new PublicUniversity());
    }

    public static void main(String[] args) {
        Student s = new Student();
        for (University u: s.checkUnivStatus
             ) {
            ((PublicUniversity)u).createNewDepartment(2);
//            new PublicUniversity().createNewDepartment(3);
            System.out.println(u.typeOfLandOwnership());
        }

    }
}
