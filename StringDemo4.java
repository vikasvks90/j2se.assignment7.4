/**
* <h1>StringDemo4</h1>
* This program prints date in a (yyyy-mm-dd) format
* when we pass the (date month year)
* @author  Vikas 
* @version 1.0
* @since   2017-05-27 
*/
package assignment7.session4;

import java.util.Scanner;

public class StringDemo4 {

	public static void main(String[] args) {
		System.out.println("Please enter the dat to be formated in (date,month,year) format");
		Scanner sc = new Scanner(System.in);
		String date = sc.next();
		String[] dateFormat = date.split(",");//split the string seperated by comma
		String x = dateFormat[0];// will hold the first element of the string i.e. date
		String y = dateFormat[1];// will hold the second element of the string i.e. month
		String z = dateFormat[2];// will hold the third element of the string i.e. year
		String[] months = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
		String[] days = {"01","02","03","04","05","06","07","08","09","10","11","12"};
		String a = null;
		for(int i=0;i<months.length;i++){
			if(months[i].equalsIgnoreCase(y)){
				a = days[i];
			}
		}
		System.out.print("The formatted date is: ");
		System.out.println(z+"-"+a+"-"+x);

	}

}
