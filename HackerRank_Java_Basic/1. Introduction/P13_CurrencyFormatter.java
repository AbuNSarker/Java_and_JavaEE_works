/*------------------------------------------------------------------------
 * Problem 13: Java Currency Formatter
 * 
 * Task: 
 * 		Given a double-precision number, payment, denoting an amount of money, use the 
 * 		NumberFormat class' getCurrencyInstance method to convert  into the US, Indian, Chinese, 
 * 		and French currency formats. Then print the formatted values as follows:
 *
 *		US: formattedPayment
 *		India: formattedPayment
 *		China: formattedPayment
 *		France: formattedPayment
 *		where  formattedPayment is payment formatted according to the appropriate Locale's currency.
 * 
 * Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).
 * 
 * Input Format: 
 * 		A single double-precision number denoting payment. ex: 12324.134
 * 
 * Constraints: 
 * 
 * Output Format:
 * 		On the first line, print US: u where  is  formatted for US currency.
 *		On the second line, print India: i where  is  formatted for Indian currency.
 *		On the third line, print China: c where  is  formatted for Chinese currency.
 *		On the fourth line, print France: f, where  is  formatted for French currency.
 *
 * Source: https://www.hackerrank.com/challenges/java-currency-formatter/problem
 * ------------------------------------------------------------------------
 */

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class P13_CurrencyFormatter {

	public static void main(String[] args) {
		// Input section
		Scanner scan = new Scanner(System.in);
		double payment = scan.nextDouble();
		scan.close();

		// Create custom Locale for India
		Locale LocaleIndia = new Locale("en", "IN");
		// ----Or::
		// Locale LocaleIndia = new
		// Locale.Builder().setLanguage("en").setRegion("IN").build();

		// NumberFormats using Locales
		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat india = NumberFormat.getCurrencyInstance(LocaleIndia);
		NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

		// output
		System.out.println("US: " + us.format(payment));
		System.out.println("India: " + india.format(payment));
		System.out.println("China: " + china.format(payment));
		System.out.println("France: " + france.format(payment));
	}
}
