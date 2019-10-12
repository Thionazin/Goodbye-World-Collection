import java.io.*; 

public class goodbyeWorld
{
  public static void main(String[] args)
  {
    File file = new File("./goodbyeWorld.java");
    System.out.println("Goodbye World!");
    if(file.delete())
    {
      System.out.println("Goodbye....");
    }
    else
    {
      System.out.println("Failed again.... :(");
    }
  }
}