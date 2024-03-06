## Домашнее задание: Синхронизация доступа к общему ресурсу в Java

### Цель задания

Понять принципы работы с многопоточностью в Java на примере синхронизации доступа к общему ресурсу, отличному от
счетчика, и изучить способы решения проблемы гонки ресурсов.

### Задача

Разработать многопоточное приложение, в котором потоки будут работать с общим списком строк. Приложение должно
демонстрировать проблему гонки ресурсов при добавлении элементов в список и предлагать решение с помощью синхронизации.

#### Шаги выполнения

1. **Создание общего ресурса**
    - Создайте класс `SharedStringList`, содержащий приватный список строк `ArrayList<String>` и методы для добавления
      строки в список и получения всего списка.

2. **Демонстрация гонки ресурсов**
    - Создайте несколько потоков, в каждом из которых в цикле добавляйте строки в общий список, используя метод
      добавления класса `SharedStringList`.
    - После выполнения всех потоков, выведите содержимое списка. Обратите внимание на то, что из-за гонки ресурсов
      реальное количество элементов в списке может не совпадать с ожидаемым.

3. **Решение проблемы с помощью синхронизации**
    - Используйте ключевое слово `synchronized` для синхронизации доступа к методу добавления строки в список.
    - Повторите выполнение потоков и сравните результат с предыдущим выполнением, чтобы убедиться в отсутствии гонки
      ресурсов.

4. **Исследование альтернативных решений**
    - Попробуйте использовать потокобезопасные коллекции, такие как `CopyOnWriteArrayList` или методы из
      пакета `java.util.concurrent`, например, `ConcurrentLinkedQueue`, для управления доступом к общему списку.
    - Сравните поведение и производительность вашего приложения при использовании различных подходов синхронизации.


### Сдача работы

- Оформите задание в виде проекта на GitHub, включая исходный код приложения и файл `README.md` с описанием задания,
  инструкциями по запуску и вашим анализом различных способов синхронизации.
- Убедитесь, что ваш код корректно компилируется и выполняется.



#### дополнитель но желанию тесты:

[interface Comparator](https://docs.google.com/forms/d/e/1FAIpQLSfBC9mkgcuhA4p37IN8YMROrb6qlIYyYajs1ziEljFZYbzP6Q/viewform?usp=sf_link)  
[Java Basic String](https://docs.google.com/forms/d/e/1FAIpQLScS1CiRwejnOSjF8EI9fvqpbwLPJVmSvyqqjE_KuPWzXxOOtQ/viewform?usp=sf_link)