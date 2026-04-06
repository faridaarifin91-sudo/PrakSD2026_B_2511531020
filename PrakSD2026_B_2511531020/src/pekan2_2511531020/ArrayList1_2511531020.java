package pekan2_2511531020;

import java.util.ArrayList;

public class ArrayList1_2511531020 {

    public static void main(String[] args) {
        // ukuran ArrayList
        int n = 5;

        // Deklarasi ArrayList dengan tipe Integer
        ArrayList<Integer> arrli = new ArrayList<>(n);

        // Menambahkan elemen baru ke dalam list
        for (int i = 1; i <= n; i++) {
            arrli.add(i);
        }

        // mencetak elemen
        System.out.println(arrli);

        // Menghapus elemen pada indeks ke-3 (ingat: index mulai dari 0)
        arrli.remove(3);

        // Menampilkan ArrayList setelah penghapusan
        System.out.println(arrli);

        // mencetak elemen satu per satu secara horizontal
        for (int i = 0; i < arrli.size(); i++) {
            System.out.print(arrli.get(i) + " ");
        }
        System.out.println(); // baris baru setelah selesai
    }
}
