import java.util.Scanner;
import java.util.Random;

/**
 * Write a description of class MontyHall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MontyHall
{
    /** description of instance variable x (add comment for each instance variable) */

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
    public static void main(String[] args)
    {
            System.out.print("Pick a door between 1 and 3: ");
            int choice = new Scanner(System.in).nextInt();
            int car = new Random().nextInt(3)+1;
            
            if (car == 3)
            {
                int goat1 = 1;
                int goat2 = 2;
                int host = new Random().nextInt(2)+1;
            }
            
            if (car == 2)
            {
                int goat1 = 1;
                int goat2 = 3;
                int host = 2;
                while (host == 2)
                {
                    host = new Random().nextInt(3)+1;
                }
            }
            
            if (car == 1)
            {
                int goat1 = 2;
                int goat2 = 3;
                int host = 1;
                while (host == 1)
                {
                    host = new Random().nextInt(3)+1;
                }
                
                System.out.print("Behind door" + host + "is a goat.Would you like to change your choice? ")
                int change = new Scanner(System.in).next();
                
            }
            
            
    }

}
