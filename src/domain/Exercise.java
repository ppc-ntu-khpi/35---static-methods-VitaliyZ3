package domain;

/**
* A class that represent the exercise
* @author VitaliyZ3
*/
public class Exercise {
   
   /**
    * Searching dividion of six-digit number
    * @param n six-digit number
    * @return string reurn divides of six-digit number
    * @throws java.lang.Exception 
    */
   public static String Calculate(int n) throws Exception{
       
       String result = "";
       
       // check length of number
       int length = (int) (Math.log10(Math.abs(n)) + 1);
       if (length!=6)  throw new Exception("Number `" + String.valueOf(n) + "` is not six-digit");
       for (int i = 1; i <= n; i++)
       {
       if(0 == (n % i))
       result += i+ ",";
       }
       return result;
       
   }

}