package bibli;

public class Main {

    public static void main(String[] args) {
        Etagere E1 = new Etagere();

        Manuel M1 = new Manuel(1,"Manuel de mathématiques","Nathan",250,4);
        Manuel M2 = new Manuel(2,"Manuel d'Histoire","Flammarion",400,2);
        Roman R1 = new Roman(3,"Autant en emporte le vent","Margaret Mitchell",100);
        Roman R2 = new Roman(4,"Lord of the Rings","J.R.R Tolkien",500);
        Dictionnaire D1 = new Dictionnaire(5,"Larousse","Francais");

        E1.addDoc(M1);
        E1.addDoc(R1);
        E1.addDoc(M2);
        E1.addDoc(R2);
        E1.addDoc(D1);


        System.out.println(E1);
        E1.search("Nathan");
        E1.alphaSort();
        System.out.println(E1);

        R1.print();
        M1.print();

        E1.print();
    }
}
