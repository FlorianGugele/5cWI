package at.FLG.Ticketautomat;

import java.io.InputStream;

public class Scanner {
    private Ticket ticket;

    public Scanner(InputStream in) {
        //TODO Auto-generated constructor stub
    }

    public void InsertTicket (Ticket inserTicket){
        ticket = inserTicket;
    }

    public Ticket getTicket(){
        return ticket;
    }

    public int nextInt() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nextInt'");
    }
}
