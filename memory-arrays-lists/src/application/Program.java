package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers are you going to enter: ");
        int n = sc.nextInt();
        int[] vet = new int[n];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Enter a number: ");
            vet[i] = sc.nextInt();
        }

        System.out.print("Negative Numbers: ");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < 0) {
                System.out.println(vet[i]);
            }
        }
        sc.close();
    }
}