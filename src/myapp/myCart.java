package myapp;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class myCart {
  public static void main(String[] args) {
    Console cons = System.console();
    List<String> cart = new LinkedList<>();
    
    System.out.println("Welcome to your shopping cart");

    while(true) {
      String input = cons.readLine("> ");

      if (input.equals("list") && cart.size() <= 0) {
        System.out.println("Your cart is empty.");
      } else if (input.equals("list") && cart.size() >=1) {
        for (Integer index = 0; index < cart.size(); index++)
            System.out.printf("[%d]: %s\n", (index + 1), cart.get(index));}
            
         
         
      if (input.equals("add apple")) {
        cart.add("apple");
        System.out.println("apple added to cart");
      } else if (input.equals("add orange")) {
        cart.add("orange");
        System.out.println("orange added to cart");
      } else if (input.equals("add pear")) {
        cart.add("pear");
        System.out.println("pear added to cart");
      } else if (input.equals("add grape")) {
        cart.add("grape");
        System.out.println("grape added to cart");}

        
      if (input.equals("delete 2")) {
        cart.remove(1);
        System.out.println("orange removed from cart");
      } 
    }
  }
  }

