
import java.util.Scanner;

public class BursaryQualification {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your gender (Male/Female): ");
        String gender = input.nextLine();

        System.out.print("Enter your course: ");
        String course = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your average mark: ");
        int mark = input.nextInt();

        System.out.println("\nWelcome " + name);

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        if (mark >= 50) {
            System.out.println("You passed.");
        } else {
            System.out.println("You failed.");
        }

        if (mark >= 75) {
            System.out.println("You achieved a distinction.");
        } else {
            System.out.println("No distinction achieved.");
        }

        if (gender.equalsIgnoreCase("Female")) {

            if (course.equalsIgnoreCase("ICT")) {

                if (age > 15 && age < 21) {

                    if (mark >= 70) {
                        System.out.println("Congratulations! You qualify for the ICT bursary.");
                    } else {
                        System.out.println("You need at least 70% to qualify.");
                    }

                } else {
                    System.out.println("You do not qualify because of your age.");
                }

            } else {
                System.out.println("You do not qualify because you are not studying ICT.");
            }

        } else {
            System.out.println("You do not qualify because the bursary is only for female students.");
        }

        input.close();
    }
}