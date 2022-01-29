/**
 * Abstract base class that initializes the string password and passes on the abstracted
 * method getPassword();
 */
public abstract class Password {

  /**
   * String that stores the password throughout the program
   */
  protected String password;

  /**
   * Abstracted to child classes, getter for string password
   * @return string password
   */
  public abstract String getPassword();
  
}
