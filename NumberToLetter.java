public class NumberToLetter{
    
    public static void numberToLetterGenerator(int grade)
    {
        //Use if/else to determine the letter grade
       if (grade >= 90 ) {
            System.out.println( grade + " is equal to an A");
        }
        else if (grade >= 80) {
            System.out.println (grade + " is equal to a B");
        }
        else if (grade >= 70) {
            System.out.println (grade + " is equal to a C");
        }
        else if (grade >=60 ) {
            System.out.println (grade + " is equal to a D");
        }
        else {
            System.out.println (grade + " is an F");
    }
}
    
}