package at.FLG.Java.Ticketautomat;

public class App {

    public static void main(String[] args) {
        Printer printer = new Printer();
        Controller controller = new Controller(printer);
        Scanner scanner = new Scanner();
        UI ui = new UI(controller, scanner);
    }
}