public class TrueFalse implements Question
{
    public char answer;
    public String question;

    public TrueFalse(String question, char answer) 
    {
        this.answer = answer;
        this.question = question;
    }
    @Override
    public String getQuestion() {
        return ("T or F? - " + question);
    }

    @Override
    public String getAnswer() {
        return String.valueOf(answer);
    }
}
