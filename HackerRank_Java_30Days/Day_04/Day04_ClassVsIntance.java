package Day_04;
//https://www.hackerrank.com/challenges/30-class-vs-instance/problem?isFullScreen=true

import java.util.Scanner;

public class Day04_ClassVsIntance {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();
	        for (int i = 0; i < T; i++) {
	            int age = sc.nextInt();
	            Person personObj = new Person(age);
	            personObj.amIold();
	            for (int j = 0; j < 3; j++) {
	            	personObj.yearPasses();
	            }
	            personObj.amIold();
	            System.out.println();
	        }
	        sc.close();

	    }

	}
