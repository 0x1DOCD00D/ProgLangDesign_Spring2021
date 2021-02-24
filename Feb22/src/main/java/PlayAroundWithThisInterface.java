public interface PlayAroundWithThisInterface {
    final int MYCONST = 7;
    
    class Student {
    }

//    Student m(){
//        return new Student();
//    }
//    
    interface NestedInterface{
        class Student {
        }
        
        class Professor {
            
        }

        Professor m();
        
    }
}

