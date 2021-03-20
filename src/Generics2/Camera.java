package Generics2;

public class Camera {
   int pixel;
   String name;

    public Camera(int pixel, String name) {
        this.pixel = pixel;
        this.name = name;
    }

    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}