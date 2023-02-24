import java.util.Scanner; //Import of Scanner
public class CtoFConverter
{
    public static void main (String[]args)
    {
        //Declaration and assignment of all variables
        int tempInCelsius = 0;
        int tempInFarhenheit = 0;
        String trash = "";
        final int FREEZINGTEMP = 0;
        final int BOILINGTEMP = 100;
        boolean correctInput = false;
        Scanner in = new Scanner(System.in);

        do //Start of Do While loop for testing user input
        {
            System.out.println("Enter your temperature choice for Celsius"); //Prompt user for input
            if (in.hasNextInt()) //Check if user input is an integer and not string
                {
                    tempInCelsius = in.nextInt(); //Assignment of correct user input
                    correctInput = true; //Reassign variable condition to end loop
                }
            else //When the check for integer fails, user input goes through here
                {
                    trash = in.nextLine(); //Assignment of bad input from user
                    System.out.println(trash + " is invalid input."); //Output statement of bad input to user
                }
        }
        while (!correctInput); //Check to see if condition is met to continue loop for user input
        {
            {
                if(tempInCelsius == FREEZINGTEMP) //Check input for freezing point
                    {
                        System.out.println("You entered temperature for freezing point: " + FREEZINGTEMP); //Output statement
                    }
                if(tempInCelsius == BOILINGTEMP) //Check input for boiling point
                    {
                        System.out.println("You entered temperature for boiling point in celsius " + BOILINGTEMP); //Output statement
                    }
                tempInFarhenheit = tempInCelsius * 9 / 5 + 32; //Calculation process
                System.out.println("Your temperature converted to fahrenheit is " + tempInFarhenheit); //Output statement
            }
        }
    }
}
