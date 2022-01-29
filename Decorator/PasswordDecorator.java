/**
 * Abstract base class which initializes Password passwordBeginning and
 * passes down abstract method getPassword();
 */
public abstract class PasswordDecorator extends Password {

  /**
   * Password to be acted upon by child classes
   */
  protected Password passwordBeginning;

  /**
   * Default constructor for PasswordDecorator
   * @param passwordBeginning unaltered Password
   */
  public PasswordDecorator(Password passwordBeginning) {
    this.passwordBeginning = passwordBeginning;
  }

  /**
   * Abstracted base class inherited from Password, returns password string
   */
  public abstract String getPassword();

}