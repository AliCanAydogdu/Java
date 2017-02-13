//********************************************************************
//  MoneyConversion.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 2.11
//********************************************************************

import java.util.Scanner;

public class MoneyConversion
{
   //-----------------------------------------------------------------
   //  Reads a monetary amount and computes the equivalent in bills
   //  and coins.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      double total;
      int tens, fives, ones, quarters, dimes, nickels;
      int remainingCents;

	  Scanner scan = new Scanner(System.in);

      System.out.print ("Enter monetary amount: ");
      total = scan.nextDouble();

      remainingCents = (int) (total * 100);

      tens = remainingCents / 1000;
      remainingCents %= 1000;
      fives = remainingCents / 500;
      remainingCents %= 500;
      ones = remainingCents / 100;
      remainingCents %= 100;
      quarters = remainingCents / 25;
      remainingCents %= 25;
      dimes = remainingCents / 10;
      remainingCents %= 10;
      nickels = remainingCents / 5;
      remainingCents %= 5;

      System.out.println ("That's equivalent to:");
      System.out.println (tens + " ten dollar bills");
      System.out.println (fives + " five dollar bills");
      System.out.println (ones + " one dollar bills");
      System.out.println (quarters + " quarters");
      System.out.println (dimes + " dimes");
      System.out.println (nickels + " nickels");
      System.out.println (remainingCents + " pennies");
   }
}
