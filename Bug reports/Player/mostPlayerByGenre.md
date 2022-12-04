# Описание
Метод  `mostPlayerByGenre` всегда возвращает `null`.

# Локализация дефекта
https://github.com/dmitriy-nekr/Javaqa-diploma-work/blob/90eea26df3389f754ae184d69ecc213d48d1bf1f/src/main/java/ru/netology/Player.java#L60

# Шаги воспроизведения

1. Открыть [код программы](https://github.com/dmitriy-nekr/Javaqa-diploma-work/blob/main/src/main/java/ru/netology/Player.java) в IDEA
2. Создать объект игры `Game game = store.publishGame("Стрелялка", "Shooters")`
3. Вызвать метод `player.play(game, 3)`
4. Вызвать метод `mostPlayerByGenre ('Shooters')`
5. Наблюдать результат

**Ожидаемый результат**

3

**Фактический  результат**

`null`

# Окружение
* **Операционная система: Windows 10 Домашняя 19044.2006**
* **IDE: IntelliJ IDEA (Community Edition) 2021.1.2**
* **Java: OpenJDK 11**