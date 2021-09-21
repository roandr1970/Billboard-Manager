package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {

    Film first = new Film(1, 53, "Бладшот", "боевик");
    Film second = new Film(2, 54, "Вперёд", "мультфильм");
    Film third = new Film(3, 55, "Номер один", "комедия");
    Film fourth = new Film(4, 56, "Человек невидимка", "ужасы");
    Film fifth = new Film(5, 57, "Джентельмены", "боевик");

    @Test
    public void shouldNumberOutputMovies() {
        FilmManager manager = new FilmManager(3);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{fifth, fourth, third};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNumberOutputMoviesDefault() {
        FilmManager manager = new FilmManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }
}