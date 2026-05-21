package pekan7_2511531020;

public class Mahasiswa_2511531020 {
	
    private String nama_1020;
    private String nim_1020;
    private String prodi_1020;

    // Constructor
    public Mahasiswa_2511531020(String nama_1020, String nim_1020, String prodi_1020) {
        this.nama_1020 = nama_1020;
        this.nim_1020 = nim_1020;
        this.prodi_1020 = prodi_1020;
    }

    // Getter & Setter
    public String getNama_1020() { return nama_1020; }
    public void setNama_1020(String nama_1020) { this.nama_1020 = nama_1020; }

    public String getNim_1020() { return nim_1020; }
    public void setNim_1020(String nim_1020) { this.nim_1020 = nim_1020; }

    public String getProdi_1020() { return prodi_1020; }
    public void setProdi_1020(String prodi_1020) { this.prodi_1020 = prodi_1020; }

    @Override
    public String toString() {
        return nama_1020 + " - " + nim_1020 + " - " + prodi_1020;
    }
}
