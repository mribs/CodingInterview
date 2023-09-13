import java.util.ArrayList;


public class GreatestInteger {
  int greatest;
  ArrayList<Integer> numbers;

  public GreatestInteger(ArrayList<Integer> numbers) {
    this.numbers = numbers;
    this.greatest = 0;
  }
  public int FindGreatestInteger() {
    //Compare every entered number
    for (int number : numbers) {
      if (number > greatest) greatest = number;
    }
    return greatest;
  }

}
