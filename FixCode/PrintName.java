import java.util.Scanner;

public class PrintName {
  public static void main(String[] args) {
    System.out.println("Please enter your name!");
    String name = new Scanner(System.in).nextLine();
    System.out.println("Hello, " + name);
  }
}
