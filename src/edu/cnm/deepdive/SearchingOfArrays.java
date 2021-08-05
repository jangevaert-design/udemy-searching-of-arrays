package edu.cnm.deepdive;

import java.util.Arrays;

public class SearchingOfArrays {

  public static void main(String[] args) {

    int[] numbers = {1, 3, 5, 6, 7};
    System.out.println(Arrays.binarySearch(numbers, 2));//prints -2. Negative means that 2 is not
    // found and 2 should be inserted before index 2 (where 3 is)
    System.out.println(Arrays.binarySearch(numbers, 5));//prints 2 (index 2)
    System.out.println(Arrays.binarySearch(numbers, 7)); //prints 4
    System.out.println(Arrays.binarySearch(numbers, 1));// prints 0
    System.out.println(Arrays.binarySearch(numbers, 3));//prints 1
    System.out.println(Arrays.binarySearch(numbers, 6));//prints 3
    System.out.println(Arrays.binarySearch(numbers, 4));//prints -3. Negative means that 4 is not
    // found and 4 should be inserted before index 3 (where 5 is)

    //non sorted arrays gives an unpredictable outcome.

    System.out.println();
    int[] notSortedNumbers = {5, 4, 10, 8, 6};
    System.out.println(Arrays.binarySearch(notSortedNumbers, 5));
    System.out.println(Arrays.binarySearch(notSortedNumbers, 8));
    //prints 0 en -3 as unpredictable outcome.

    System.out.println();
    Arrays.sort(notSortedNumbers);
    System.out.println(Arrays.toString(notSortedNumbers));//prints [4, 5, 6, 8, 10]
    System.out.println(Arrays.binarySearch(notSortedNumbers, 5));//prints 1
    System.out.println(Arrays.binarySearch(notSortedNumbers, 8));//prints 3
  }

}
