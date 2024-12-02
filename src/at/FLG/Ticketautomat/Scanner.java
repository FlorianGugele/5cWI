package at.FLG.Ticketautomat;

public class Scanner {
    private Ticket ticket;

    public void InsertTicket (Ticket inserTicket){
        ticket = inserTicket;
    }

    public Ticket getTicket(){
        return ticket;
    }
}
