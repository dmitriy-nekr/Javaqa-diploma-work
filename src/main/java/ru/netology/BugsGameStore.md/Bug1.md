# В классе GameStore нет наследования от класса Game
## Описание
Метод publishGame не добавляет игру в каталог
## Локация дефекта
https://github.com/dmitriy-nekr/Javaqa-diploma-work/blob/6f48d61437b6f0443994d386f9e4172f8f35d39f/src/main/java/ru/netology/GameStore.java#L22

## Шаги воспроизведения
1. Открыть код программы в IDEA
2. Открыть класс GameStoreTest
3. Запустить тест shouldAddGame
4. Посмотреть результат
   
## Ожидаемый результат: 
Игра добавляется в каталог,результат true
## Фактический результат: 
Результат false 

## Скриншот

![Image]("C:\Users\ilona\Desktop\Screenshot_1.png")