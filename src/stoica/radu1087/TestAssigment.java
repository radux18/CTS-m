package stoica.radu1087;

import stoica.radu1087.adapter.AdaptorProdusLaProduseInCos;
import stoica.radu1087.adapter.ProdusAdaugatInCos;
import stoica.radu1087.adapter.ProdusDinCos;
import stoica.radu1087.adapter.ProdusGaming;
import stoica.radu1087.builder.Imagine;
import stoica.radu1087.builder.Produs;
import stoica.radu1087.decorator.Cumparator;
import stoica.radu1087.decorator.DecoratorBlocat;
import stoica.radu1087.decorator.User;
import stoica.radu1087.flyweight.Context;
import stoica.radu1087.flyweight.FactoryImagine;
import stoica.radu1087.flyweight.InterfataElement;
import stoica.radu1087.prototype.AccessControlProvider;
import stoica.radu1087.prototype.ControlDeAcces;
import stoica.radu1087.prototype.Utilizator;
import stoica.radu1087.proxy.Developer;
import stoica.radu1087.proxy.InterfataStaff;
import stoica.radu1087.proxy.ProxyGenerareRaport;
import stoica.radu1087.simpleFactory.CuponAbstract;
import stoica.radu1087.simpleFactory.FactoryCupon;
import stoica.radu1087.simpleFactory.TipCupon;
import stoica.radu1087.singleton.ConexiuneBazaDeDate;

import java.util.ArrayList;

