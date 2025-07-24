package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be entered: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] name_vet = new String[n];
        int[] age_vet = new int[n];
        double[] height_vet = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "\u00AA pessoa: ");

            System.out.print("Name: ");
            name_vet[i] = sc.nextLine();

            System.out.print("Age: ");
            age_vet[i] = sc.nextInt();

            System.out.print("Height: ");
            height_vet[i] = sc.nextDouble();
            sc.nextLine();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += height_vet[i];
        }

        double avg = sum / n;
        System.out.print("Average height: " + avg);
        sc.nextLine();

        int countUnder16 = 0;
        for (int i = 0; i < n; i++) {
            if (age_vet[i] < 16) {
                countUnder16++;
            }
        }

        double percent = (countUnder16 * 100.0) / n;
        System.out.print("Percentage of people under 16: " + percent);

        sc.close();
    }
}