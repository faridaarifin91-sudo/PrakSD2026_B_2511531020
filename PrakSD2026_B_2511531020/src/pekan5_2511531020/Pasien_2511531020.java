package pekan5_2511531020;

public class Pasien_2511531020 {
    // Atribut
    private String namaPasien_1020;
    private String penyakit_1020;
    private int nomorAntrian_1020;
    Pasien_2511531020 next_1020; // pointer ke pasien berikutnya

    // Constructor
    public Pasien_2511531020(String namaPasien_1020, String penyakit_1020, int nomorAntrian_1020) {
        this.namaPasien_1020 = namaPasien_1020;
        this.penyakit_1020 = penyakit_1020;
        this.nomorAntrian_1020 = nomorAntrian_1020;
        this.next_1020 = null;
    }

    // Getter
    public String getNamaPasien_1020() { return namaPasien_1020; }
    public String getPenyakit_1020() { return penyakit_1020; }
    public int getNomorAntrian_1020() { return nomorAntrian_1020; }
    public Pasien_2511531020 getNext_1020() { return next_1020; }

    // Setter
    public void setNamaPasien_1020(String namaPasien_1020) { this.namaPasien_1020 = namaPasien_1020; }
    public void setPenyakit_1020(String penyakit_1020) { this.penyakit_1020 = penyakit_1020; }
    public void setNomorAntrian_1020(int nomorAntrian_1020) { this.nomorAntrian_1020 = nomorAntrian_1020; }
    public void setNext_1020(Pasien_2511531020 next_1020) { this.next_1020 = next_1020; }
}
