package at.FLG.Java.Kamera;

public class Camera {
    private int pixel;
    private int weight;

    public Camera(int pixel, int weight){
        this.pixel = pixel;
        this.weight = weight;
    }

    public void printAllImages(){
        
    } 

    public void takePicture(){
        File picture = new File(1000, "png", "Picture1");
        
    }
}
