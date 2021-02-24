import org.w3c.dom.ranges.Range;
import scala.Int;
import scala.Tuple2;

import java.util.Date;

public interface Bike {
//    boolean headlight = false;
    Tuple2<Integer, Integer> shiftGears(int gear);
    Boolean applyBreaks();
    Boolean headLights(Date timeofDay);
//    oneWheeling
}

//interface Motorcycle implements Bike{
//    
//}
