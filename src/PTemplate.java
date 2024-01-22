import java.time.Duration;
import java.time.Instant;
import java.time.temporal.Temporal;


public class PTemplate {

   int probNum = 0;
   String probName = "";


   //copy provided method here


   public Duration run() {
      /* Provided input */
      //arg1 =

      /* Expected output */
      //exp =

      /* Computed output with run time */
      Temporal start = Instant.now();
      //sol =
      Temporal end = Instant.now();

      /* Problem description with computed output */
      System.out.printf(
         """               
         Problem %d: %s
         <Description>
         
         Constraints:
         * _
         
         Input:
         Output:
         Expected:
         Explanation:
         """, probNum, probName
      );

      /* Pass/Fail status */
      Utils.printPassFail(false);

      return Duration.between(start,end);
   }
}
