// // import java.util.Scanner;

// /**
//  * infoeasy
//  */
// // public class infoeasy {

// //     public static void main(String[] args) {
// //         Scanner sc=new Scanner(System.in);
// //         String s=sc.next();
// //         StringBuilder sb=new StringBuilder(s);

// //     }

// //     public static void meg(StringBuiler str){
        
// //         int i=0;
// //         while(i<str.length()-1){
// //             if(str.charAt(i)=='1' && str.charAt(i+1)=='0'){
                 
// //                  meg(str.deleteCharAt(i));
// //                  meg(str.deleteCharAt(i+1));

// //             }
// //         }
// //          
// //     }
// // }




// // public class infoeasy{

// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         String s = sc.next();

// //         String smallestString = findSmallestString(s);
// //         System.out.println(smallestString);
// //     }

// //     public static String findSmallestString(String s) {
// //         // Base case: If the string is empty or has only one character, return it
// //         if (s.length() <= 1) {
// //             return s;
// //         }

// //         StringBuilder sb = new StringBuilder(s);
// //         for (int i = 0; i < sb.length() - 2; i++) {
// //             if (i < sb.length() - 1) {
// //                 char charAtI = sb.charAt(i);
// //                 char charAtIplus1 = sb.charAt(i + 1);
            

// //             // If current and next characters are '1' and '0' respectively
// //             if (charAtI == '1' && charAtIplus1 == '0') {
// //                 // Create two new strings by removing either character
// //                 String str1 = findSmallestString(sb.deleteCharAt(i).toString());
// //                 String str2 = findSmallestString(sb.deleteCharAt(i + 1).toString());

// //                 // Compare lexicographically and update the StringBuilder with the smaller string
// //                 sb.setLength(0); // Clear the StringBuilder before appending the smaller string
// //                 sb.append(str1.compareTo(str2) < 0 ? str1 : str2);
// //             }
// //         }
// //         }

// //         return sb.toString();
// //     }
// // }

// import java.util.Scanner;

// public class infoeasy {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();
//         sc.close();
//         System.out.println(findSmallestString(s));
//     }

//     public static String findSmallestString(String s) {
//         StringBuilder sb = new StringBuilder(s);
//         return recursiveRemove(sb);
//     }

//     public static String recursiveRemove(StringBuilder sb) {
//         int n = sb.length();
//         String smallest = sb.toString(); // Initially set to the original string
        
//         for (int i = 0; i < n - 1; i++) {
//             if (sb.charAt(i) == '1' && sb.charAt(i + 1) == '0') {
//                 // Create two new strings by removing '1' and '0'
//                 StringBuilder sbRemove1 = new StringBuilder(sb);
//                 sbRemove1.deleteCharAt(i);
//                 StringBuilder sbRemove0 = new StringBuilder(sb);
//                 sbRemove0.deleteCharAt(i + 1);

//                 String result1 = recursiveRemove(sbRemove1);
//                 String result2 = recursiveRemove(sbRemove0);

//                 // Determine the smallest lexicographically
//                 if (result1.compareTo(smallest) < 0) {
//                     smallest = result1;
//                 }
//                 if (result2.compareTo(smallest) < 0) {
//                     smallest = result2;
//                 }
//             }
            
//         }
//         return smallest;
   
//     }
// }

import java.util.Scanner;

public class infoeasy{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        System.out.println(findSmallestString(s));
    }

    public static String findSmallestString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return recursiveRemove(sb);
    }

    public static String recursiveRemove(StringBuilder sb) {
        int n = sb.length();
        String smallest = sb.toString(); // Initially set to the original string
        
        for (int i = 0; i < n - 1; i++) {
            if (sb.charAt(i) == '1' && sb.charAt(i + 1) == '0') {
                // Create two new strings by removing '1' and '0'
                StringBuilder sbRemove1 = new StringBuilder(sb);
                sbRemove1.deleteCharAt(i);
                StringBuilder sbRemove0 = new StringBuilder(sb);
                sbRemove0.deleteCharAt(i + 1);

                // Recurse on both new strings
                String result1 = recursiveRemove(sbRemove1);
                String result2 = recursiveRemove(sbRemove0);

                // Determine the smallest lexicographically
                if (result1.compareTo(smallest) < 0) {
                    smallest = result1;
                }
                if (result2.compareTo(smallest) < 0) {
                    smallest = result2;
                }
            }
            
        }
        return smallest;
    }
}