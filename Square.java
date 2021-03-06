import java.util.Scanner;

// Create a Square class
public class Square implements Shape {
  int side;

  // Create a class constructor for the Square class
  public Square() {
    // Create a Scanner object
    Scanner myObj = new Scanner(System.in);
    System.out.print("Enter side: ");

    side = Integer.parseInt(myObj.nextLine());  // Read user input
  }

  public String getName() {
    return "square";
  }

  public void area() {
    System.out.println(getName() + " area: " + side * side);
  }

  public static void main(String[] args) {
    Square square = new Square();
    square.area();
  }
}
