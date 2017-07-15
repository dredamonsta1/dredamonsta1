public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

// class Casting {
//     public static void main(String[] args) {
//         double d = 35.25;
//         double dd = 35.99;
//
//         // casting the double d into a int
//         int i = (int) d;
//
//         // casting the double dd into a int
//         int ii = (int) dd;
//         System.out.println(i);
//         System.out.println(ii);
//     }
// }

class Casting {
    public static void main(String[] args) {
        int i = 35;
        float f = i;
        System.out.println("The number is: " + f);
    }
}
// importing the Date class
import java.util.Date;
class ImportDemo {
    public String getCurrentDate() {
        Date date = new Date();
        return "Current date is: " + date;
    }
}

class ImportDemoTest {
    public static void main(String[] args) {
        ImportDemo iD = new ImportDemo();
        String currentDate = iD.getCurrentDate();
        System.out.println(currentDate);
    }
}

// ...
    ImportDemo iD = new ImportDemo(); // 1
    String currentDate = iD.getCurrentDate(); // 2
    System.out.println(currentDate); // 3
// ...
Copy

// import java.lang.Math;
\



      import java.lang.Math;
      class Pythagorean {
          public Double calculateHypotenuse(int legA, int legB) {
              return Math.sqrt((legA*legA)+(legB*legB));
            // the hypotenuse is the side across the right angle.
            // calculate the value of c given legA and legB
          }
      }

      // the hypotenuse is the side across the right angle.
      // calculate the value of c given legA and legB
    }
}

// class Pythagorean {
//     public double void main(int[] args) {
//         Pythagorean iD = new Pythagorean();
//         double thirdside = iD.calculateHypotenuse();
//         System.out.println(thirdside);
//     }
// }

class Pythagorean {
    public static void main(String[] args){
        Pythagorean iD = new Pythagorean();
        Double calculateHypotenuse = iD.calculateHypotenuse(2,4);
        System.out.println(calculateHypotenuse);
    }
}
