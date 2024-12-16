package at.FLG.AlgoDat.products;


public class Hoodie implements Product{
    private int Prize;
    private String Name;
    private String Size;

   

    public Hoodie(String Name, int Prize, String Size){
        this.Name = Name;
        this.Prize = Prize;
        this.Size = Size;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public int getPrize() {
       return Prize;
    }

    public String getSize() {
        return Size;
    }
    
    
}
