package labthree;

/**
 * Provides a generic method for reversing an array.
 *
 * @author Janyl Jumadinova
 * @author Add Your Name Here
 */

public class Reverser {

  /** The maximum number of items to use for output. */
  private static int MAXIMUM_NUMBER_ITEMS = 5;

  /**
   * Reverse the provided array, for any data type.
   *
   * @param data the array to be reversed
   *
   * @author Janyl Jumadinova
   */
  public static <T> T[] reverse(T[] data) {
    // TODO: Add a complete implementation of this method,
    // using the source code provided on page 95 of the textbook.
    // Please bear in mind that the source code in the textbook
    // may not correctly adhere to all modern Java programming standards
    return null;
  }

  /**
   * The starting point for reversing an array.
   *
   * @param args The command-line arguments
   *
   * @author Janyl Jumadinova
   * @author Add Your Name Here
   */
  public static void main(String[] args) {
    // create the array of Sentence objects
    Sentence[] originalArray = new Sentence[MAXIMUM_NUMBER_ITEMS];
    for (int i = 0; i < originalArray.length; i++) {
      originalArray[i] = new Sentence("Sentence " + i);
    }
    // TODO: display the Sentences before reversal

    // TODO: perform the reversal generically, using the reverse method

    // TODO: display the Sentences after reversal

    // TODO: create the array of Integer objects

    // TODO: display the Integers before reversal

    // TODO: perform the reversal generically, using the reverse method

    // TODO: display the Integers after reversal

    // TODO: display a final diagnostic message

  }

}
