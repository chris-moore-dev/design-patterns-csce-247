/**
 * Creates an object of type Car and calls on Car methods to return modified Car
 * @author Chris Moore
 */
public class CarFactory {
  
  /**
   * Instantiates new Car object, and calls specified subclass based on passed-in type parameter
   * @param type Type of car
   * @param make Make of car
   * @param model Model of car
   * @return modified Car object
   */
  public static Car createCar(String type, String make, String model) {
    if(type.equalsIgnoreCase("small")) {
      Car car = new SmallCar(make, model);
      car.assemble();
      return car;
    }
    else if (type.equalsIgnoreCase("sedan")) {
      Car car = new SedanCar(make, model);
      car.assemble();
      return car;
    }
    else if (type.equalsIgnoreCase("luxury")) {
      Car car = new LuxuryCar(make, model);
      car.assemble();
      return car;
    }
    return null;
  }
}