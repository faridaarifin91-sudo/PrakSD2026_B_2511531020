package pekan8_2511531020;

import java.util.Scanner;

// Kelas Lagu
class Lagu {
    String judul;
    String penyanyi;
    int durasi;

    Lagu(String judul, String penyanyi, int durasi) {
        this.judul = judul;
        this.penyanyi = penyanyi;
        this.durasi = durasi;
    }
}

// Kelas Sorting_NIM
public class Sorting_2511531020 {

    Lagu[] dataLagu_1020 = new Lagu[20];
    int jumlahData_1020 = 0;

    // Input minimal 7 lagu
    public void inputData_1020() {
        dataLagu_1020[jumlahData_1020++] = new Lagu("Mio Cristo Piange Diamanti", "Artis A", 270);
        dataLagu_1020[jumlahData_1020++] = new Lagu("La Rumba Del Perdon", "Artis B", 252);
        dataLagu_1020[jumlahData_1020++] = new Lagu("La Perla", "Artis C", 196);
        dataLagu_1020[jumlahData_1020++] = new Lagu("Song D", "Artis D", 310);
        dataLagu_1020[jumlahData_1020++] = new Lagu("Song E", "Artis E", 180);
        dataLagu_1020[jumlahData_1020++] = new Lagu("Song F", "Artis F", 220);
        dataLagu_1020[jumlahData_1020++] = new Lagu("Song G", "Artis G", 205);
    }

    // Tampil data
    public void tampilData_1020() {
        for (int i = 0; i < jumlahData_1020; i++) {
            System.out.println((i + 1) + ". " + dataLagu_1020[i].judul + " - " + dataLagu_1020[i].durasi + " detik");
        }
    }

    // ===========================
    // Quick Sort (Durasi Ascending)
    // ===========================
    public void quickSort_1020(int low, int high) {
        if (low < high) {
            int pi = partition_1020(low, high);
            quickSort_1020(low, pi - 1);
            quickSort_1020(pi + 1, high);
        }
    }

    private int partition_1020(int low, int high) {
        int pivot = dataLagu_1020[high].durasi;
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (dataLagu_1020[j].durasi <= pivot) {
                i++;
                Lagu temp = dataLagu_1020[i];
                dataLagu_1020[i] = dataLagu_1020[j];
                dataLagu_1020[j] = temp;
            }
        }
        Lagu temp = dataLagu_1020[i + 1];
        dataLagu_1020[i + 1] = dataLagu_1020[high];
        dataLagu_1020[high] = temp;
        return i + 1;
    }

    // ===========================
    // Merge Sort (Judul A-Z)
    // ===========================
    public void mergeSort_1020(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort_1020(left, mid);
            mergeSort_1020(mid + 1, right);
            merge_1020(left, mid, right);
        }
    }

    private void merge_1020(int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Lagu[] L = new Lagu[n1];
        Lagu[] R = new Lagu[n2];

        for (int i = 0; i < n1; i++) L[i] = dataLagu_1020[left + i];
        for (int j = 0; j < n2; j++) R[j] = dataLagu_1020[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i].judul.compareToIgnoreCase(R[j].judul) <= 0) {
                dataLagu_1020[k++] = L[i++];
            } else {
                dataLagu_1020[k++] = R[j++];
            }
        }
        while (i < n1) dataLagu_1020[k++] = L[i++];
        while (j < n2) dataLagu_1020[k++] = R[j++];
    }

    // ===========================
    // Shell Sort (Judul A-Z)
    // ===========================
    public void shellSort_1020() {
        int n = jumlahData_1020;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Lagu temp = dataLagu_1020[i];
                int j;
                for (j = i; j >= gap && dataLagu_1020[j - gap].judul.compareToIgnoreCase(temp.judul) > 0; j -= gap) {
                    dataLagu_1020[j] = dataLagu_1020[j - gap];
                }
                dataLagu_1020[j] = temp;
            }
        }
    }

    // ===========================
    // Main Program
    // ===========================
    public static void main(String[] args) {
        Sorting_2511531020 s = new Sorting_2511531020();
        s.inputData_1020();

        Scanner sc = new Scanner(System.in);
        System.out.println("=== Sorting Playlist NIM: 2511531020 ===");
        System.out.println("Pilih Algoritma (1=Shell, 2=Quick, 3=Merge): ");
        int pilihan = sc.nextInt();

        System.out.println("\nData Sebelum Sorting:");
        s.tampilData_1020();

        switch (pilihan) {
            case 1:
                s.shellSort_1020();
                System.out.println("\nData Setelah Shell Sort (Judul A-Z):");
                break;
            case 2:
                s.quickSort_1020(0, s.jumlahData_1020 - 1);
                System.out.println("\nData Setelah Quick Sort (Durasi Asc):");
                break;
            case 3:
                s.mergeSort_1020(0, s.jumlahData_1020 - 1);
                System.out.println("\nData Setelah Merge Sort (Judul A-Z):");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }

        s.tampilData_1020();
    }
}
