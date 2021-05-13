public class MultipleChoice implements Question
{

    private String question;
    private String choiceA;
    private String choiceB;
    private String choiceC;
    private String choiceD;
    private String answer;

    public MultipleChoice (
        String question, 
        String choiceA, 
        String choiceB, 
        String choiceC, 
        String choiceD, 
        String answer
        ) 
    {
        this.question = question;
        this.choiceA = choiceA;
        this.choiceB = choiceB;
        this.choiceC = choiceC;
        this.choiceD = choiceD;
        this.answer = answer;
    }

    @Override
    public String getQuestion() 
    {
        return (question +
            "\n\ta. " + choiceA +
            "\n\tb. " + choiceB + 
            "\n\tc. " + choiceC + 
            "\n\td. " + choiceD);
    }
    @Override
    public String getAnswer() 
    {
        return answer;
    }
}
