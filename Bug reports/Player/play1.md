# Описание
В методе `play` не реализован Runtime Exception при нарушении условия playedTime.containsKey(game)==true

# Локализация дефекта
https://github.com/dmitriy-nekr/Javaqa-diploma-work/blob/main/src/main/java/ru/netology/Player.java#L35

# Шаги воспроизведения

1. Открыть [код программы](https://github.com/dmitriy-nekr/Javaqa-diploma-work/blob/main/src/main/java/ru/netology/Player.java) в IDEA
2. Вызвать метод `play(game765, 5)`
3. Наблюдать результат

**Ожидаемый результат**

Сообщение Runtime Exception в консоли

**Фактический  результат**

Появится новый элемент в нашей мапе `game765` со значением `5`

# Окружение
* **Операционная система: Windows 10 Домашняя 19044.2006**
* **IDE: IntelliJ IDEA (Community Edition) 2021.1.2**
* **Java: OpenJDK 11**
