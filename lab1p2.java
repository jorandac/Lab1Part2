package Lab1P2;

import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class lab1p2 {

       // new format for dates
       private static final DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
 
       public static void main(String[] args) throws ParseException {
 
              // User instruction
              System.out.println(
                           "Please enter the two dates you would like to calculate in format (yyyy/mm/dd). Please press Enter after each date: ");
 
              // scanner input
              Scanner reader = new Scanner(System.in);
 
              // string for dates
              String first = reader.nextLine();
              String second = reader.nextLine();
              Date one = getDate(first);
              Date two = getDate(second);
 
              // days between the dates
              long numberOfDays = daysBetween(one, two);
 
              // output
              System.out.printf("The number of days between %s and %s is: %d %n", first, second, numberOfDays);
 
              reader.close();
 
       }
 
       // declaration for daysBetween
       private static long daysBetween(Date one, Date two) {
              long difference = (one.getTime() - two.getTime()) / 86400000;
              return Math.abs(difference);
       }
 
       // declaration for getDate
       private static Date getDate(String date) throws ParseException {
 
              return df.parse(date);
       }
}