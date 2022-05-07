package day_29;

// https://www.hackerrank.com/challenges/30-bitwise-and/problem

import java.util.*;
import java.util.Scanner;

public class Day29Bitwise {
private static final Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
    int t = scanner.nextInt();
    for (int tItr = 0; tItr < t; tItr++) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                int and=i&j;
                if(and<k && and > res){
                    res=and;
                }
            }
        }
       System.out.println(res);
        }  
         scanner.close(); 
      }
   
}

// Alternative solution---------
//public class Day29Bitwise {
//private static final Scanner scanner = new Scanner(System.in);
//public static void main(String[] args) {
//   int t = scanner.nextInt();
//           scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//           for (int tItr = 0; tItr < t; tItr++) {
//               String[] nk = scanner.nextLine().split(" ");
//               int n = Integer.parseInt(nk[0]);
//               int k = Integer.parseInt(nk[1]);
//               bitwiseAnd(n,k);
//           }
//
//           scanner.close();
//       }
//       
//          /*
//* Complete the 'bitwiseAnd' function below.
//*
//* The function is expected to return an INTEGER.
//* The function accepts following parameters:
//*  1. INTEGER N
//*  2. INTEGER K
//*/
//
//public static void bitwiseAnd(int n, int k) {
//// Write your code here
//   int max = 0;
//   for(int i =0; i< n; i++){
//     for(int j =0; j < i; j++){
//       int bitval = i & j;
//       if((bitval > max) && (bitval < k)){
//         max = bitval;
//       }
//     }
//   }
//   System.out.println(max+"");
// }
//
//}
