import java.util.Scanner;

public class Tester{
    public static void main(String[] args){
       //Create Scanner objects - call it numReader
       Scanner numReader = new Scanner(System.in);
       //Create Scanner objects - call it textReader
       Scanner textReader = new Scanner(System.in);
       
       //Create intro object
       Intro introObject = new Intro();
       //Call introGenerator method from intro class
       introObject.introGenerator();
       
       //Create oddEven object
       OddEven oddEvenObject = new OddEven();
       //Ask user for input
       System.out.print("Please give me a number: ");
       //Store the input into the int variable - userNumber
       int userNumber = numReader.nextInt();
       //Call oddEvenGenerator method
       oddEvenObject.oddEvenGenerator(userNumber);
       
       //Create userName object
       UserName userNameObject = new UserName();
       //Ask for user input
       System.out.print("What's your name: ");
       //Store the input into a string variable - user
       String user = textReader.nextLine();
       //Call userNameGenerator method
       userNameObject.userNameGenerator(user);
       
       //Create NumberToLetter object
       NumberToLetter numberToLetterObject = new NumberToLetter();
       //Ask for user input
       System.out.print("Type in a grade: ");
       //Store the input into a int variable - grade
       int grade = numReader.nextInt();
       //Call numberToLetter method
       numberToLetterObject.numberToLetterGenerator(grade);
 
    }
    
    
}