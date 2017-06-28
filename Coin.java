

public class Coin
{
   private final int HEADS = 0;
   private final int TAILS = 1;

   private int face;


   public Coin ()
   {
      flip();
   }

   public void flip ()
   {
      face = (int) (Math.random() * 2);
   }

   //  Returns true if the current face of the coin is heads.

   public boolean isHeads ()
   {
      return (face == HEADS);
   }

   //  Returns the current face of the coin as a string.

   public String toString()
   {
      String faceName;

      if (face == HEADS)
         faceName = "Heads";
      else
         faceName = "Tails";

      return faceName;
   }
}
