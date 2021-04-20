import java.util.*;

public class TestResults
{
   private ArrayList<StudentAnswerSheet> sheets;
   
   // constructor
   public TestResults()
   {
   	  sheets = new ArrayList<StudentAnswerSheet>();
   }
   
   public void add(StudentAnswerSheet s)
   {
   	  sheets.add(s);
   }
   
   // Part (b)
   /** Precondition: sheets.size() > 0;
    *                all answer sheets in sheets have the same number of answers
    *  @param key the list of correct answers represented as strings of length one
    *         Precondition: key.size() is equal to the number of answers
    *                       in each of the answer sheets in sheets
    *  @return the name of the student with highest score
    */
   public String highestScoringStudent(ArrayList<String> key)
   {   
      // initialize the current highest score with the first person on the list
      StudentAnswerSheet highestScore = sheets.get(0); 

      // for every answer sheet
      for (StudentAnswerSheet a : sheets) 
      {
         // if their score is matches the key more than the current high score does
         if (a.getScore(key) > highestScore.getScore(key)) {
            // set the new high score
            highestScore = a;
         }
      }
      return  highestScore.getName();
     
    
   }
   
   
   // There may be fields, constructors, and methods that are not shown.
  
}