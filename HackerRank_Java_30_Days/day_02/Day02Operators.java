package day_02;

//https://www.hackerrank.com/challenges/30-operators/

import java.io.*;


class Result {
	  /*
  * Complete the 'solve' function below.
  *
  * The function accepts following parameters:
  *  1. DOUBLE meal_cost
  *  2. INTEGER tip_percent
  *  3. INTEGER tax_percent
  */

 public static void solve(double meal_cost, int tip_percent, int tax_percent) {
 // Write your code here
     double local_tip = (tip_percent / 100.00) * meal_cost;
     double local_tax = (tax_percent / 100.00) * meal_cost;
     double total_cost = meal_cost + local_tip + local_tax;
     System.out.println(Math.round(total_cost));
 }

}

public class Day02Operators {
 public static void main(String[] args) throws IOException {
     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

     double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

     int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

     int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

     Result.solve(meal_cost, tip_percent, tax_percent);

     bufferedReader.close();
     

 }
}
