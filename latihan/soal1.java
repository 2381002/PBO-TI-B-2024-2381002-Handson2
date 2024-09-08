package latihan;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        /**
         * Buatlah sebuah program yang mencari nilai maksimum dari 2 bilangan
         *  **/
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan bilangan pertama: ");
        int bilangan1 = input.nextInt();

        System.out.println("Masukkan bilangan kedua: ");
        int bilangan2 = input.nextInt();

        int maksimum = (bilangan1 > bilangan2) ? bilangan1 : bilangan2;

        System.out.println("Nilai maksimum dari " + bilangan1 + " dan " + bilangan2 + " adalah: " + maksimum);

        input.close();
    }
}
