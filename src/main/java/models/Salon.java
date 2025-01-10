package models;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private String name;
    private final List<Film> filmler;

    // No-args constructor
    public Salon() {
        this.filmler = new ArrayList<>();
    }

    public Salon(String name) {
        this.name = name;
        this.filmler = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Film> getFilmler() {
        return filmler;
    }

    public void filmEkle(Film film) {
        filmler.add(film);
    }

    public void bilgiGoster() {
        System.out.println("Salon: " + name);
        for (Film film : filmler) {
            film.bilgiGoster();
        }
    }
}