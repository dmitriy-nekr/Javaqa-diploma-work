package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    GameStore store = new GameStore();
    Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");
    Game game1 = store.publishGame("Варкрафт", "Аркады");
    Game game2= store.publishGame("Стрелялка", "Шутеры");
    Player player = new Player("Petya");

    @Test
    public void shouldNotInstallTwice(){
        player.installGame(game);
        player.play(game, 3);
        player.installGame(game);
        int expected = 7;
        int actual = player.play(game,4);
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldSumGenreIfOneGame() {

        player.installGame(game);
        player.play(game, 3);

        int expected = 3;
        int actual = player.sumGenre(game.getGenre());
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSumGenreIfTwoGame() {

        player.installGame(game);
        player.installGame(game1);



        player.play(game, 3);
        player.play(game1, 6);


        int expected = 9;
        int actual = player.sumGenre(game.getGenre());
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSumGenreIfOneGameHasAnotherGenre() {

        player.installGame(game);
        player.installGame(game1);
        player.installGame(game2);

        player.play(game, 3);
        player.play(game1, 6);
        player.play(game2, 4);

        int expected = 9;
        int actual = player.sumGenre(game.getGenre());
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldGetException() {

        Assertions.assertThrows(RuntimeException.class, () -> player.play(game, 3));
    }

    @Test
    public void shouldGetMostPlayedGame(){
        player.installGame(game);
        player.installGame(game1);
        player.play(game, 6);
        player.play(game1, 3);

        Game expected=game;
        Game actual = player.mostPlayerByGenre("Аркады");
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldGetMostPlayedGameWhichNotPlayed(){
        player.installGame(game);
        player.installGame(game1);
        player.installGame(game2);
        player.play(game, 3);
        player.play(game1, 6);

        Game expected=null;
        Game actual = player.mostPlayerByGenre("Шутеры");
        Assertions.assertEquals(expected,actual);
    }


}
// другие ваши тесты


