public class Persoana {

    private String Nume;
    private String Prenume;
    int Varsta;

    public Persoana() {
         Nume = "null";
         Prenume = "null";
         Varsta = 0;
    }

    public Persoana (String Nume, String Prenume, int Varsta) {
        this.Nume= Nume;
        this.Prenume = Prenume;
        this.Varsta = Varsta;
        }

    public void afisare() {
        System.out.println("Buna! Eu sunt Prenume: " + Prenume + " si am varsta " + Varsta + " ani!");
    }

}

