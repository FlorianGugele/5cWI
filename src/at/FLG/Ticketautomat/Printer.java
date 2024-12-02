package at.FLG.Ticketautomat;

public class Printer {
    public Ticket PrintTicket(){
        Ticket ticket = new Ticket();
        System.out.println(ticket.getId()+ ticket.createTmestamp() + ticket.printTimestamp());
        return ticket;
    }
}
