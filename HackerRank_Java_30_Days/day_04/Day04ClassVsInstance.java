package day_04;

//https://www.hackerrank.com/challenges/30-class-vs-instance/problem

import java.util.Scanner;

class Person {
    private int age;

    public Person(int initialAge) {

        // Add some more code to run some checks on initialAge
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        } else {
            this.age = initialAge;
        }
    }

    public void amIold() {
        // Write code determining if this person's age is old and print the correct
        // statement:
        if (age >= 0 && age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");

        }
        // System.out.println(/*Insert correct print statement here*/);
    }

    public void yearPasses() {
        // Increment this person's age.
        age = age + 1;
    }

}


public class Day04ClassVsInstance {
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
