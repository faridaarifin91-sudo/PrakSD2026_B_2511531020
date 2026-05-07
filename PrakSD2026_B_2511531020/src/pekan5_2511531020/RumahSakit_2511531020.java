package pekan5_2511531020;

import java.util.Scanner;

public class RumahSakit_2511531020 {
    private Pasien_2511531020 head_1020;
    private int counter_1020; // nomor antrian auto-increment

    public RumahSakit_2511531020() {
        head_1020 = null;
        counter_1020 = 0;
    }

    // Daftarkan Pasien (Insert at Tail)
    public void daftarkanPasien_1020(String nama_1020, String penyakit_1020) {
        counter_1020++;
        Pasien_2511531020 newPasien_1020 = new Pasien_2511531020(nama_1020, penyakit_1020, counter_1020);
        if (head_1020 == null) {
            head_1020 = newPasien_1020;
        } else {
            Pasien_2511531020 temp_1020 = head_1020;
            while (temp_1020.getNext_1020() != null) {
                temp_1020 = temp_1020.getNext_1020();
            }
            temp_1020.setNext_1020(newPasien_1020);
        }
        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counter_1020);
    }

    // Panggil Pasien (Delete Head)
    public void panggilPasien_1020() {
        if (head_1020 == null) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Memanggil Pasien: " + head_1020.getNamaPasien_1020() +
                " | Keluhan: " + head_1020.getPenyakit_1020() +
                " | Nomor Antrian: " + head_1020.getNomorAntrian_1020());
        head_1020 = head_1020.getNext_1020();
    }

    // Tampilkan Antrian (Display)
    public void tampilkanAntrian_1020() {
        if (head_1020 == null) {
            System.out.println("Antrian kosong!");
            return;
        }
        Pasien_2511531020 temp_1020 = head_1020;
        System.out.println("=== Daftar Antrian Pasien ===");
        while (temp_1020 != null) {
            System.out.println("Nomor: " + temp_1020.getNomorAntrian_1020() +
                    " | Nama: " + temp_1020.getNamaPasien_1020() +
                    " | Keluhan: " + temp_1020.getPenyakit_1020());
            temp_1020 = temp_1020.getNext_1020();
        }
    }

    // Cari Pasien (Search by Name)
    public void cariPasien_1020(String nama_1020) {
        Pasien_2511531020 temp_1020 = head_1020;
        while (temp_1020 != null) {
            if (temp_1020.getNamaPasien_1020().equalsIgnoreCase(nama_1020)) {
                System.out.println("Pasien ditemukan! Nomor Antrian: " + temp_1020.getNomorAntrian_1020() +
                        " | Nama: " + temp_1020.getNamaPasien_1020() +
                        " | Keluhan: " + temp_1020.getPenyakit_1020());
                return;
            }
            temp_1020 = temp_1020.getNext_1020();
        }
        System.out.println("Pasien dengan nama " + nama_1020 + " tidak ditemukan.");
    }

    // Cek Status Antrian
    public void cekStatusAntrian_1020() {
        if (head_1020 == null) {
            System.out.println("Antrian kosong!");
            return;
        }
        int jumlah_1020 = 0;
        Pasien_2511531020 temp_1020 = head_1020;
        while (temp_1020 != null) {
            jumlah_1020++;
            temp_1020 = temp_1020.getNext_1020();
        }
        System.out.println("Jumlah pasien: " + jumlah_1020);
        System.out.println("Pasien terdepan: " + head_1020.getNamaPasien_1020() +
                " | Keluhan: " + head_1020.getPenyakit_1020());
    }

    // Main Program
    public static void main(String[] args) {
        Scanner sc_1020 = new Scanner(System.in);
        RumahSakit_2511531020 rs_1020 = new RumahSakit_2511531020();
        int pilihan_1020;

        do {
            System.out.println("\n=== Antrian Rumah Sakit NIM: 2511531020 ===");
            System.out.println("1. Daftarkan Pasien");
            System.out.println("2. Panggil Pasien");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Cari Pasien");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan_1020 = sc_1020.nextInt();
            sc_1020.nextLine(); // clear buffer

            switch (pilihan_1020) {
                case 1:
                    System.out.print("Masukkan Nama Pasien: ");
                    String nama_1020 = sc_1020.nextLine();
                    System.out.print("Masukkan Keluhan: ");
                    String penyakit_1020 = sc_1020.nextLine();
                    rs_1020.daftarkanPasien_1020(nama_1020, penyakit_1020);
                    break;
                case 2:
                    rs_1020.panggilPasien_1020();
                    break;
                case 3:
                    rs_1020.tampilkanAntrian_1020();
                    break;
                case 4:
                    System.out.print("Masukkan Nama Pasien yang dicari: ");
                    String cari_1020 = sc_1020.nextLine();
                    rs_1020.cariPasien_1020(cari_1020);
                    break;
                case 5:
                    rs_1020.cekStatusAntrian_1020();
                    break;
                case 6:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan_1020 != 6);
        sc_1020.close();
    }
}