public class TestAssigment {
    public static void main(String[] args) {
        // ********  SINGLETON  ********
        System.out.println("*********SINGLETON************");
        ConexiuneBazaDeDate conexiune1 = ConexiuneBazaDeDate.getConexiuneBD();
        ConexiuneBazaDeDate conexiune2 = ConexiuneBazaDeDate.getConexiuneBD();

        if (conexiune1 == conexiune2){
            System.out.println("Cele 2 referinte sunt identice");
        } else {
            System.out.println("Cele 2 referinte sunt diferite");
        }
        // ********  SINGLETON  ********
        System.out.println("\n");
        System.out.println("*********FACTORY************");
        // ********  FACTORY  ********
        boolean esteActivaCampania = true;

        if (esteActivaCampania){
            CuponAbstract cupon1 = null;
            CuponAbstract cupon2 = null;
            CuponAbstract cupon3 = null;

            cupon1 = FactoryCupon.getCupon(TipCupon.BRONZE);
            cupon2 = FactoryCupon.getCupon(TipCupon.SILVER);
            cupon3 = FactoryCupon.getCupon(TipCupon.GOLD);

            System.out.println(cupon1.toString());
            System.out.println(cupon2.toString());
            System.out.println(cupon3.toString());
        } else {
            //folosesti celelalte cuponoane din campania trecuta.
        }
       // ********  FACTORY  ********
        System.out.println("\n");
        System.out.println("*********BUILDER************");
        // ********  BUILDER  ********
        Produs microProcesor = new Produs
                                        .ProdusBuilder("AMD Athlon", 345.5, 2)
                                        .esteUzat()
                                        .seteazaVechime(8)
                                        .seteazaImagine(new Imagine())
                                        .build();

        Produs mouseGaming = new Produs
                                        .ProdusBuilder("Mouse Genesis", 129, 1)
                                        .esteNou()
                                        .seteazaImagine(new Imagine())
                                        .build();

        Produs laptop = new Produs
                                        .ProdusBuilder("Laptop ASUS Rogue", 39.000, 1)
                                        .esteNou()
                                        .seteazaImagine(new Imagine())
                                        .build();

        System.out.println(microProcesor);
        System.out.println(mouseGaming);
        System.out.println(laptop);
        // ********  BUILDER  **********
        System.out.println("\n");
        System.out.println("*********PROTOTYPE************");
        // ********  PROTOTYPE  ********
        try {
            ControlDeAcces controlDeAcces = AccessControlProvider.getControlDeAcces("ADMIN");
            Utilizator utilizator = new Utilizator("Gigel Chirita", "ADMIN LEVEL", controlDeAcces);
            System.out.println(utilizator);


            ControlDeAcces controlDeAcces2 = (ControlDeAcces) controlDeAcces.clone();
            utilizator = new Utilizator("Radu Stoica", "ADMIN LEVEL", controlDeAcces2);
            utilizator.getControlDeAcces().setNivelControl("GENEREAZA RAPOARTE");
            System.out.println(utilizator);


            ControlDeAcces managerControlAccess = AccessControlProvider.getControlDeAcces("MANAGER");
            utilizator = new Utilizator("Richard", "MANAGER LEVEL", managerControlAccess);
            System.out.println(utilizator);
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        // ********  PROTOTYPE  ********
        System.out.println("\n");
        System.out.println("*********ADAPTER************");
        // ********  ADAPTER  ********
        ProdusAdaugatInCos produs1 = new ProdusAdaugatInCos("Mouse", 250, 1);
        produs1.cresteCantitateStoc(2);

        ProdusGaming produsGaming = new ProdusGaming();
        produsGaming.setDenumire("Cooler SATA");
        produsGaming.cresteCantitate(1);
        produsGaming.setPret(430);

        produsGaming.esteAdaugatInCos();

        ArrayList<ProdusDinCos> cosCumparaturi = new ArrayList<>();
        cosCumparaturi.add(produs1);

        AdaptorProdusLaProduseInCos adaptorProdus = new AdaptorProdusLaProduseInCos(produsGaming);
            cosCumparaturi.add(adaptorProdus);
            adaptorProdus.adaugaInCos();
        produsGaming.esteAdaugatInCos();

        for (ProdusDinCos produs : cosCumparaturi){
            System.out.println(produs.toString());
            produs.cresteCantitateStoc(2);
            produs.scadeCantitateStoc(1);
        }
        // ********  ADAPTER  ********
        System.out.println("\n");
        System.out.println("*********DECORATOR************");
        // ********  DECORATOR  ********

        User user = new Cumparator("Radu","radux18@yahoo.com", "farfurie123");
        user.navigheaza();
        user.trimiteMesaj();
        user.oferaRecenzie();
        user.primesteReport();
        user.primesteReport();
        user.primesteReport();

        user.navigheaza();

        user = new DecoratorBlocat(user);
        user.primesteReport();
        user.primesteReport();
        user.primesteReport();

        user.trimiteMesaj();
        user.navigheaza();
        user.oferaRecenzie();
        // ********  DECORATOR  ********
        System.out.println("\n");
        System.out.println("*********FLYWEIGHT************");
        // ********  FLYWEIGHT  ********
        Context contextImagine1 = new Context(300,400, "dreptunghiulara");
        Context contextImagine2 = new Context(300,300, "rotunda");
        Context contextImagine3 = new Context(450,450, "patrat");

        InterfataElement modelElement = FactoryImagine.getElement("RadioButton");

          modelElement.afiseazaElement(contextImagine1);
          modelElement.afiseazaElement(contextImagine2);
          modelElement.afiseazaElement(contextImagine3);
        // ********  FLYWEIGHT  ********
        System.out.println("\n");
        System.out.println("*********PROXY************");
        // ********  PROXY  ***********
        //dev de nivel 1 -> nu poate genera rapoarte... poate doar adauga/sterge produse
        //dev de nivel 2 ->poate genera rapoarte
        InterfataStaff developer1 = new Developer();
        InterfataStaff developer2 = new Developer();

        developer1.accesActivitate(2);
        developer1 = new ProxyGenerareRaport(developer1);
        developer1.genereazaRaport("radux18", 2);

        developer2.accesActivitate(1);
        developer2 = new ProxyGenerareRaport(developer2);
        developer2.genereazaRaport("mirceax23", 1);
        // ********  PROXY  ***********
        System.out.println("*********************");
    }
}
