package test;
import static domain.Exercise.Calculate;
/**
 * Test of a class that calculates the second largest number 
 * @author asus
 */

public class TestResult {
  public static void main(String[] args) {
     int[] array ={15, 68, 7, 3, 45, 6, 31};
         System.out.println("Result: "+Calculate(array));
}
}