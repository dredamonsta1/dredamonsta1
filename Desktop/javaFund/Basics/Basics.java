import java.util.ArrayList;
public class Basics {
  public static void iterateArray(){
    int i = 0;
    while(i <= 255){
      System.out.println(i);
      i++;
    }
  }
  public static void oddNumbers(){
    int i = 1;
    while(i <= 255){
      if(i % 3 == 0){
        System.out.println(i);
      }
      i++;
    }
  }
  public static void sum(int num1, int num2){
    int sum = 0;
    int i = num1;       // i = 2
    while(i <= num2){   // while(2 <= 255)
      sum = sum + i;    // sum = 1 + 2
                       // New # = 1, sum = 1
      System.out.println("New number:" + i + "Sum" + sum);
      i++;             // 2++
    }
  }
  public static void printArray(){
    int[] myArray = {1,3,5,7,9,13};
    for (int i=0; i < myArray.length;i++){
      System.out.println(myArray[i]);
    }
  }
  public static void findMax(){
    int[] myArray =  {-3,5,2,3-7};
    int max = myArray[0];
    for(int i=1;i<myArray.length;i++){
      if(myArray[i] > max){   //if(arr[i] > arr[0] ) if(5 > -3)
        max = myArray[i];     // max = 5
      }
    }
    System.out.println(max);
  }
  public static void getAvg(){
    int[] myArray = {2,10,3};
    int sum = 0;
    for(int i = 0;i<myArray.length;i++){
      sum = sum + myArray[i];
    }
    System.out.println(sum/myArray.length);
  }
  public static void greaterY(){
    int[] myArray = {1,3,5,7,100,-100};      // myArray = [1,3,5,7]
    int y = 3;                      // y = 3
    for(int i=0;i<myArray.length;i++) // i=3;3<4;3++
      if(myArray[i] > y){             // if(7 > 3)
          y = myArray[i];          // 7 = 7
      }
      System.out.println(y);      // console.log(7)
  }
}

// class Basics {
//     public static void main(String[] args){
//          for(int i=1; i<11; i++){
//               System.out.println("Count is: " + i);
//          }
//     }
// }
//
//
// class EnhancedForDemo {
//     public static void main(String[] args){
//          int[] numbers =
//              {1,2,3,4,5,6,7,8,9,10};
//          for (int item : numbers) {
//              System.out.println("Count is: " + item);
//          }
//     }
// }




import java.util.ArrayList;
import java.util.Arrays;
public class BasicJava {
  public static void iterateArray(){
    int i = 0;
    while(i <= 255){
      System.out.println(i);
      i++;
    }
  }
  public static void oddNumbers(){
    int i = 1;
    while(i <= 255){
      if(i % 3 == 0){
        System.out.println(i);
      }
      i++;
    }
  }
  public static void sum(int num1, int num2){
    int sum = 0;
    int i = num1;       // i = 2
    while(i <= num2){   // while(2 <= 255)
      sum = sum + i;    // sum = 1 + 2
                       // New # = 1, sum = 1
      System.out.println("New number:" + i + "Sum" + sum);
      i++;             // 2++
    }
  }
  public static void printArray(){
    int[] myArray = {1,3,5,7,9,13};
    for (int i=0; i < myArray.length;i++){
      System.out.println(myArray[i]);
    }
  }
  public static void findMax(){
    int[] myArray =  {-3,5,2,3-7};
    int max = myArray[0];
    for(int i=1;i<myArray.length;i++){
      if(myArray[i] > max){   //if(arr[i] > arr[0] ) if(5 > -3)
        max = myArray[i];     // max = 5
      }
    }
    System.out.println(max);
  }
  public static void getAvg(){
    int[] myArray = {2,10,3};
    int sum = 0;
    for(int i = 0;i<myArray.length;i++){
      sum = sum + myArray[i];
    }
    System.out.println(sum/myArray.length);
  }
  public static void greaterY(){
    int[] myArray = {1,3,5,7,100,-100};      // myArray = [1,3,5,7]
    int y = 3;                      // y = 3
    for(int i=0;i<myArray.length;i++) // i=3;3<4;3++
      if(myArray[i] > y){             // if(7 > 3)
          y = myArray[i];          // 7 = 7
      }
      System.out.println(y);      // console.log(7)
  }
  public static void squareValues(){
    int[] x ={1,5,10,-2};              // x = [1,5,10,-2]
    for(int i=0;i<x.length;i++)       // i = 1;1<4;1++
      x[i] = x[i] * x[i];             // x[1] = 5 * 5 = 25
      System.out.println(Arrays.toString(x));
  }
  public static void eliminateNeg(){
    int[] x = {1,5,10,-2,-1000};          //x = [1,5,10,-2] => [1,5,10,0]
    for(int i=0;i<x.length;i++){    //i = 3; 3 < 4; 3++
      if(x[i] < 0){                 // -2 < 0
        x[i] = 0;                   // -2 = 0
      }
    }
    System.out.println(Arrays.toString(x));
  }
  public static void maxminAvg(){
    int[] x = {1,5,10,-2,100,-1};       //x = [1,5,10,-2];
    int max = x[0];                     // max = 10
    int min = x[0];
    int sum = 0;
    for(int i=0;i<x.length;i++){        // i = 2; 2<4; 2++
      if(max < x[i]){                   // 1 < 10,-2
        max = x[i];                     // max = 10
      }
      if(min > x[i]){
        min = x[i];
      }
      sum = sum + x[i];                 // sum =
    }
    System.out.println("Max:" + max + "Min:" + min + "Avg:" + sum/x.length);
  }
  public static void shiftArray(){      // x = [5,10,7,-2,0]
    int[] x = {1,5,10,7,-2};            // x = [1,5,10,7,-2]
    for(int i=0;i<x.length;i++){        // i = 4; 4<5; 4++
      x[i] = x[i+1];                    // x[4] = x[5] = 0
      System.out.println(Arrays.toString(x));
    }
  }
}
