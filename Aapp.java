import java.util.Scanner;

/**
 This program shows a simple quiz with one question.
 */
public class AApp{
    public static void main(String[] args){
        Question first = new Question();
        first.setText("O Charizard é a evolução de qual Pokemon?");
        first.setAnswer("Charmeleon");

        ChoiceQuestion second = new ChoiceQuestion();
        second.setText("Qual desses Pokemon é do tipo água?");
        second.addChoice("Bulbasaur", false);
        second.addChoice("Oshawott", true); 
        second.addChoice("Vulpix", false);
        second.addChoice("Eevee", false);

        

        SequenceQuestion terceira = new SequenceQuestion();
        terceira.setText("Associe o Pokemon a sua Geração: ");
        terceira.setText("1° Geração                   ()Abra");
        terceira.setText("2° Geração                   ()Cyndaquil");
        terceira.setText("3° Geração                   ()Gardevoir");
        terceira.setText("4° Geração                   ()Bidoof");
        terceira.setText("5° Geração                   ()Oshawott");
        terceira.setAnswer("12345");

        presentQuestion(first);
        presentQuestion(second);
        presentQuestion(terceira);
        
    }

    /**
     Presents a question to the user and checks the response.
     @param q the question
     */
    public static void presentQuestion(Question q){
        q.display();
        System.out.print("Sua resposta: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }
}
