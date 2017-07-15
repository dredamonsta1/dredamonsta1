public class StringManipulation {
  // public static void main(String[] args);
    public String trimAndConcat(String str1, String str2) {
        String str3 = str1.trim();
        String str4 = str2.trim();
        return str1.trim() + str2.trim();
    }
    public int getIndexOrNull(String str1, char b) {
        int i = str1.indexOf(b);
        return i;
    }
    public int getIndexOrNull(String str1,String str2) {
        int i = str1.indexOf(str2);
        return str1.indexOf(str2);
    }
    public String concatSubstring(String str1, int a, int b, String str2) {
        String str3 = str1.substring(a,b);
        return str3 + str2;
    }
}

// [1:18]
// public class StringManipulationTest {
//     public static void main(String[] args){
//     StringManipulation sm = new StringManipulation();
//     String ans1 = sm.trimAndConcat("string", "string");
//     System.out.println(ans1);
//     String ans2 = sm.getIndexOrNull("string", 'i');
//     System.out.println(ans2);
//     String ans3 = sm.getIndexOrNull("string", "str");
//     System.out.println(ans3);
//     String ans4 = sm.concatSubstring("string", 1,2, "string");
//     System.out.println(ans4);
//     }
// }
