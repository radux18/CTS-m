package seminar5Recuperare.compoziteEx;

public class TestEx {
    public static void main(String[] args) {
        //definire structura organizatorica
        StructuraOrganizatorica departamentIT = new StructuraOrganizatorica("DepartamentIT", "se ocupa cu it");

        //definire nod composite
        StructuraOrganizatorica echipaDezvoltare = new StructuraOrganizatorica("Echipa dezvoltare", "Echipa programatori");

        //adaugare angajati in echipa
        echipaDezvoltare.adaugaNod(new Angajat("Popescu", "Programator"));
        echipaDezvoltare.adaugaNod(new Angajat("Ionescu", "Programator"));

        //adaugare noduri copil
        departamentIT.adaugaNod(new Angajat("Ion", "manager"));
        departamentIT.adaugaNod(echipaDezvoltare);

        //afisare structura
            departamentIT.getNod(1).getInfo();
    }
}
