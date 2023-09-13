public class Factorial {
  int start;
  int next;
  int solution;

  public Factorial(int start) {
    this.start = start;
    this.next = start-1;
    this.solution = start;
  }

  public int CalcFactorial() {
    //Calculate the factorial
    while (next != 0) {
      solution = solution * next;
      System.out.println(solution);
      next--;
    }
    return solution;
  }
}
