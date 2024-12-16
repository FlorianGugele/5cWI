package at.FLG.AlgoDat.products;

public class Shoe implements Product{
    private int Prize;
    private String Name;
    private int Size;

    public Shoe(int Prize, String Name, int Size){
        this.Name = Name;
        this.Prize = Prize;
        this.Size = Size;
    }

    

    @Override
    public String getName() {
       return this.Name;
    }

    @Override
    public int getPrize() {
        return this.Prize;
    }



    public int getSize() {
        return Size;
    }


}
