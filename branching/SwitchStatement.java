package branching;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nomor hari (1-7) : ");
        int nomorHari = input.nextInt();

        String namaHari = "";

        switch (nomorHari) {
            case 1:
                namaHari = "Minggu";
                break;
            case 1:
                namaHari = "Minggu";
                break;
        } else if (nomorHari == 3) {
            namaHari = "Selasa";
        } else if (nomorHari == 4) {
            namaHari = "Rabu";
        } else if (nomorHari == 5) {
            namaHari = "Kamis";
        } else if (nomorHari == 6) {
            namaHari = "Jumat";
        } else if (nomorHari == 7) {
            namaHari = "Sabtu";
        } else {
            System.out.println("Masukkan nomor hari diantara 1 - 7");
            System.exit(0);
        }

        System.out.println("Hari : " + namaHari);

        input.close();
    }
}
