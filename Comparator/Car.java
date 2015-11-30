public class Car {

  private String manufacturer;  
  private int age;
  
  public Car(String manufacturer, int age) {
    this.manufacturer = manufacturer;
    this.age = age;
  }
  
  @Override
  public String toString() {
    return (manufacturer + " " + age);
  
  }
  
  public int getAge() { return age; }
  public String getManufacturer() { return manufacturer; }
}