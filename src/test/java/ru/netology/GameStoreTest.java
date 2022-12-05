package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameStoreTest {


    @Test
    public void shouldAddGame() {

        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        assertTrue(store.containsGame(game));
    }
    @Test
    public void shouldAddExistGame() {

        GameStore store = new GameStore();
        Game game1 = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        Game game2 = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        assertTrue(store.containsGame(game2));
    }


    @Test
    public void shouldAddPlayerWithPlayTime1() {
        GameStore store = new GameStore();
        store.addPlayTime("Ivan", 1);
        store.addPlayTime("Kolya", 0);
        String expected = "Ivan";
        String actual = store.getMostPlayer();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSumPlayedTime() {
        GameStore store = new GameStore();
        store.addPlayTime("Ivan", 5);
        store.addPlayTime("Kolya", 6);
        store.addPlayTime("Ivan", 5);
        int expected = 16;
        int actual = store.getSumPlayedTime();
        Assertions.assertEquals(expected, actual);
    }


    // другие ваши тесты
}