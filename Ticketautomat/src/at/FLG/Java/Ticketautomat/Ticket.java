package at.FLG.Java.Ticketautomat;

import java.util.Random;

public class Ticket {
    private int id;
    private long createTmestamp;
    private long printTimestamp;
    private Random random = new Random();

    public Ticket()
    {
        createTmestamp = System.currentTimeMillis();
        id = random.nextInt();
    }

    public int getId(){
        return id;
    }

    public long createTmestamp(){
        return createTmestamp;
    }

    public long printTimestamp(){
        return printTimestamp;
    }

    public void setPrintTimeStamp(long printTimestamp){
        this.printTimestamp = printTimestamp;
    }
}
