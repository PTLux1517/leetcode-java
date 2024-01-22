import java.time.Duration;
import java.time.Instant;
import java.time.temporal.Temporal;
import java.util.stream.IntStream;

/**
 * Dummy class for other leetcode-style problems
 */
public class P0 {

   int probNum = 0;
   String probName = "Fizzbuzz";


   public void fizzbuzz(int n) {
      IntStream.rangeClosed(1,n)
         .forEach(x -> {
            if (x%15==0) System.out.println("FizzBuzz");
            else if (x%5==0) System.out.println("Buzz");
            else if (x%3==0) System.out.println("Fizz");
            else System.out.println(x);
         });
   }


   public Duration run() {
      /* Provided input */
      int arg1 = 100;

      /* Expected output */
      //none

      /* Computed output with run time */
      Temporal start = Instant.now();
      fizzbuzz(arg1);
      Temporal end = Instant.now();

      /* Problem description with computed output */
      System.out.printf("Problem %d: %s\n", probNum, probName);

      /* Pass/Fail status */
      Utils.printPassFail(true);

      return Duration.between(start,end);
   }
}
