package chapter4;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10) {
            System.out.print("Enter grade (0-100): ");
            int grade = input.nextInt();

            if (grade >= 0 && grade <= 100) {
                total += grade;
                gradeCounter++;
            } else {
                System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
            }
        }

        int average = total / 10;

        System.out.printf("%nTotal of all 10 grades is %d%n", total);
        System.out.printf("Class average is %d%n", average);
    }
}