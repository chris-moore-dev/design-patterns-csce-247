import java.util.Random;
import java.util.ArrayList;

/**
 * Alters passwordBeginning by inserting special characters
 */
public class SpecialChars extends PasswordDecorator {
  
  /**
   * Default constructor for SpecialChars
   * @param passwordBeginning unaltered password
   */
  public SpecialChars(Password passwordBeginning) {
    super(passwordBeginning);
    password = passwordBeginning.getPassword();
  }

  /**
   * Gives a 30% chance to add a random special character after
   * each element of the array, returns password string
   */
  public String getPassword() {
    ArrayList<Character> arr = new ArrayList<Character>();
    for(int i = 0; i < password.length(); i++) {
      arr.add(password.charAt(i));
    }
    int temp = arr.size();
    for(int i = 0; i < temp; i++)
    {
      Random rand = new Random();
      int val = rand.nextInt(101);
      if(val <= 30) {
        Random rand2 = new Random();
        int symbol = rand2.nextInt(7);
        switch (symbol) {
          case 0:
            arr.add(i, '*');
          case 1:
            arr.add(i, '!' );
          case 2:
            arr.add(i, '%');
          case 3:
            arr.add(i, '+');
          case 4:
            arr.add(i, '.');
          case 5:
            arr.add(i, '{');
          case 6:
            arr.add(i, '}');
        }
        i++;
      }
    }
    StringBuilder strBuilder = new StringBuilder();
    for (Character ch : arr) {
      strBuilder.append(ch);
    }
    password = strBuilder.toString();
    return password;
  }
  
}
