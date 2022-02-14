import java.util.ArrayList;

/**
 * Creates and holds PT object, as well as methods for Exercise object
 * @author Chris Moore
 */
public class PT {
  
  private String firstName;
  private String lastName;
  private String bio;
  private Exercise[] exercises;
  private int numExercises = 0;

  /**
   * Constructor for PT
   * @param firstName First name of PT
   * @param lastName Last name of PT
   * @param bio Biogrpahy of PT
   */
  public PT(String firstName, String lastName, String bio) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.bio = bio;
    exercises  = new Exercise[3];
  }

  /**
   * Function for adding exercise to ArrayList
   * @param title Title of exercise
   * @param muscleGroups Muscle groups targeted in exercise
   * @param directions Directions for exercise
   */
  public void addExercise(String title, ArrayList<String> muscleGroups, ArrayList<String> directions) {
    Exercise exercise = new Exercise(title, muscleGroups, directions);
    if (numExercises > 1) {
      growArray(exercises);
      System.out.println(exercises.length);
      exercises[numExercises] = exercise;
    } 
    else {
      exercises[numExercises] = exercise;
      numExercises += 1;
    }
  }

  /**
   * Returns PT's first name
   * @return String firstName
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Returns PT's last name
   * @return String lastName
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Returns PT's bio
   * @return String bio
   */
  public String getBio() {
    return bio;
  }

  /**
   * Creates a new array with doubled length
   * @param exercises Original array
   * @return Array of doubled length
   */
  private Exercise[] growArray(Exercise[] exercises) {
    int length = exercises.length;
    int doubledLength = length * 2;
    Exercise[] arr;
    arr = new Exercise[doubledLength];
    for (int i = 0; i < length; i++) {
      arr[i] = this.exercises[i];
      exercises = arr;
    }
    return exercises;
  }

  /**
   * Iterates array
   * @return ExerciseIterator object
   */
  public ExerciseIterator createIterator() {
    return new ExerciseIterator(exercises);
  }

  /**
   * Prints PT's information to console
   */
  public String toString() {
    String output = "";
    output = getFirstName() + " " + getLastName() + "\n" + getBio() + "\n";
    return output;
  }
}
