# Описание
Метод  `play` не добавляет количество часов в переменную `hours`

# Локализация дефекта
https://github.com/dmitriy-nekr/Javaqa-diploma-work/blob/90eea26df3389f754ae184d69ecc213d48d1bf1f/src/main/java/ru/netology/Player.java#L36

# Шаги воспроизведения

1. Открыть [код программы](https://github.com/dmitriy-nekr/Javaqa-diploma-work/blob/main/src/main/java/ru/netology/Player.java) в IDEA
2. Вызвать метод `installGame(game765)`
3. Вызвать метод `play(game765, 5)`
4. Наблюдать результат

**Ожидаемый результат**

Для элемента game765 `hours` увеличится на 5 

**Фактический  результат**

Элемент  `game765` со значением 0

# Окружение
* **Операционная система: Windows 10 Домашняя 19044.2006**
* **IDE: IntelliJ IDEA (Community Edition) 2021.1.2**
* **Java: OpenJDK 11**