package seminar6.prototype;

public class TestPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Model3DCaracter superman1 = new Model3DCaracter("blue");
        Model3DCaracter superman2 = (Model3DCaracter) superman1.clone();
        System.out.println(superman1);
        System.out.println(superman2);

    }
}
