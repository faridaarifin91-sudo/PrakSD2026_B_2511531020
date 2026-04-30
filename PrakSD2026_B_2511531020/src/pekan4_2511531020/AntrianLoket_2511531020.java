package pekan4_2511531020;

import java.util.Scanner;

public class AntrianLoket_2511531020 {
    public static void main(String[] args) {
        Scanner sc_1020 = new Scanner(System.in);
        Queue_2511531020 antrian_1020 = new Queue_2511531020(10);

        int pilih_1020;
        do {
            System.out.println("\nPROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih_1020 = sc_1020.nextInt();
            sc_1020.nextLine(); // membersihkan buffer

            switch (pilih_1020) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama_1020 = sc_1020.nextLine();
                    antrian_1020.enqueue_1020(nama_1020);
                    break;
                case 2:
                    antrian_1020.dequeue_1020();
                    break;
                case 3:
                    antrian_1020.display_1020();
                    break;
                case 4:
                    antrian_1020.reverse_1020();
                    break;
                case 5:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih_1020 != 5);

        sc_1020.close();
    }
}
