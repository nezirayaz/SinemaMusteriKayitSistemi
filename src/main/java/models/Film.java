package models;

public class Film {
    private String ad;
    private int sure;
    private String tur;

    // No-args constructor
    public Film() {}

    public Film(String ad, int sure, String tur) {
        this.ad = ad;
        this.sure = sure;
        this.tur = tur;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getSure() {
        return sure;
    }

    public void setSure(int sure) {
        this.sure = sure;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public void bilgiGoster() {
        System.out.println("Film Adı: " + ad + ", Süre: " + sure + " dakika, Tür: " + tur);
    }
}