

import java.util.Random;

public class PhoneNumbers
{

   public static void main (String[] args)
   {
      String result = "";

      Random rand = new Random();

      //  The first three digits are 0-7.
      result += rand.nextInt(8);
      result += rand.nextInt(8);
      result += rand.nextInt(8);

      result += "-";

      //  The next set of digits cannot be greater than 742.
      result += rand.nextInt(643) + 100;

      result += "-";

      //  The last four digits are unrestricted.
      result += rand.nextInt(10);
      result += rand.nextInt(10);
      result += rand.nextInt(10);
      result += rand.nextInt(10);

      System.out.println ("A random phone number: " + result);
   }
}
