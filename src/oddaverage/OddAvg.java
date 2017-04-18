package oddaverage;

import java.util.ArrayList;

/**
 * Created by Viktor on 2017-04-18.
 */
public class OddAvg {

  public static void main(String[] args) {

  }

  public double oddAverage(ArrayList<Integer> inputList) {
    double returnAvarge = 0;
    int sum = 0;
    ArrayList<Integer> theListToWorkWith = inputList;
    ArrayList<Integer> oddNumbersList = new ArrayList<>();

    for (int oddNumbers : theListToWorkWith)
    if (oddNumbers % 2 == 1) {
      oddNumbersList.add(oddNumbers);
    }
    for (int i = 0; i <oddNumbersList.size() ; i++) {
      sum += oddNumbersList.get(i);
      returnAvarge = sum / oddNumbersList.size();
    }
    return returnAvarge;
  }

}
// Create a function called `oddAverage` that takes a list of numbers as parameter
// and returns the average value of the odd numbers in the list
// Create basic unit tests for it with at least 3 different test cases
