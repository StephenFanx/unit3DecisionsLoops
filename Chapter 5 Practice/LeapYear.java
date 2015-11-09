import java.util.Scanner;

/**
 * Write a description of class Dump here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeapYear
{
    /** description of instance variable x (add comment for each instance variable) */
    LeapYear leapyear = new LeapYear();
    
    /**
     * Default constructor for objects of class Dump
     */
    public int LeapYear()
    {
        // initialise instance variables
        Scanner in = new Scanner(System.in);
        System.out.println("Year: ");
        int year = in.nextInt();
        return year;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void isLeapYear(int year)
    {
        // put your code here
        if (year%4 == 0 && year%100 != 0 || year%400 == 0){
            System.out.println("It's a leap year!");
        }
        else
            System.out.println("It's not a leap year.");
    }
}