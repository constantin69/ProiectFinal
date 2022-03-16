import java.util.ArrayList;

public class Main {
    public static int main(String[] args) {

/*
        int n = 3;
        Persoana [] persoane = new Persoana[n];    //Problema 9

        persoane[0] = new Persoana("Iliescu", "Ion", 120);
        persoane[1] = new Persoana("Constantinescu", "Emil", 99);
        persoane[2] = new Persoana("Basescu", "Gheorghe", 75);

        for (int i = 0; i < n; i++) {
            persoane[i].afisare();
        }
*/
        // Problema 10

        ArrayList<Persoana> person = new ArrayList<>();
        person.add(new Persoana("Marin", "George", 15));
        person.add(new Persoana("Dancu", "Mihai", 30));
        person.add(new Persoana("Tudor", "Ghoerghe", 45));
        person.add(new Persoana("Andreescu", "Ana", 20));

        for (var p : person) {
            p.afisare();
        }


        System.out.println("Persoana cu varsta cea mai mica este: ");
        varstaCeaMaiMica(persoane);


        public static Persoana varstaCeaMaiMica(ArrayList<Persoana> person) {
            ArrayList<Persoana> per = null;
            int varsta = Integer.MAX_VALUE;
            for (var pers : person) {
                if (varsta > person.Varsta) {
                    per = person;
                    varsta = person.Varsta;
                }
            }
            return varsta;
        }




    }
}
