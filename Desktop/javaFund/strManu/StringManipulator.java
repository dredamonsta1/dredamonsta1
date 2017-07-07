// class StringManipulator {
//   public static void main(string string)
//   {
//
//   }
//
// }


// public class StringManipulator {
//
// 	public static void main(String[] args)
//   {
//   }
//
// }

// public class ExampleMinNumber {
//
//    public static void main(String[] args) {
//       int a = 11;
//       int b = 6;
//       int c = minFunction(a, b);
//       System.out.println("Minimum Value = " + c);
//    }

  /** returns the minimum of two numbers */
//    public static int minFunction(int n1, int n2) {
//       int min;
//       if (n1 > n2)
//          min = n2;
//       else
//          min = n1;
//
//      return min;
//    }
// }

// import java.io.*;
// public class StringManipulator {
//
//    public static void main(String args[]) {
//       String Str = new String("   Hello everybody you wanna playyyy" + "!!")  .concat("boy");
// // System.out.println(s1);
//
//       System.out.print("Return Value :" );
//       System.out.println(Str.trim() );
//       // System.out.println(Str.concat() );
//    }
// }

class StringManipulator {

    public static void main(String[] args) {
        Object[] someArray = new Object[5];
        someArray[0] = new Object[100];
        someArray[1] = null;
        someArray[2] = new Object[1];
        someArray[3] = null;
        someArray[4] = new Object[5];

        for (int i=0; i<=someArray.length-1; i++) {
            if (someArray[i] != null) {
                System.out.println("not null");
            } else {
                System.out.println("null");
            }
        }
    }
}

// public class StringDemo {
//
//    public static void main(String args[]) {
//       String palindrome = "Dot saw I was Tod";
//       int len = palindrome.length();
//       System.out.println( "String Length is : " + len );
//    }
// }

class StringManipulatorTest {

}
