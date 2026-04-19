package pekan2_2511531020;

public class Musik_2511531020 {
    private String judul_1020;
    private String penyanyi_1020;
    private int durasi_1020;

    // Constructor
    public Musik_2511531020(String judul_1020, String penyanyi_1020, int durasi_1020) {
        this.judul_1020 = judul_1020;
        this.penyanyi_1020 = penyanyi_1020;
        this.durasi_1020 = durasi_1020;
    }

    // Getter
    public String getJudul_1020() {
        return judul_1020;
    }

    public String getPenyanyi_1020() {
        return penyanyi_1020;
    }

    public int getDurasi_1020() {
        return durasi_1020;
    }

    // Setter
    public void setJudul_1020(String judul_1020) {
        this.judul_1020 = judul_1020;
    }

    public void setPenyanyi_1020(String penyanyi_1020) {
        this.penyanyi_1020 = penyanyi_1020;
    }

    public void setDurasi_1020(int durasi_1020) {
        this.durasi_1020 = durasi_1020;
    }

    // Representasi String
    @Override
    public String toString() {
        return "Judul: " + judul_1020 + ", Penyanyi: " + penyanyi_1020 + ", Durasi: " + durasi_1020 + " detik";
    }
}
