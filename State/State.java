/**
 * Interface for abstracted button methods
 * @author Chris Moore
 */
public interface State {
  /**
   * Abstracted button method for calling "Twinkle Twinkle Little Star"
   */
  public void pressStarButton();

  /**
   * Abstracted button method for calling "If You're Happy and You Know It"
   */
  public void pressHappyButton();

  /**
   * Abstracted button method for switching mode to English
   */
  public void pressEnglishButton();

  /**
   * Abstracted button method for switching mode to French
   */
  public void pressFrenchButton();

  /**
   * Abstracted button method for switching mode to Spanish
   */
  public void pressSpanishButton();
}
