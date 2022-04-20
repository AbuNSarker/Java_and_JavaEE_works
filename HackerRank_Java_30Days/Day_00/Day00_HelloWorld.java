package Day_00;
// https://www.hackerrank.com/challenges/30-hello-world/problem?isFullScreen=true

import java.util.Scanner;  // Import the Scanner class

public class Day00_HelloWorld {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner newObj = new Scanner(System.in);       // Create a Scanner object
        System.out.println("Hello, World.");
    
        String userInput = newObj.nextLine();              // Read user input
        System.out.println(userInput);  // Output user input        
        }
}
