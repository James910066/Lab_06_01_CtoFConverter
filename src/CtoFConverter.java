import java.util.Scanner; //Import of Scanner
public class CtoFConverter
{
    public static void main(String[] args)
    {
        double tempInCelsius = 0; //Variable declaration and assignment
        double tempInFarhenheit = 0; //Variable declaration and assignment
        String trash = ""; //Variable declaration and assignment
        final int FREEZINGTEMP = 0; //Declaration and assignment of freezing point in celsius
        final int BOILINGTEMP = 100; //Declaration and assignment of boiling point in celsius

        Scanner in = new Scanner(System.in); //Declaration and assignment of Scanner utility

        System.out.println("Enter your temperature choice for Celsius"); //Prompt user for input
        if(in.hasNextDouble()) //Check and validate user input
        {
            tempInCelsius = in.nextDouble(); //Assigning user input to variable
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
        else //Exit on bad input
        {
            trash = in.nextLine(); //Assignment of bad input from user
            System.out.println("You entered an invalid number for temperature: " + trash); //Output statement
        }
    }
}