/********************************************
*	AUTHOR:	<name>
* COLLABORATORS: <names>
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED: <date>
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
  /** Convert array to a readable string */
  public static String arrayString(int[] a)
  {
    String result = "{ ";

    for (int i = 0; i < a.length; i++) {
      result += a[i];
      if (i < a.length - 1) {
        result += ", ";
      }
    }

    return result + " }";
  }
  
  /**: Swap two elements in an array */
  public static void swap(int[] array, int a, int b)
  {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
    
  /** Return index of minimum value starting at startIndex */
  public static int indexOfMin(int[] array, int startIndex)
  {
    int minIndex = startIndex;

    for (int i = startIndex + 1; i < array.length; i++) {
      if (array[i] < array[minIndex]) {
        minIndex = i;
      }
    }

    return minIndex;
  }

  /** Reverse array using swap() */
  public static void reverse(int[] array)
  {
    int left = 0;
    int right = array.length - 1;

    while (left < right) {
      swap(array, left, right);
      left++;
      right--;
    }
  }

  /** Selection Sort using indexOfMin() and swap() */
  public static void selectionSort(int[] array)
  {
    for (int i = 0; i < array.length - 1; i++) {
      int minIndex = indexOfMin(array, i);
      swap(array, i, minIndex);
    } 
  }
}
