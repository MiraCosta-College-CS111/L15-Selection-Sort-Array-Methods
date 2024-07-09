/********************************************
*	AUTHOR:	<name>
* COLLABORATORS: <names>
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED:	<date>
********************************************/

public class Main 
{
  public static void main(String[] args)
  {
    //INITIALIZATION
    int[] numbers = {23, -5, 17, 0, 12}; //shortcut

    //OUTPUT
    System.out.println(ArrayMethods.arrayString(numbers));
    //System.out.println(numbers);
    System.out.println(ArrayMethods.indexOfMin(numbers, 2));
    
  }
}