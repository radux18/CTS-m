package seminar6.prototypeEx;

public class TestPrototypeEx {
    public static void main(String[] args) {

        Asteroid prototipAsteroid = new Asteroid("Asteroid");

        Asteroid a1 = (Asteroid) prototipAsteroid.clone();
        Asteroid a2 = (Asteroid) prototipAsteroid.clone();
        Asteroid a3 = (Asteroid) prototipAsteroid.clone();

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        NavaSpatiala a4 = (NavaSpatiala) FactoryPrototype.getPrototip("nava");
        System.out.println(a4);



    }
}
