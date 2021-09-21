package ru.netology.manager;

import ru.netology.domain.Film;

public class FilmManager {

    private int numberOutputMovies = 10;
    private Film[] items = new Film[0];

    public FilmManager(int numberOutputMovies) {
        this.numberOutputMovies = numberOutputMovies;
    }

    public FilmManager() {
    }

    public void add(Film item) {
        int length = items.length + 1;
        Film[] tmp = new Film[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Film[] getAll() {
        int resultLength;
        if (items.length < numberOutputMovies) {
            resultLength = items.length;
        } else resultLength = numberOutputMovies;
        Film[] result = new Film[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

}

