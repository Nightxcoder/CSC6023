import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * A program that reads a list of Integer numbers from the input and saves
 * them into a linked list sorted from smallest to largest.
 */
public class IntegerSorter {

/** Main method that reads a list of integers from the user, saves them in a linked list, 
 * sorts them, and prints the sorted list to the console
 */
/** @param args an array of command -line arguments */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    LinkedList<Integer> numbers = new LinkedList<>();

    System.out.println("Enter a list of numbers, separated by spaces: ");
    String[] input = scanner.nextLine().split(" ");
    for (String s : input) {
      numbers.add(Integer.parseInt(s));
    }

    // Sort the list from smallest to largest
    Collections.sort(numbers);

    System.out.println("Sorted list: " + numbers);
    scanner.close();
  }
}
