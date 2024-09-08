package latihan;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        /**
         * Buatlah program kalkulator sederhana dengan operator aritmatika (+, -, *, /, %)
         * **/

        // Menggunakan metode method
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan bilangan pertama: ");
        double bilangan1 = input.nextDouble();

        System.out.println("Masukkan (+, -, *, /, %): ");
        char operator = input.next().charAt(0);

        System.out.println("Masukkan bilangan kedua: ");
        double bilangan2 = input.nextDouble();

        double hasil = 0;

        // Memanggil method operator
        switch (operator) {
            case '+':
                hasil = tambah(bilangan1, bilangan2);
                break;
        }

    }
}
