/* 
package myapp;

import java.util.LinkedList;
import java.util.List;
import java.io.Console;

public class TodoList {
 
  public static void main(String[] args) {

    // Create a list of numbers
    List<Integer> listOfInt = new LinkedList<>();

    // Get the console
    Console cons = System.console();

    String item = " ";

    while (true) {
      item = cons.readLine("Please enter a number: ");
      item = item.trim();

      if ("stop".equals(item))
          break ;

          //Add the item to the list
          listOfInt.add(Integer.parseInt(item));
    }

    System.out.printf("Number of elements in the list: %d/n", listOfInt.size());
    for (Integer index = O; index < listOfInt.size(); index++)
        System.out.printf("[%d]:%s\n", index, listOfInt.get(index));
  }
}
*/
package myapp;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class TodoList {

    public static void main(String[] args) {

        // Create a list of numbers
        List<Integer> listOfInt = new LinkedList<>();

        // Get the console 
        Console cons = System.console();

        String item = "";

        while (true) {
            item = cons.readLine("Please enter a number: ");
            item = item.trim();

            if ("stop".equals(item))
                break;

            // Add the item to the list
            listOfInt.add(Integer.parseInt(item));
        }

        System.out.printf("Number of elements in the list: %d\n", listOfInt.size());
        for (Integer index = 0; index < listOfInt.size(); index++)
            System.out.printf("[%d]: %s\n", (index + 1), listOfInt.get(index));
    }
}