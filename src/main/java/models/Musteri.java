package models;

import interfaces.IKayit;

public class Musteri extends BaseEntity implements IKayit {

    // Varsayılan yapıcı
    public Musteri() {
        super(0, ""); // Varsayılan değerler
    }

    public Musteri(int id, String name) {
        super(id, name);
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Müşteri adı boş olamaz.");
        }
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Müşteri ID: " + getId() + ", İsim: " + getName());
    }

    @Override
    public void kaydet() {
        System.out.println("Müşteri kaydedildi.");
    }

    @Override
    public void sil() {
        System.out.println("Müşteri silindi.");
    }

    @Override
    public void guncelle() {
        System.out.println("Müşteri güncellendi.");
    }
}