package utils;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import models.Film;
import models.Musteri;
import models.Salon;

public class JsonUtil {

    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final Logger logger = Logger.getLogger(JsonUtil.class.getName());

    public static void musteriKaydet(Musteri musteri, String filePath) {
        try {
            objectMapper.writeValue(new File(filePath), musteri);
            System.out.println("Müşteri JSON dosyasına kaydedildi.");
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Müşteri kaydedilemedi: " + e.getMessage(), e);
        }
    }

    public static Musteri musteriOku(String filePath) {
        try {
            return objectMapper.readValue(new File(filePath), Musteri.class);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Müşteri okunamadı: " + e.getMessage(), e);
            return null;
        }
    }

    public static void filmKaydet(Film film, String filePath) {
        try {
            objectMapper.writeValue(new File(filePath), film);
            System.out.println("Film JSON dosyasına kaydedildi.");
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Film kaydedilemedi: " + e.getMessage(), e);
        }
    }

    public static Film filmOku(String filePath) {
        try {
            return objectMapper.readValue(new File(filePath), Film.class);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Film okunamadı: " + e.getMessage(), e);
            return null;
        }
    }

    public static void salonKaydet(Salon salon, String filePath) {
        try {
            objectMapper.writeValue(new File(filePath), salon);
            System.out.println("Salon JSON dosyasına kaydedildi.");
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Salon kaydedilemedi: " + e.getMessage(), e);
        }
    }

    public static Salon salonOku(String filePath) {
        try {
            return objectMapper.readValue(new File(filePath), Salon.class);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Salon okunamadı: " + e.getMessage(), e);
            return null;
        }
    }
}