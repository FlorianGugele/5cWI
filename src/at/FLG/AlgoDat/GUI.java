package at.FLG.AlgoDat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import at.FLG.AlgoDat.products.Product;


public class GUI {
    private Scanner scanner = new Scanner(System.in);
    private List<Product> products = new ArrayList<Product>();

    public void addProduct(Product product){
        this.products.add(product);
    }

    public void run(){
        while(true){
            System.out.println("-------------------");;
            System.out.println("(1) Show Products");
            System.out.println("(2) Show Stock value");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showProducts();
                    break;
                case 2:
                    showStockValue();
                default:
                    break;
            }
        }
    }

    private void showProducts(){
        System.out.println("-------------------");
        System.out.println("show Products");
        for (Product product : products) {
            System.out.println(product.getName());
        }
    }
    
    private void showStockValue(){
        System.out.println("-------------------");
        System.out.println("show Stock value");
        for (Product product : products) {
            System.out.println(product.getName() + " " + product.getPrize()+",-");
        }
    }
}
