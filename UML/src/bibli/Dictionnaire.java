package bibli;

public class Dictionnaire extends Document {

    private String langue;


    public Dictionnaire(int num, String titre, String langue)
    {
        super(num,titre);
        this.langue=langue;
    }
}