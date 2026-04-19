package pekan3_2511531020;

import java.util.Scanner;
import java.util.Stack;

public class Browser_2511531020 {
    public static void main(String[] args) {
        Stack<Website_2511531020> history = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== Browser History NIM: 2511531020 ===");
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Cek Status History");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Judul: ");
                    String judul = sc.nextLine();
                    System.out.print("Masukkan URL: ");
                    String url = sc.nextLine();
                    history.push(new Website_2511531020(judul, url));
                    System.out.println("Berhasil mengunjungi halaman!\n");
                    break;
                case 2:
                    if (!history.isEmpty()) {
                        Website_2511531020 removed = history.pop();
                        System.out.println("Kembali dari halaman: " + removed.getJudul_1020() + "\n");
                    } else {
                        System.out.println("History kosong, tidak ada halaman untuk kembali.\n");
                    }
                    break;
                case 3:
                    if (!history.isEmpty()) {
                        System.out.println("Halaman aktif: " + history.peek() + "\n");
                    } else {
                        System.out.println("Tidak ada halaman aktif.\n");
                    }
                    break;
                case 4:
                    System.out.println("Jumlah riwayat: " + history.size());
                    System.out.println("Apakah history kosong? " + history.isEmpty() + "\n");
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.\n");
            }
        } while (pilihan != 5);

        sc.close();
    }
}
