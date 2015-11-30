import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
  @Override
  public int compare(Car a, Car b) {
    int first = (a.getManufacturer()).compareTo( b.getManufacturer());
    if (first != 0)
      return first;
    else return (a.getAge() - b.getAge());
  }
}