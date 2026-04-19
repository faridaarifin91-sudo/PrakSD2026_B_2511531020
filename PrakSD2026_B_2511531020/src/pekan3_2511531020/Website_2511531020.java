package pekan3_2511531020;

public class Website_2511531020 {
    private String judul_1020;
    private String url_1020;

    public Website_2511531020(String judul_1020, String url_1020) {
        this.judul_1020 = judul_1020;
        this.url_1020 = url_1020;
    }

    public String getJudul_1020() {
        return judul_1020;
    }

    public void setJudul_1020(String judul_1020) {
        this.judul_1020 = judul_1020;
    }

    public String getUrl_1020() {
        return url_1020;
    }

    public void setUrl_1020(String url_1020) {
        this.url_1020 = url_1020;
    }

    @Override
    public String toString() {
        return "Judul: " + judul_1020 + ", URL: " + url_1020;
    }
}
