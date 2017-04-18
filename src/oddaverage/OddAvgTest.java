package oddaverage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

/**
 * Created by Viktor on 2017-04-18.
 */
class OddAvgTest {

  ArrayList<Integer> test = new ArrayList<>();
  OddAvg oddAvg = new OddAvg();


  @org.junit.jupiter.api.Test
  void testFirstCase() {
    test.add(1);
    test.add(2);
    test.add(3);
    test.add(4);
    test.add(5);
    assertEquals(3, oddAvg.oddAverage(test));
  }

  @org.junit.jupiter.api.Test
  void testForJustEvenNumbers() {
    test.add(3);
    test.add(3);
    test.add(3);
    test.add(3);
    assertEquals(0, oddAvg.oddAverage(test));
  }

  @org.junit.jupiter.api.Test
  void testCaseTree() {
    test.add(2);
    test.add(2);
    test.add(2);
    test.add(6);
    assertEquals(3, oddAvg.oddAverage(test));
  }
}