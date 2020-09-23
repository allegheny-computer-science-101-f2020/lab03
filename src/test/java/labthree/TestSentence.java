package labthree;

import static org.junit.Assert.assertEquals;

import labthree.Sentence;
import org.junit.Test;

/**
 * A JUnit test suite for the Sentence class.
 *
 * @author Janyl Jumadinova
 */

public class TestSentence {

  @Test
  public void testFirstSentenceHasCorrectSentence() {
    Sentence.resetId();
    Sentence sentence = new Sentence("Hello there!");
    assertEquals(sentence.getSentence(), "Hello there!");
  }

  @Test
  public void testFirstSentenceHasFirstIdentifier() {
    Sentence.resetId();
    Sentence sentence = new Sentence("Hello there!");
    assertEquals(sentence.getId(), 0);
  }

  @Test
  public void testTwoSentencesHaveCorrectIdentifiers() {
    Sentence.resetId();
    Sentence sentence = new Sentence("Hello there!");
    Sentence sentenceAgain = new Sentence("Hello there again!");
    assertEquals(sentence.getId(), 0);
    assertEquals(sentenceAgain.getId(), 1);
  }

}
