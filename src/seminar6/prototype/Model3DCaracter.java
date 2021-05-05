package seminar6.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Model3DCaracter implements Cloneable{
    String culoare;
    int inaltime;

    ArrayList<Integer> puncte = new ArrayList<>();

    public Model3DCaracter(String culoare){
        this.culoare = culoare;

        System.out.println("Incarcare  model 3d din fisier .....");
        try {
            Thread.sleep(2000);

            Random random = new Random(10);
            for (int i = 0; i < 20 ; i++){
                this.puncte.add(random.nextInt(1000));
            }
            System.out.println("Model 3D generat");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private Model3DCaracter(){
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        // Model3DCaracter copie = new Model3DCaracter(this.culoare);
        Model3DCaracter copie = new Model3DCaracter();
        //deep-copy -> clonam obiectul fara sa mai apelam constructorul cu param
        copie.culoare = this.culoare;
        copie.inaltime = this.inaltime;
        copie.puncte = (ArrayList<Integer>) this.puncte.clone();

        return copie;
    }

    @Override
    public String toString() {
        return "Model3DCaracter{" +
                "culoare='" + culoare + '\'' +
                ", inaltime=" + inaltime +
                ", puncte=" + puncte +
                '}';
    }
}
