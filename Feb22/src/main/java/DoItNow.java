import scala.Tuple2;

import java.util.Date;

interface X { 
    }
    
    class Y implements X{
    
    }
    
    class Z implements X {
    
    }
public class DoItNow {
    public static void main(String[] args) {
        X variable = new Y();
        variable = new Z();
        Bike someBike = new CrazyBike();
        someBike = new Mountain();
        
        //create class anynonymous that implements Bike and we define all behaviors for this class
        Bike bike = new Bike(){
            //please explain why I cannot declare an interface here
            interface Human {
                void eat();
            }
            Bike anotherbike = new Bike() {
                Human h = new Human() {
                    @Override
                    public void eat() {
                        System.out.println(bike);
                    }
                };
                @Override
                public Tuple2<Integer, Integer> shiftGears(int gear) {
                    return null;
                }

                @Override
                public Boolean applyBreaks() {
                    return null;
                }

                @Override
                public Boolean headLights(Date timeofDay) {
                    return null;
                }
            };
            @Override
            public Tuple2<Integer, Integer> shiftGears(int gear) {
                return null;
            }

            @Override
            public Boolean applyBreaks() {
                return null;
            }

            @Override
            public Boolean headLights(Date timeofDay) {
                return null;
            }
        };
    }
}
