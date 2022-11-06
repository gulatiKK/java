import java.util.*;
public class Main
{
    public static void main(String[] args){
        int mouseX;
        int mouseY;
        int currentSquare;

        Scanner scan = new Scanner (System.in);
        System.out.println("What is mouseX?");
        mouseX = scan.nextInt();
        System.out.println("What is mouseY?");
        mouseY = scan.nextInt();

        if (mouseX < 200 && mouseY < 200)
{
  currentSquare = 1
}
else
{
  if (mouseX > 200 && mouseY < 200)
  {
    currentSquare = 4;
  }
  else
  {
    if (mouseX < 200 && mouseY > 200)
    {
      currentSquare = 2;
    }
    else
    {
      if (mouseX > 200 && mouseY > 200)
      {
        currentSquare = 3;
      }
    }
  }
}
    }
}