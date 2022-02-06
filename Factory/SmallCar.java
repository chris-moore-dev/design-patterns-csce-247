/**
 * Child class of Car, creates a small car
 * @author Chris Moore
 */
public class SmallCar extends Car {

  /**
   * Constructor for SmallCar, calls superclass Car();
   * @param make Make of car
   * @param model Model of car
   */
  SmallCar(String make, String model) {
    super(make, model);
    System.out.println("Creating a " +make+ " " +model);
  }

  /**
   * Abstracted from Car, prints adding of frame to console
   */
  protected void addFrame() {
    System.out.println("Adding a small frame");
  }

  /**
   * Abstracted from Car, adds accessories from enum Accessories
   */
  protected void addAccessories() {
    accessories.add(Accessories.FLOOR_MATTS);
    accessories.add(Accessories.PHONE_CHARGER);
  }

}
