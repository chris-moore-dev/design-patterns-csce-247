import java.util.Random;

/**
 * Alters passwordBeginning by randomly switching letter casing
 */
public class RandomCasing extends PasswordDecorator {

  /**
   * Default constructor for RandomCasing
   * @param passwordBeginning unaltered password
   */
  public RandomCasing(Password passwordBeginning) {
    super(passwordBeginning);
    password = passwordBeginning.getPassword();
  }

  /**
   * Loops through the array and changes to lowercase 50% of the time
   * and uppercase 50% of the time
   */
  public String getPassword() {
    StringBuilder str = new StringBuilder(password);
    for(int i = 0; i < str.length(); i++)
    {
      Random rand = new Random();
      int val = rand.nextInt(101);
      if(val <= 50) {
        str.setCharAt(i, Character.toLowerCase(password.charAt(i)));
      }
      if(val > 51) {
        str.setCharAt(i, Character.toUpperCase(password.charAt(i)));
      }
    }
    password = str.toString();
    return password;
  }
  // I got my usage for StringBuilder from Geeks for Geeks 
  // (https://www.geeksforgeeks.org/replace-a-character-at-a-specific-index-in-a-string-in-java/)
}
