/**
 * Child class of Car, creates a luxury car
 * @author Chris Moore
 */
public class LuxuryCar extends Car {

  /**
   * Constructor for SedanCar, calls superclass Car();
   * @param make Make of car
   * @param model Model of car
   */
  LuxuryCar(String make, String model) {
    super(make, model);
    System.out.println("Creating a " +make+ " " +model);
  }

  /**
   * Abstracted from Car, prints adding of frame to console
   */
  protected void addFrame() {
    System.out.println("Adding a beautiful frame");
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
    accessories.add(Accessories.SPORTS_SEATS);
    accessories.add(Accessories.WINDOW_TINT);
    accessories.add(Accessories.HIGH_END_SOUND);
    accessories.add(Accessories.TRUNK_ORGANIZER);
    accessories.add(Accessories.BLUE_TOOTH);

  }

  /**
   * Overridden from Car, displays adding of engine to console
   */
  @Override
  protected void addEngine() {
    System.out.println("Adding a souped up engine");
  }

}
