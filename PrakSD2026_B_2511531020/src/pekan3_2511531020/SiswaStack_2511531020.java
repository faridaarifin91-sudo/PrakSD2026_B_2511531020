package pekan3_2511531020;

import java.util.ArrayList;

class Siswa_2511531020 {
    String nama;
    int nim;

    public Siswa_2511531020(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    @Override
    public String toString() {
        return "Nim: " + nim + ", Nama: " + nama;
    }
}

public class SiswaStack_2511531020 {
    private ArrayList<Siswa_2511531020> stack;

    public SiswaStack_2511531020() {
        stack = new ArrayList<>();
    }

    public void push_2511531020(Siswa_2511531020 mhs) {
        stack.add(mhs);
    }

    public Siswa_2511531020 pop_2511531020() {
        if (!isEmpty_2511531020()) {
            return stack.remove(stack.size() - 1);
        }
        return null;
    }

    public Siswa_2511531020 peek_2511531020() {
        if (!isEmpty_2511531020()) {
            return stack.get(stack.size() - 1);
        }
        return null;
    }

    public boolean isEmpty_2511531020() {
        return stack.isEmpty();
    }

    public void tampilkanSiswa_2511531020() {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }

    public static void main(String[] args) {
        SiswaStack_2511531020 studentStack = new SiswaStack_2511531020();

        Siswa_2511531020 mhs1 = new Siswa_2511531020("Ali", 1);
        Siswa_2511531020 mhs2 = new Siswa_2511531020("Boby", 2);
        Siswa_2511531020 mhs3 = new Siswa_2511531020("Charles", 3);

        studentStack.push_2511531020(mhs1);
        studentStack.push_2511531020(mhs2);
        studentStack.push_2511531020(mhs3);

        System.out.println("Siswa di dalam stack:");
        studentStack.tampilkanSiswa_2511531020();

        System.out.println("Siswa teratas: " + studentStack.peek_2511531020());
        System.out.println("Mengeluarkan siswa: " + studentStack.pop_2511531020());

        System.out.println("Setelah pop:");
        studentStack.tampilkanSiswa_2511531020();
    }
}