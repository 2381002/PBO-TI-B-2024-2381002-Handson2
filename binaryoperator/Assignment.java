package binaryoperator;

import java.sql.SQLOutput;

public class Assignment {
    public static void main(String[] args) {
        // 1. Operator assignment dasar
        int angka = 10;
        String nama = "Gabriel Hutagaol";

        // 2. Operator assignment aritmatika
        int x = 5;
        x += 3;
        System.out.println("Nilai x setelah += 3 adalah" + x);

        int y = 5;
        y -= 3; // x = x - 3
        System.out.println("Nilai x setelah -= 3 adalah" + y);

        int z = 5;
        z *= 3; // x = x + 3
        System.out.println("Nilai x setelah *= 3 adalah" + z);

        int a = 20;
        a /= 4; // x = x / 4
        System.out.println("Nilai a setelah /= 4 adalah" + a);

        int b = 20;
        b %= 4; // x = x % 4
        System.out.println("Nilai b setelah %= 4 adalah" + b);
    }
}
