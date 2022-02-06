/**
 * Child class of Car, creates a sedan car
 * @author Chris Moore
 */
public class SedanCar extends Car {

  /**
   * Constructor for SedanCar, calls superclass Car();
   * @param make Make of car
   * @param model Model of car
   */
  SedanCar(String make, String model) {
    super(make, model);
    System.out.println("Creating a " +make+ " " +model);
  }

  /**
   * Abstracted from Car, prints adding of frame to console
   */
  protected void addFrame() {
    System.out.println("Adding a three-part frame");
  }

  /**
   * Abstracted from Car, adds accessories from enum Accessories
   */
  protected void addAccessories() {
    accessories.add(Accessories.FLOOR_MATTS);
    accessories.add(Accessories.PHONE_CHARGER);
    accessories.add(Accessories.BACK_UP_CAMERA);
    accessories.add(Accessories.EXTRA_CUP_HOLDERS);
    accessories.add(Accessories.HEATED_SEATS);
  }
}
