package myapp.Ver1;

import java.util.LinkedList;
import java.util.List;
//import java.io.Console;
import java.util.Scanner;


public class Workshop1 {
  public static void main(String[] args) {

    List<String> shoppingCart = new LinkedList<>();

    //create scanner
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to your shopping cart.");
    
    //cart empty
    scan.nextLine();
    System.out.println("Your cart is empty.");
    
    //add apple
    scan.nextLine();
    shoppingCart.add("apple");
    System.out.println("apple added to cart.");
    
    //add orange
    scan.nextLine();
    shoppingCart.add("orange");
    System.out.println("orange added to cart.");
    
    //add pear
    scan.nextLine();
    shoppingCart.add("pear");
    System.out.println("pear added to cart.");

    //show list
    System.out.println("Your cart:");
    for (String list: shoppingCart)
    System.out.println(list);
 
    //delete orange
    System.out.println("Do you want to remove anything?");
    scan.nextLine();
    shoppingCart.remove("orange");
    System.out.println("orange removed from cart.");

    //show updated list
    System.out.println("Your cart:");
    for (String list: shoppingCart)
    System.out.println(list);

    //add apple and grape
    scan.nextLine();
    shoppingCart.add("apple");
    shoppingCart.add("grape");
    System.out.println("apple added to cart.");
    System.out.println("grape added to cart.");

    //show updated list
    System.out.println("Your cart:");
    for (String list: shoppingCart)
    System.out.println(list);

    
    scan.close();
    
}
  }
 /* 
    Console cons = System.console();

    String item = "";

    while (true) {
      item = cons.readLine("Welcome to your shopping cart");
      item = item.trim();

      if (item.equals("List")) {
        System.out.println("Your cart is empty");
        break ;
    }*/   
