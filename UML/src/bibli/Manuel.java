package bibli;

public class Manuel extends Livre {

    private int niveauScolaire;

    public Manuel (int num, String titre,String auteur, int nbPages, int niveauScolaire)
    {
        super(num, titre, auteur, nbPages);
        this.niveauScolaire=niveauScolaire;
    }

    @Override
    public void print() {
        System.out.println("\nImprime ..."+this);
    }

    @Override
    public String toString() {
        return ""+super.toString()+" Manuel{" +
                "niveauScolaire='" + niveauScolaire + '\'' +
                '}';
    }
}
