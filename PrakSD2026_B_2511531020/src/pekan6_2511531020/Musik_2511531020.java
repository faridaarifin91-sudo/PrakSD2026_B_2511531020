package pekan6_2511531020;

import java.util.Scanner;

public class Musik_2511531020 {
    private Lagu_2511531020 head_1020;
    private Lagu_2511531020 tail_1020;

    // 1. Tambah Lagu
    public void tambahLagu_1020(String judul_1020, String penyanyi_1020) {
        Lagu_2511531020 laguBaru_1020 = new Lagu_2511531020(judul_1020, penyanyi_1020);
        if (head_1020 == null) {
            head_1020 = tail_1020 = laguBaru_1020;
        } else {
            tail_1020.next_1020 = laguBaru_1020;
            laguBaru_1020.prev_1020 = tail_1020;
            tail_1020 = laguBaru_1020;
        }
        System.out.println("Lagu berhasil ditambahkan!");
    }

    // 2. Hapus Lagu Pertama
    public void hapusLaguAwal_1020() {
        if (head_1020 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        System.out.println("Menghapus: " + head_1020.getJudul_1020());
        head_1020 = head_1020.next_1020;
        if (head_1020 != null) {
            head_1020.prev_1020 = null;
        } else {
            tail_1020 = null;
        }
    }

    // 3. Tampil Maju
    public void tampilMaju_1020() {
        if (head_1020 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        Lagu_2511531020 temp_1020 = head_1020;
        while (temp_1020 != null) {
            System.out.println(temp_1020.getJudul_1020() + " - " + temp_1020.getPenyanyi_1020());
            temp_1020 = temp_1020.next_1020;
        }
    }

    // 4. Tampil Mundur
    public void tampilMundur_1020() {
        if (tail_1020 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        Lagu_2511531020 temp_1020 = tail_1020;
        while (temp_1020 != null) {
            System.out.println(temp_1020.getJudul_1020() + " - " + temp_1020.getPenyanyi_1020());
            temp_1020 = temp_1020.prev_1020;
        }
    }

    // 5. Cari Lagu
    public void cariLagu_1020(String judul_1020) {
        if (head_1020 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        Lagu_2511531020 temp_1020 = head_1020;
        boolean ditemukan_1020 = false;
        while (temp_1020 != null) {
            if (temp_1020.getJudul_1020().equalsIgnoreCase(judul_1020)) {
                System.out.println("Lagu ditemukan: " + temp_1020.getJudul_1020() + " - " + temp_1020.getPenyanyi_1020());
                ditemukan_1020 = true;
                break;
            }
            temp_1020 = temp_1020.next_1020;
        }
        if (!ditemukan_1020) {
            System.out.println("Lagu tidak ditemukan!");
        }
    }

    // Main dengan menu interaktif
    public static void main(String[] args) {
        Musik_2511531020 playlist_1020 = new Musik_2511531020();
        Scanner sc_1020 = new Scanner(System.in);
        int pilihan_1020;

        do {
            System.out.println("\n=== Playlist Musik NIM: 2511531020 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan_1020 = sc_1020.nextInt();
            sc_1020.nextLine();

            switch (pilihan_1020) {
                case 1:
                    System.out.print("Judul: ");
                    String judul_1020 = sc_1020.nextLine();
                    System.out.print("Penyanyi: ");
                    String penyanyi_1020 = sc_1020.nextLine();
                    playlist_1020.tambahLagu_1020(judul_1020, penyanyi_1020);
                    break;
                case 2:
                    playlist_1020.hapusLaguAwal_1020();
                    break;
                case 3:
                    playlist_1020.tampilMaju_1020();
                    break;
                case 4:
                    playlist_1020.tampilMundur_1020();
                    break;
                case 5:
                    System.out.print("Masukkan judul lagu: ");
                    String cari_1020 = sc_1020.nextLine();
                    playlist_1020.cariLagu_1020(cari_1020);
                    break;
                case 6:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan_1020 != 6);

        sc_1020.close();
    }
}
