/********************************************
*	AUTHOR:	Catherine Walker
* COLLABORATORS: Catherine's Room
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED:04/12/2021
********************************************/

/********************************************
*	ArrayMethods
*********************************************
*	PROGRAM DESCRIPTION:
*	Collection of useful methods for int arrays.
*********************************************
*	ALGORITHM:
*	TODO: <Pseudocode for selection sort here>
*********************************************

/* UML CLASS DIAGRAM:
-----------------------------------------
ArrayMethods
-----------------------------------------
-----------------------------------------
+ arrayString(array : int[]) : String //static
+ swap(array : int[], a : int, b : int) : void //static
+ indexOfMin(array : int[], startIndex : int) : int //static
+ reverse(array : int[]) : void //static
+ selectionSort(array : int[]) : void //static
-----------------------------------------
*/

public class ArrayMethods
{
  /**DESCRIPTION: Creates a string of an array as a horizontal list, separated by commas and enclosed with curly brackets.*/
  public static String arrayString(int[] a)
  {
    String result;
    result = "{ ";
    for(int index = 0;index<a.length-1;index++)
    {
      result = result + a[index] + ", "; //concatenate value at indexed variable onto existing string
    }
    result += a[a.length-1] + " }"; //last indexed variable and bracket at end
    return result;
  }
  
  /** DESCRIPTION: Swaps the two elements in the given array at the given indexes. */
  public static void swap(int[] array, int a, int b)
  {
    int temp;
    temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
	
  /** DESCRIPTION: Determines the index of the minimum value of an int array.*/
  public static int indexOfMin(int[] array, int startIndex)
  {
    int indexOfMin;
    //set to first index of unsorted array
    indexOfMin = startIndex;
    //loop through each index of unsorted array
    for(int currentIndex = startIndex+1; currentIndex<array.length; currentIndex++)
    {
      if(array[currentIndex] < array[indexOfMin])
      {
        indexOfMin = currentIndex; //change min
      }
      //indexOfMin = (array[currentIndex] < array[indexOfMin])? currentIndex : indexOfMin;
    }
    return indexOfMin;
  }

  public static void reverse(int[] array)
  {
    // //example: {5, 6, 7, 8} --> {8, 7, 6, 5}
    // swap(array,0,3); // {8, 6, 7, 5}
    // swap(array,1,2); // {8, 7, 6, 5}

    // //example: {12, 0, 5, 9, 2} --> {2, 9, 5, 0, 12}
    // swap(array,0,4); // {2, 0, 5, 9, 12}
    // swap(array,1,3); // {2, 9, 5, 0, 12}

    // //example: {4, 78, 2, 54, -9, 5} . swap 3 times
    // swap(array,0,5);
    // swap(array,1,4);
    // swap(array,2,3);

    // loop through first half of array
    for(int i = 0; i < array.length / 2; i++)
    {
      swap(array,i,array.length-1-i);
    }
  }


  public static void selectionSort(int[] array)
  {
    int indexOfMin;
    //loop through array from index 0 to the last index
    for(int marker = 0; marker < array.length-1; marker++)
    {
      // find the index of the minimum of the unsorted part of the array
      indexOfMin = indexOfMin(array, marker);
      // swap element at marker with element at minimum value index
      swap(array, marker, indexOfMin);
    }
  }

}