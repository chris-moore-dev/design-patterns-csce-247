/**
 * Alters passwordBeginning by replacing letters with symbols
 */
public class Symbols extends PasswordDecorator {
  
  /**
   * Default constuctor for Symbols
   * @param passwordBeginning unaltered password
   */
  public Symbols(Password passwordBeginning) {
    super(passwordBeginning);
    password = passwordBeginning.getPassword();
  }

  /**
   * Replaces predefined letters with set symbols/numbers
   */
  public String getPassword() {
    password = password.replaceAll("(?i)a", "@");
    password = password.replaceAll("(?i)b", "8");
    password = password.replaceAll("(?i)e", "3");
    password = password.replaceAll("(?i)g", "9");
    password = password.replaceAll("(?i)i", "!");
    password = password.replaceAll("(?i)o", "0");
    password = password.replaceAll("(?i)s", "\\$");
    password = password.replaceAll("(?i)t", "7");
    return password;
  }

}
