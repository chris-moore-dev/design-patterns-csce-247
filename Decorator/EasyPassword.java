import java.util.Random;

/**
 * Creates an EasyPassword that slightly modifies a phrase by adding a random number to the end
 */
public class EasyPassword extends Password {

  /**
   * Removes all spaces and concatenates a random number to the end of phrase
   * @param phrase password passed in via user input
   */
  public EasyPassword(String phrase) {
    password = phrase;
    password = password.replaceAll(" ", "");
    Random rand = new Random();
    int val = rand.nextInt(100);
    String valStr = String.valueOf(val);
    password = password.concat(valStr);
  }


  /**
   * Returns password string
   */
  public String getPassword() {
    return password;
  }
}
