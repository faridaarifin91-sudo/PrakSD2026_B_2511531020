package pekan2_2511531020;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511531020 {
    private ArrayList<Musik_2511531020> daftarLagu_1020;

    public Playlist_2511531020() {
        daftarLagu_1020 = new ArrayList<>();
    }

    // Tambah Lagu
    public void tambahLagu(Musik_2511531020 lagu) {
        daftarLagu_1020.add(lagu);
        System.out.println("Data berhasil ditambahkan!");
    }

    // Lihat Playlist
    public void lihatPlaylist() {
        if (daftarLagu_1020.isEmpty()) {
            System.out.println("Playlist kosong.");
        } else {
            System.out.println("=== Daftar Lagu ===");
            for (int i = 0; i < daftarLagu_1020.size(); i++) {
                System.out.println((i + 1) + ". " + daftarLagu_1020.get(i));
            }
        }
    }

    // Hapus Lagu berdasarkan indeks
    public void hapusLagu(int index) {
        if (index >= 0 && index < daftarLagu_1020.size()) {
            Musik_2511531020 terhapus = daftarLagu_1020.remove(index);
            System.out.println("Lagu \"" + terhapus.getJudul_1020() + "\" berhasil dihapus.");
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }

    // Cek Kapasitas
    public void cekKapasitas() {
        System.out.println("Jumlah total lagu: " + daftarLagu_1020.size());
    }

    // Main Program
    public static void main(String[] args) {
        Playlist_2511531020 playlist = new Playlist_2511531020();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Playlist Musik NIM: 2511531020 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Lihat Playlist");
            System.out.println("3. Hapus Lagu");
            System.out.println("4. Cek Kapasitas");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Judul: ");
                    String judul = sc.nextLine();
                    System.out.print("Masukkan Penyanyi: ");
                    String penyanyi = sc.nextLine();
                    System.out.print("Masukkan Durasi (detik): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    playlist.tambahLagu(new Musik_2511531020(judul, penyanyi, durasi));
                    break;
                case 2:
                    playlist.lihatPlaylist();
                    break;
                case 3:
                    playlist.lihatPlaylist();
                    System.out.print("Masukkan nomor lagu yang akan dihapus: ");
                    int index = sc.nextInt() - 1;
                    sc.nextLine();
                    playlist.hapusLagu(index);
                    break;
                case 4:
                    playlist.cekKapasitas();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        sc.close();
    }
}
