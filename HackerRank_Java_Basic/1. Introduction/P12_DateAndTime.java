
/*------------------------------------------------------------------------
 * Problem 12: Java Date and Time
 * 
 * Task: 
 * 		You are given a date. You just need to write the method, findDay, which returns the day on that date.
 * 
 * Input Format: 
 * 		A single line of input containing the space separated month, day and year, respectively, in  MM DD YYYY  format.
 * 
 * Constraints: 
 * 
 * Output Format:
 *		string: the day of the week in capital letters
 * 
 * Source: https://www.hackerrank.com/challenges/java-date-and-time/problem
 * ------------------------------------------------------------------------
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalDate;

class Result {

	/*
	 * Complete the 'findDay' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
	 */

	public static String findDay(int month, int day, int year) {
		int dd = Integer.valueOf(day);
		int mm = Integer.valueOf(month);
		int yyyy = Integer.valueOf(year);
		LocalDate date = LocalDate.of(yyyy, mm, dd);
		return date.getDayOfWeek().toString();
	}

}

public class P12_DateAndTime {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		// This line is better to change on this way for local machine (which will
		// stream your BufferedReader to System.out):
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int month = Integer.parseInt(firstMultipleInput[0]);

		int day = Integer.parseInt(firstMultipleInput[1]);

		int year = Integer.parseInt(firstMultipleInput[2]);

		String res = Result.findDay(month, day, year);

		bufferedWriter.write(res);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
