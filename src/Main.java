import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double sideLong = 0;
        double sideShort = 0;
        String trash = "";

        System.out.print("Enter the length of one of the rectangle's long sides: ");
        if(in.hasNextDouble()) {
            sideLong = in.nextDouble();
            in.nextLine();

            System.out.println("You said the first side length was: " + sideLong);
        } else {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid length");
        }

        System.out.print("Enter the length of one of the rectangle's short sides: ");
        if(in.hasNextDouble()) {
            sideShort = in.nextDouble();
            in.nextLine();

            System.out.println("You said the second size length was: " + sideShort);
        } else {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid length");
        }

        if(sideLong > sideShort) {
            double perimeter = (sideLong * 2) + (sideShort * 2);
            double diagonal = Math.sqrt((sideLong * sideLong) + (sideShort * sideShort));

            System.out.println("Perimeter: " + perimeter);
            System.out.println("Diagonal: " + diagonal);
        } else {
            System.out.println("You entered side lengths incorrectly.");
        }
    }
}