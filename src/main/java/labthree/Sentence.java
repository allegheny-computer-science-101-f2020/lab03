package labthree;

/**
 * This class represents a sentence with a unique identifier.
 *
 * <p>Bugs: This class has no known bugs.
 *
 * @author Janyl Jumadinova
 */

public class Sentence {

  /** The unique identifier for the Sentence. */
  private int id;

  /** The next identifier to be assigned to a Sentence. */
  private static int nextId = 0;

  /** The textual content of the sentence. */
  private String sentence;

  /**
   * The constructor sets the text and gives a new unique identifier.
   *
   * @param sentence the sentence that will be stored in a Sentence
   */
  public Sentence(String sentence) {
    id = nextId;
    nextId++;
    this.sentence = sentence;
  }

  /** Access the unique identifier for the sentence.
   *
   * @return the int identifier for the Sentence
   */
  public int getId() {
    return id;
  }

  /** Reset the identifier starting point. */
  public static void resetId() {
    nextId = 0;
  }

  /** Access the textual content of the Sentence.
   *
   * @return the string of the Sentence
   */
  public String getSentence() {
    return sentence;
  }

  /** Return a complete textual representation of the sentence.
   *
   * @return a string containing the Sentence and its id
   */
  public String toString() {
    return new String("(" + id + ", " + sentence + ")");
  }

}
