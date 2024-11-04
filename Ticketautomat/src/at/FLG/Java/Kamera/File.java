package at.FLG.Java.Kamera;

public class File {
    private int size;
    private String extension;
    private String name;

    public File(int size, String extension, String name){
        this.size = size;
        this.extension = extension;
        this.name = name;
    }

    public String getExtention(){
        return extension;
    }

    public String setExtention(){
        return extension;
    }

    public int getSize(){
        return size;
    }

    public String getName(){
        return name;
    }

    public String setName(){
        return name;
    }
}
