import java.util.ArrayList;

/**
 * Contains methods for assembly of Car object
 * @author Chris Moore
 */
public abstract class Car {
  private String make;
  private String model;
  protected ArrayList<Accessories> accessories = new ArrayList<Accessories>();

  /**
   * Constructor for Car, is called as superclass by children;
   * @param make Make of car
   * @param model Model of car
   */
  public Car(String make, String model) {
    this.make = make;
    this.model = model;
  }

  /**
   * Calls related methods for assembly of Car object
   */
  public void assemble() {
    addFrame();
    addWheels();
    addEngine();
    addWindows();
    addAccessories();
    displayAccessories();
  }

  /**
   * Abstracted method, prints adding of frame to console
   */
  protected abstract void addFrame();

  /**
   * Prints adding of wheels to console
   */
  protected void addWheels() {
    System.out.println("Adding the wheels");
  }

  /**
   * Prints adding of engine to console
   */
  protected void addEngine() {
    System.out.println("Adding a standard engine");
  }

  /**
   * Prints adding of windows to console
   */
  protected void addWindows() {
    System.out.println("Adding windows");
  }

  /**
   * Abstracted method, prints adding of accessories to console
   */
  protected abstract void addAccessories();

  /**
   * Loops through ArrayList "accessories" and prints added accessories to console
   */
  protected void displayAccessories() {
    System.out.println("Accessories:");
    for(int i = 0; i < accessories.size(); i++) {
      System.out.println("-" + accessories.get(i).toString());
    }
  }
}
