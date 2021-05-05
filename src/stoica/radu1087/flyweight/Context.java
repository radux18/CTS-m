package stoica.radu1087.flyweight;

public class Context {
    int width;
    int height;
    String formaElement;

    public Context(int width, int height, String formaElement) {
        this.width = width;
        this.height = height;
        this.formaElement = formaElement;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getFormaElement() {
        return formaElement;
    }
}
