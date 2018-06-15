import java.util.Random;
public class UserName
{
    public static void userNameGenerator(String name)
    {   
        //Create a string variable - call it firstThree
        String firstThree = name.substring(0,3);
        //Generator a random variable
        Random Randomizer = new Random();
        //Save the random number to the int variable - numberPart
        int numberPart = Randomizer.nextInt(100);
        //Create a string called userName 
        String userName = (firstThree + numberPart);
        //Print out userName to user
        System.out.println("Your user name is: " +userName);
        
    }
}