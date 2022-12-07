package myapp.Ver1;

import java.io.Console;

public class Hello {
  
  public static void main(String[] args) {

    //Get system console
    Console cons = System.console();

    //Read from the console, the result is assigned to a variables
    String name = " ";
    while (name.trim().length() <= 0) {
    name = cons.readLine("What is your name?");

    if (name.equals("fred")){
      System.out.println("Yabadabadoo");

    } else if (name.equals("barney")) {
      System.out.println("Hello barney");
    
    } else {
    System.out.printf("Hello %s. \n\tNice to meet you.\n", name.toUpperCase());
  }
  }
}
}