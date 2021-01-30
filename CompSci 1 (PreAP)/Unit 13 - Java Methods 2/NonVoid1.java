package Unit13;

public class NonVoid1
{
    public double average(double num1, double num2)
    {
       double avg = (num1 + num2) / 2;
       return avg;
    }
    
    public int randomInt(int range)
    {
        return (int)(Math.random() * range) + 1;
    }
    public boolean isVowel(String ch)
    {
        if(ch.equalsIgnoreCase("a") || ch.equalsIgnoreCase("e") || 
           ch.equalsIgnoreCase("i") || ch.equalsIgnoreCase("o") || 
           ch.equalsIgnoreCase("u"))
            return true;
        else 
            return false;
    }
    
    public String weather(int temp)
    {
        if(temp >= 85)
            return "It's hot";
        else if(temp >= 65)
            return "It's warm";
        else if(temp >= 45)
            return "It's cool";
        else
            return "It's cold";
    }

    public String getLetterGrade(int grade)
    {
        if(grade >= 90 && grade <= 100)
            return "A";
        if(grade >= 80 && grade < 90)
            return "B";
        if(grade >= 70 && grade < 80)
            return "C";
        
        return "F";
    }

    public boolean isWholeNumber(int num)
    {
        return (num >= 0);
    }
	
    public static void main(String[] args)
    {
        NonVoid1 app = new NonVoid1();

        System.out.println();
        System.out.println("Test average method");
        System.out.println("===================");
        System.out.println("The average of 50 and 100 is " + app.average(50, 100));
        System.out.println("The average of 1271 and 5446 is " + app.average(1271, 5446));

        System.out.println();
        System.out.println("Test randomInt method");
        System.out.println("=====================");
        System.out.println("random int from 1 to 5 is " + app.randomInt(5));
        System.out.println("random int from 1 to 50 is " + app.randomInt(50));
        System.out.println("=====================");


        System.out.println();
        System.out.println("Test isVowel method");
        System.out.println("===================");
        System.out.println("is e a vowel? " + app.isVowel("e"));
        System.out.println("is y a vowel? " + app.isVowel("y"));
        System.out.println("is o a vowel? " + app.isVowel("o"));
        System.out.println("===================");

        
        System.out.println();
        System.out.println("Test weather method");
        System.out.println("==========================");
        System.out.println("When it's 32 degrees it's " + app.weather(32));
        System.out.println("When it's 75 degrees it's " + app.weather(75));
        System.out.println("==========================");
		

        System.out.println();
        System.out.println("Test getLetterGrade method");
        System.out.println("==========================");
        System.out.println("A grade of 75 is " + app.getLetterGrade(75));
        System.out.println("A grade of 95 is " + app.getLetterGrade(95));
        System.out.println("==========================");


        System.out.println();
        System.out.println("Test isWholeNumber method");
        System.out.println("=========================");
        System.out.println("Is 7 a whole number? " + app.isWholeNumber(7));
        System.out.println("Is -47666 a whole number? " + app.isWholeNumber(-47666));
        System.out.println("=========================");

    }
}