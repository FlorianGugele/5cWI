package at.FLG.Ticketautomat;

import java.util.ArrayList;

public class Controller {
        Printer printer;
        ArrayList<Ticket> tickets = new ArrayList<>();

        public Controller(Printer printer){
            this.printer = printer;
        }
        
        public void CreateTicket(){
            Ticket ticket = printer.PrintTicket();
            tickets.add(ticket);
        }

        public ArrayList<Ticket> geTickets(){
            return tickets;
        }
    }

