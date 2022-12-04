# Описание
Метод `installGame` по умолчанию выставляет значение переменной ``hours`` равной нулю в словарь `playedTime`, даже если в нем уже было записано значение, отличное от нуля.

# Локализация дефекта
https://github.com/dmitriy-nekr/Javaqa-diploma-work/blob/90eea26df3389f754ae184d69ecc213d48d1bf1f/src/main/java/ru/netology/Player.java#L25

# Шаги воспроизведения

1. Открыть [код программы](https://github.com/dmitriy-nekr/Javaqa-diploma-work/blob/main/src/main/java/ru/netology/Player.java) в IDEA
2. Добавить элемент playedTime.put(game1, 4)
3. Вызвать метод `installGame(game1)`
4. Наблюдать результат

**Ожидаемый результат**

`hours` для game1 равно 4

**Фактический  результат**

`hours` для game1 равно 0

# Окружение
* **Операционная система: Windows 10 Домашняя 19044.2006**
* **IDE: IntelliJ IDEA (Community Edition) 2021.1.2**
* **Java: OpenJDK 11**
