import java.util.Scanner;
/**
 This program demonstrates static methods
 */
public class Geometry
{
    public static void main(String[] args)
    {
        int choice; // The user's choice
        double value = 0; // The method's return value
        char letter; // The user's Y or N decision
        double radius; // The radius of the circle
        double length; // The length of the rectangle
        double width; // The width of the rectangle
        double height; // The height of the triangle
        double base; // The base of the triangle
        double side1; // The first side of the triangle
        double side2; // The second side of the triangle
        double side3; // The third side of the triangle
        // Create a scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);
        // The do loop allows the menu to be displayed first
        do
        {
            // TASK #1 Call the printMenu method
            printMenu();

            choice = keyboard.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter the radius of " +
                            "the circle: ");
                    radius = keyboard.nextDouble();
                    // TASK #3 Call the circleArea method and
                    circleArea(radius);
                    // store the result in the value variable
                    value = circleArea(radius);
                    System.out.println("The area of the " +
                            "circle is " + value);
                    break;
                case 2:
                    System.out.print("Enter the length of " +
                            "the rectangle: ");
                    length = keyboard.nextDouble();
                    System.out.print("Enter the width of " +
                            "the rectangle: ");
                    width = keyboard.nextDouble();
                    // TASK #3 Call the rectangleArea method and
                    rectangleArea(length, width);
                    // store the result in the value variable
                    value = rectangleArea(length, width);
                    System.out.println("The area of the " +
                            "rectangle is " + value);
                    break;
                case 3:
                    System.out.print("Enter the height of " +
                            "the triangle: ");
                    height = keyboard.nextDouble();
                    System.out.print("Enter the base of " +
                            "the triangle: ");
                    base = keyboard.nextDouble();
                    // TASK #3 Call the triangleArea method and
                    triangleArea(height, base);
                    // store the result in the value variable
                    value = triangleArea(height, base);
                    System.out.println("The area of the " +
                            "triangle is " + value);
                    break;
                case 4:
                    System.out.print("Enter the radius of " +
                            "the circle: ");
                    radius = keyboard.nextDouble();

                    // TASK #3 Call the circumference method and
                    circleCircumference(radius);
                    // store the result in the value variable
                    value = circleCircumference(radius);
                    System.out.println("The circumference " +
                            "of the circle is " +
                            value);
                    break;
                case 5:
                    System.out.print("Enter the length of " +
                            "the rectangle: ");
                    length = keyboard.nextDouble();
                    System.out.print("Enter the width of " +
                            "the rectangle: ");
                    width = keyboard.nextDouble();
                    // TASK #3 Call the perimeter method and
                    rectanglePerimeter(length, width);
                    // store the result in the value variable
                    value = rectanglePerimeter(length, width);
                    System.out.println("The perimeter of " +
                            "the rectangle is " +
                            value);
                    break;
                case 6:
                    System.out.print("Enter the length of " +
                            "side 1 of the " +
                            "triangle: ");
                    side1 = keyboard.nextDouble();
                    System.out.print("Enter the length of " +
                            "side 2 of the " +
                            "triangle: ");
                    side2 = keyboard.nextDouble();
                    System.out.print("Enter the length of " +
                            "side 3 of the " +
                            "triangle: ");
                    side3 = keyboard.nextDouble();
                    // TASK #3 Call the perimeter method and store the result in the value variable
                    trianglePerimeter(side1, side2, side3);
                    value = trianglePerimeter(side1, side2, side3);

                    System.out.println("The perimeter of " +
                            "the triangle is " +
                            value);
                    break;
                default:
                    System.out.println("You did not enter " +
                            "a valid choice.");
            }

            keyboard.nextLine(); // Consume the new line
            System.out.println("Do you want to exit " +
                    "the program (Y/N)?: ");
            String answer = keyboard.nextLine();
            letter = answer.charAt(0);
        } while(letter != 'Y' && letter != 'y');
    }
    // TASK #1 Create the printMenu method here
    static void printMenu(){
        System.out.println("This is a geometry calculator");
        System.out.println("Choose what you would like to calculate");
        System.out.println("1. Find the area of a circle");
        System.out.println("2. Find the area of a rectangle");
        System.out.println("3. Find the area of a triangle");
        System.out.println("4. Find the circumference of a circle");
        System.out.println("5. Find the perimeter of a rectangle");
        System.out.println("6. Find the perimeter of a triangle");
        System.out.println("Enter the number of your choice: ");
    }

    // TASK #2 Create the value-returning methods here
    static double circleArea(double radius){
        return Math.PI * Math.pow(radius, 2.0);
    }

    static double rectangleArea(double length, double width){
        return length * width;
    }
    static double triangleArea(double height, double base){
        return (height * base) / 2.0;
    }
    static double circleCircumference(double radius){
        return 2.0 * Math.PI * radius;
    }
    static double rectanglePerimeter(double length, double width){
        return 2.0 * (length + width);
    }
    static double trianglePerimeter(double side1, double side2, double side3){
        return side1 + side2 + side3;
    }
    // TASK #4 Write javadoc comments for each method
}
