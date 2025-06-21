

import java.util.*;

public class EnrollmentForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] enrollment = new int[4];
        System.out.println("Enter student enrollment for past 4 years:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Year " + (2020 + i) + ": ");
            enrollment[i] = scanner.nextInt();
        }

     
        double totalGrowth = 0;
        for (int i = 1; i < 4; i++) {
            totalGrowth += (double)(enrollment[i] - enrollment[i - 1]) / enrollment[i - 1];
        }
        double avgGrowthRate = totalGrowth / 3;

        System.out.print("Enter number of future years to forecast: ");
        int years = scanner.nextInt();

        int currentEnrollment = enrollment[3];
        System.out.println("\nForecasted Enrollment:");
        for (int i = 1; i <= years; i++) {
            currentEnrollment += currentEnrollment * avgGrowthRate;
            System.out.printf("Year %d: %d students%n", 2023 + i, currentEnrollment);
        }

        scanner.close();
    }
}
