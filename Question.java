// This is provided for reference. You don't need to modify this file

/**
 Questão dissertativa
 */
public class Question{
    private String text;
    private String answer;

    /**
     Construtor de questão vazia e sem resposta
     */
    public Question(){
        text = "";
        answer = "";
    }

    /**
     Sets the question text.
     @param questionText the text of this question
     */
    public void setText(String questionText){
        text = questionText;
    }

    /**
     Sets the answer for this question.
     @param correctResponse the answer
     */
    public void setAnswer(String correctResponse){
        answer = correctResponse;
    }

    /**
     Checks a given response for correctness.
     @param response the response to check
     @return true if the response was correct, false otherwise
     */
    public boolean checkAnswer(String response){
        return response.equals(answer);
    }

    /**
     Displays this question.
     */
    public void display(){
        System.out.println(text);
    }
}