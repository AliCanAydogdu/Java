
import javax.swing.JOptionPane;

class PayCheck
{
   public static void main (String[] args)
   {
       String hoursStr, rateStr, result;
       double hours, rate, pay;
       int again;

      do
      {
         hoursStr = JOptionPane.showInputDialog ("Enter hours worked: ");
         hours = Double.parseDouble(hoursStr);

         rateStr = JOptionPane.showInputDialog ("Enter hourly rate: ");
         rate = Double.parseDouble(rateStr);

	 if (hours > 40)
	     pay = 40 * rate + (hours-40) * rate * 1.5;
	 else
	     pay = hours * rate;

         result = "Gross pay is " + pay;

         JOptionPane.showMessageDialog (null, result);

         again = JOptionPane.showConfirmDialog (null, "Do Another?");
      }
      while (again == JOptionPane.YES_OPTION);
   }
}
