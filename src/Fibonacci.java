public class Fibonacci {
  int goTo;
  int prev;
  int prevprev;
  int solution;

  public Fibonacci(int goTo) {
    this.goTo = goTo;
    prev = 1;
    prevprev = 0;
    solution = 0;
  }

  public int CalcToN() {
    //Work through the Fibonacci sequence
    for (int i = 0; i < goTo; i++) {
      solution = prev + prevprev;
      if (i > 0) {
        prevprev = prev;
        prev = solution;
      }
    }
    return solution;
  }
}
