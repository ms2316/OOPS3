import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {
  
  public static void main(String[] args) {
    List<Car> list = new ArrayList<Car>();
    list.add( new Car("b", 2) );
    list.add( new Car("b", 1) );
    list.add( new Car("a", 0) );
    list.add( new Car("a", 10) );
    list.add( new Car("aaaa", 10) );
    Collections.sort(list, new CarComparator() );
    System.out.println(list);
  }

}