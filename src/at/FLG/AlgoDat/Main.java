package at.FLG.AlgoDat;

import at.FLG.AlgoDat.products.Hat;
import at.FLG.AlgoDat.products.Hoodie;
import at.FLG.AlgoDat.products.Shoe;

public class Main {
    public static void main(String[] args) {
        Shoe s1 = new Shoe(50, "Jordan", 41);
        Shoe s2 = new Shoe(100, "Yeezy", 38);
        Hat h1 = new Hat(20, "Stieglitza");
        Hoodie d1 = new Hoodie("Adidas", 50, "L");

        GUI gui = new GUI();
        gui.addProduct(h1);
        gui.addProduct(s1);
        gui.addProduct(s2);
        gui.addProduct(d1);
        gui.run();       
    }
}