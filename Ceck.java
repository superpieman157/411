
public class Ceck
{
    public static void main(String[] args)
    {
     String[][] board = new String [8][8];
     
     for (int i = 0; i< board.length; i++)
     {
         int countWhite = 0;
         int count = 0;
         for (int j = 0; j < board.length; j++)
         {
             count++;
      if (i % 2 == 1 && j % 2 == 0 || i % 2 == 0 && j % 2 == 1 )
      {
          if (countWhite >= 5)
          {
           System.out.print(" WC ");   
          }
          else
          System.out.print( " W " );
      }
      else if((j%2) != (i%2))
      {
      System.out.print(" BC ");
      countWhite++;
      }
      else
      System.out.print( " B " );
      if (count == 8)
      {
          System.out.print(" \n");
      }
     }
    }
    }
}
// tried adding another if statement outside the others
// tried adding an if count == number statement
// tried making the row turn certain letters to checkers
// tried nested if statement, put it the wrong place