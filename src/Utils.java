public class Utils {

   public static void printPassFail(boolean passCondition) {
      String ANSI_GREEN = "\u001b[32m";
      String ANSI_RED = "\u001b[31m";
      String ANSI_RESET = "\u001b[0m";

      if (passCondition) System.out.println("\n"+ANSI_GREEN+"PASS"+ANSI_RESET);
      else System.out.println("\n"+ANSI_RED+"FAIL"+ANSI_RESET);
   }

}
