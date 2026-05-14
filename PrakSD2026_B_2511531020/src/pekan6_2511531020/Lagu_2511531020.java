package pekan6_2511531020;

public class Lagu_2511531020 {
    private String judul_1020;
    private String penyanyi_1020;
    public Lagu_2511531020 next_1020;
    public Lagu_2511531020 prev_1020;

    // Constructor
    public Lagu_2511531020(String judul_1020, String penyanyi_1020) {
        this.judul_1020 = judul_1020;
        this.penyanyi_1020 = penyanyi_1020;
        this.next_1020 = null;
        this.prev_1020 = null;
    }

    // Getter
    public String getJudul_1020() {
        return judul_1020;
    }

    public String getPenyanyi_1020() {
        return penyanyi_1020;
    }

    // Setter
    public void setJudul_1020(String judul_1020) {
        this.judul_1020 = judul_1020;
    }

    public void setPenyanyi_1020(String penyanyi_1020) {
        this.penyanyi_1020 = penyanyi_1020;
    }
}
