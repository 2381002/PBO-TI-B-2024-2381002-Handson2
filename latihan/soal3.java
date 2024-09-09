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

        // Pemanggilan Method sesuai Operator
        switch (operator) {
            case '+':
                hasil = tambah(bilangan1, bilangan2);
                break;
            case '-':
                hasil = kurang(bilangan1, bilangan2);
                break;
            case '*':
                hasil = kali(bilangan1, bilangan2);
                break;
            case '/':
                if (bilangan2 != 0) {
                    hasil = bagi(bilangan1, bilangan2);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    return;
                }
                break;
            case '%':
                hasil = mod(bilangan1, bilangan2);
                break;
            default:
                System.out.println("Operator tidak valid.");
                return;
        }

        // Menampilkan hasil operasi
        System.out.println("Hasil: " + hasil);
        input.close();
    }

    // Method untuk penjumlahan
    public static double tambah(double a, double b) {
        return a + b;
    }

    // Method untuk pengurangan
    public static double kurang(double a, double b) {
        return a - b;
    }

    // Method untuk perkalian
    public static double kali(double a, double b) {
        return a * b;
    }

    // Method untuk pembagian
    public static double bagi(double a, double b) {
        return a / b;
    }

    // Method untuk modulus
    public static double mod(double a, double b) {
        return a % b;
    }
}
