import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.List;
public class PuzzleJava{
  public static void greaterTen(int[] array){
    int temp = 0;
    ArrayList<Integer> myArray = new ArrayList<Integer>();
    for(int i=0; i<array.length; i++){
      temp = temp + array[i];
    }
    System.out.println("Sum:" + temp);
    for (int i=0; i<array.length; i++){
      if(array[i] > 10){
        myArray.add(array[i]);
      }
    }
    System.out.println("filtered Array" + myArray);
  }
  public static void printString(String[] array){
    ArrayList<String> myArray = new ArrayList<String>();
    // List<String> hiArray = Arrays.asList(array);
    for(int i=0; i<array.length; i++){
      // myArray.add(array[i]);
    }
    int l = array.length;
    for(int i=0; i<l; i++){
      if(array[i].length() > 5){
        System.out.println("string:" + array[i]);

      }
    }
    Collections.shuffle(myArray);
    System.out.println(myArray);
  }
  // Create an array that contains all 26 letters in the alphabet (this array must have 26 values). Shuffle the array and display the last letter of the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message

  public static void alphaBet(string[] )
}
// public static*************************************


// char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();


char[] charArray = IntStream.rangeClosed('A', 'Z')
    // .mapToObj(c -> "" + (char) c).collect(Collectors.joining()).toCharArray();
