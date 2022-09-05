import java.util.ArrayList;
public class SequenceQuestion extends Question {
    private ArrayList<String> sequences;

    public SequenceQuestion(){
        sequences = new ArrayList<String>();
    }

    public void addSequence (String sequence){
        sequences.add(sequence);
    }


    public void display()
    {
        System.out.print("Digite a sequência correspondente à sequência que responde corretamente: ");
        super.display();

    }
}
