

public class Box
{
   private int height, width, depth;
   private boolean full;
   public Box (int heightInit, int widthInit, int depthInit)
   {
      height = heightInit;
      width = widthInit;
      depth = depthInit;
      full = false;
   }

   public int getHeight ()
   {
	   return height;
   }

   public int getWidth ()
   {
	   return width;
   }

   public int getDepth ()
   {
	   return depth;
   }

   public boolean isFull ()
   {
	   return full;
   }

   public void setHeight (int heightUpdate)
   {
      height = heightUpdate;
   }

   public void setWidth (int widthUpdate)
   {
      width = widthUpdate;
   }

   public void setDepth (int depthUpdate)
   {
      depth = depthUpdate;
   }

   public void setFull (boolean fullUpdate)
   {
      full = fullUpdate;
   }

   public String toString ()
   {
      String summary = "Box size: " + height + " H x " + width +
         " W x " + depth + " D";
      summary += "\nThis box is " + ((full) ? "full." : "not full.");
      return summary;
   }
}
