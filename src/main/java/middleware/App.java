package middleware;


import java.time.*;


public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date

        LocalTime myLocalTime = LocalTime.now();
        System.out.println(myLocalTime);


    }
}
