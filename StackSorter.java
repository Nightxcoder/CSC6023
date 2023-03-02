import java.util.Collections;
import java.util.Stack;
import java.util.Scanner;

/**
 * A program that reads a list of Integer numbers from the input and saves
 * them into a stack sorted from smallest to largest.
 */
public class StackSorter {

/** Main method that reads a list of integers from the user, saves them in a linked list, 
 * sorts them, and prints the sorted stack to the console
 */
/** @param args an array of command -line arguments */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Stack<Integer> numbers = new Stack<>();

    System.out.println("Enter a list of numbers, separated by spaces: ");
    String[] input = scanner.nextLine().split(" ");
    for (String s : input) {
      numbers.push(Integer.parseInt(s));
    }

    // Sort the list from smallest to largest
    sortStack(numbers);

    System.out.println("Sorted stack: " + numbers);
    scanner.close();
  }
   /**
   * A sorting method for stacks that sorts the elements from smallests to largest order
   * @param stack The stack to be sorted
   */
  public static void sortStack(Stack<Integer> stack) {
    Stack<Integer> tempStack = new Stack<>();
    while (!stack.isEmpty()) {
      int temp = stack.pop();
      while (!tempStack.isEmpty() && tempStack.peek() < temp) {
        stack.push(tempStack.pop());
      }
      tempStack.push(temp);
    }
    while (!tempStack.isEmpty()) {
      stack.push(tempStack.pop());
    }
  }
}