package at.FLG.AlgoDat.products;

public class Hat implements Product{
    private int Prize;
    private String Name;

    public Hat(int Prize, String Name){
        this.Prize = Prize;
        this.Name = Name;
    }

    


    @Override
    public String getName() {
       return this.Name; 
    }

    @Override
    public int getPrize() {
        return this.Prize;
    }

}
