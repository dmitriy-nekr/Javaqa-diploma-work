package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerTest {


    @Test
    public void shouldSumGenreIfOneGame() {
        GameStore store = new GameStore();

        Game game1 = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        Player player = new Player("Petya");
        player.installGame(game1);
        player.play(game1, 3);
        player.installGame(game1);

        int expected = 3;
        int actual = player.sumGenre("Аркады");
        Assertions.assertEquals(expected, actual);
    }


}
// другие ваши тесты

