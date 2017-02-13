//********************************************************************
//  SquareCalculations.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 2.12
//********************************************************************

import java.util.Scanner;

public class SquareCalculations
{
   //-----------------------------------------------------------------
   //  Computes a square's perimeter and area given the length of
   //  one side.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      int side, perimeter, area;

	  Scanner scan = new Scanner(System.in);

      System.out.print ("Enter the length of a square's side: ");
      side = scan.nextInt();

      perimeter = side * 4;
      area = side * side;

      System.out.println ("Perimeter: " + perimeter);
      System.out.println ("Area: " + area);
   }
}
