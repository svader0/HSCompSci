import java.util.*;

public class Quiz
{
    private ArrayList <Question> questions;
    
    public Quiz()
    {
       questions = new ArrayList <Question>();
       
       questions.add(new TrueFalse("Houston is the capital of Texas.",'F'));
       questions.add(new MultipleChoice("The capital of Texas is",
                         "Houston",
                         "San Antonio",
                         "Austin",
                         "Dallas",
                         "Austin"));
       questions.add(new MultipleChoice("The largest city in Texas is",
                         "Houston",
                         "San Antonio",
                         "Austin",
                         "Dallas",
                         "Houston"));
       questions.add(new TrueFalse("The tallest mountain in Texas is Guadalupe Peak.", 'T'));
       
       displayTest();
    }
    
    // prints the entire quiz numbering the questions from 1 to question.size()
    public void displayTest ()
    {
        for (int i = 0; i < questions.size(); i++) 
        {
            System.out.println("\n" + (i + 1) + ") " + questions.get(i).getQuestion() + "\n\n");
        }
    }
    public static void main(String[] args)
    {
        new Quiz();
    }
}