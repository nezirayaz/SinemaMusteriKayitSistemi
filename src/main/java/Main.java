import java.util.Scanner;

import models.Film;
import models.Musteri;
import models.Salon;
import utils.JsonUtil;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String musteriFilePath = "src/main/resources/Musteri.json";
        String filmFilePath = "src/main/resources/Film.json";
        String salonFilePath = "src/main/resources/Salon.json";

        while (true) {
            System.out.println("1. Yeni Müşteri Ekle");
            System.out.println("2. Müşterileri Listele");
            System.out.println("3. Yeni Film Ekle");
            System.out.println("4. Filmleri Listele");
            System.out.println("5. Yeni Salon Ekle");
            System.out.println("6. Salonları Listele");
            System.out.println("7. Çıkış");
            System.out.print("Seçiminiz: ");
            int secim = scanner.nextInt();
            scanner.nextLine(); // Enter tuşunu tüket

            switch (secim) {
                case 1:
                    System.out.print("Müşteri Adı: ");
                    String musteriAdi = scanner.nextLine();
                    Musteri musteri = new Musteri(1, musteriAdi);
                    JsonUtil.musteriKaydet(musteri, musteriFilePath);
                    break;
                case 2:
                    Musteri okunanMusteri = JsonUtil.musteriOku(musteriFilePath);
                    if (okunanMusteri != null) {
                        okunanMusteri.bilgiGoster();
                    }
                    break;
                case 3:
                    System.out.print("Film Adı: ");
                    String filmAdi = scanner.nextLine();
                    System.out.print("Film Süresi: ");
                    int sure = scanner.nextInt();
                    scanner.nextLine(); // Enter tuşunu tüket
                    System.out.print("Film Türü: ");
                    String tur = scanner.nextLine();
                    Film film = new Film(filmAdi, sure, tur);
                    JsonUtil.filmKaydet(film, filmFilePath);
                    break;
                case 4:
                    Film okunanFilm = JsonUtil.filmOku(filmFilePath);
                    if (okunanFilm != null) {
                        okunanFilm.bilgiGoster();
                    }
                    break;
                case 5:
                    System.out.print("Salon Adı: ");
                    String salonAdi = scanner.nextLine();
                    Salon salon = new Salon(salonAdi);
                    JsonUtil.salonKaydet(salon, salonFilePath);
                    break;
                case 6:
                    Salon okunanSalon = JsonUtil.salonOku(salonFilePath);
                    if (okunanSalon != null) {
                        okunanSalon.bilgiGoster();
                    }
                    break;
                case 7:
                    System.out.println("Çıkış yapılıyor...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Geçersiz seçim. Tekrar deneyin.");
            }
        }
    }
}