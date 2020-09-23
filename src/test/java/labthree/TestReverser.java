package labthree;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import labthree.Reverser;
import labthree.Sentence;
import org.junit.Test;

/**
 * A JUnit test suite for the reverser.
 *
 * @author Janyl Jumadinova
 */

public class TestReverser {

  /** The maximum number of items to use for testing. */
  private static int MAXIMUM_NUMBER_ITEMS = 100;

  @Test
  public void testSentenceReversalWithOneSentence() {
    Sentence sentence = new Sentence("Hello there!");
    Sentence[] originalArray = {sentence};
    Sentence[] reversedArray = Reverser.reverse(originalArray.clone());
    assertArrayEquals(reversedArray, originalArray);
  }

  @Test
  public void testSentenceReversalWithOneInteger() {
    Integer[] originalArray = {new Integer(100)};
    Integer[] reversedArray = Reverser.reverse(originalArray.clone());
    assertArrayEquals(reversedArray, originalArray);
  }

  @Test
  public void testSentenceReversalWithTwoIntegers() {
    Integer[] originalArray = {new Integer(100), new Integer(150)};
    Integer[] reversedArray = Reverser.reverse(originalArray.clone());
    for (int i = 0; i < originalArray.length; i++) {
      assertEquals(reversedArray[i], originalArray[originalArray.length - i - 1]);
    }
  }

  @Test
  public void testSentenceReversalWithTwoSentences() {
    Sentence[] originalArray = {new Sentence("Hi!"), new Sentence("Hello!")};
    Sentence[] reversedArray = Reverser.reverse(originalArray.clone());
    for (int i = 0; i < originalArray.length; i++) {
      assertEquals(reversedArray[i], originalArray[originalArray.length - i - 1]);
    }
  }

  @Test
  public void testSentenceReversalWithManySentences() {
    Sentence[] originalArray = new Sentence[MAXIMUM_NUMBER_ITEMS];
    for (int i = 0; i < originalArray.length; i++) {
      originalArray[i] = new Sentence("Hello " + i);
    }
    Sentence[] reversedArray = Reverser.reverse(originalArray.clone());
    for (int i = 0; i < originalArray.length; i++) {
      assertEquals(reversedArray[i], originalArray[originalArray.length - i - 1]);
    }
  }

  @Test
  public void testIntegerReversalWithManyIntegers() {
    Integer[] originalArray = new Integer[MAXIMUM_NUMBER_ITEMS];
    for (int i = 0; i < originalArray.length; i++) {
      originalArray[i] = new Integer(i);
    }
    Integer[] reversedArray = Reverser.reverse(originalArray.clone());
    for (int i = 0; i < originalArray.length; i++) {
      assertEquals(reversedArray[i], originalArray[originalArray.length - i - 1]);
    }
  }

}
