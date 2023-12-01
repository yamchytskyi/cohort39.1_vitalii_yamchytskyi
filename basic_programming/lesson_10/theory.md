# Lesson 10

## Введение в Циклы в Программировании (10 минут)

Циклы являются одним из ключевых элементов программирования. Они позволяют выполнять повторяющиеся операции
без необходимости копирования кода. Это существенно упрощает процесс разработки и повышает читаемость кода.

### Зачем используются циклы?

Циклы применяются в программировании для уменьшения объема кода и повышения его эффективности.
Использование циклов позволяет:

1. Обрабатывать коллекции данных (например, массивы или списки).
2. Выполнять задачи, которые требуют повторения до тех пор, пока не будет достигнуто определенное условие.
3. Создавать более компактный и удобочитаемый код.

### Основные виды циклов

В Java существует несколько основных типов циклов:

1. **Цикл while**: Выполняется до тех пор, пока условие истинно. Оно проверяется перед каждой итерацией.
```java
 int i = 0;
 while (i < 10) {
   System.out.println("Итерация номер " + i);
   i++;
 }
```
2. **Цикл do-while**: Похож на цикл while, но условие проверяется после выполнения тела цикла,
   что гарантирует минимум одно выполнение.
```java
 int i = 0;
 do {
   System.out.println("Итерация номер " + i);
   i++;
 } while (i < 10);
```

3**Цикл for**: Используется, когда количество итераций заранее известно.

```java
 for (int i = 0; i < 10; i++) {
    System.out.println("Итерация номер " + i);
 }
```
Каждый из этих циклов имеет свои особенности и ситуации, в которых он наиболее эффективен.


## Цикл for в Java

Цикл `for` является одним из наиболее часто используемых циклов в Java, предоставляя удобный способ
повторения кода фиксированное количество раз.

### Определение и Синтаксис

Цикл `for` используется для выполнения блока кода определенное количество раз. Этот цикл особенно удобен,
когда заранее известно, сколько раз должен выполняться код.

Синтаксис цикла `for`:
```java
for (инициализация; условие; итерация) {
    // код для выполнения
}
```

```java
for (int i = 1; i < 5; i++) {
   System.out.print(i + " ");
}
```

1. **Инициализация (Initialization):**
   - Это первая часть, которая выполняется только один раз при начале цикла.
   - Здесь обычно объявляется и инициализируется переменная, которая используется для управления циклом.
   - Пример: `int i = 0;` - здесь переменная `i` инициализируется значением 0.
   **Пропуск Инициализации:**
   - Если вы опустите часть инициализации, то должны инициализировать переменную управления циклом до входа в цикл for.
```java
int i = 0;
for (; i < 10; i++) {
    // Тело цикла
}
```

2. **Условие (Condition):**
   - Эта часть проверяется перед каждой итерацией цикла.
   - Если условие истинно, цикл продолжается и выполняется тело цикла.
   - Если условие ложно, цикл завершается.
   - Пример: `i < 10;` - цикл будет выполняться до тех пор, пока `i` меньше 10.
   **Пропуск Условия:**
   - Если условие опущено, цикл for будет выполняться бесконечно, поскольку условие всегда считается истинным.
```java
for (int i = 0; ; i++) {
    // Тело цикла
}
```

3. **Итерация (Iteration):**
   - Эта часть выполняется после каждой итерации цикла.
   - Обычно здесь происходит изменение переменной цикла, например, увеличение или уменьшение ее значения.
   - Пример: `i++` - после каждой итерации значение `i` увеличивается на 1.
   **Пропуск Итерации:**
   - Если часть итерации опущена, управление переменной цикла должно осуществляться внутри тела цикла.
```java
for (int i = 0; i < 10;) {
    // Тело цикла
    i++;
}
```

Важно понимать, что пропуск одной из этих частей может привести к бесконечному циклу или другим неожиданным поведениям,
поэтому это должно делаться сознательно и с пониманием последствий.

<details style="margin-left: 20px;">
<summary><strong><em> Примеры использования: (нажмите на треугольник, чтобы развернуть текст)</em></strong></summary>

>
> ### Примеры использования
>
>1. **Вывод чисел от 1 до 10:**
>   В этом примере цикл `for` используется для печати чисел от 1 до 10.
>```java 
>for (int i = 1; i <= 10; i++) { 
>  System.out.println(i); 
>}
>```
>Здесь `i` инициализируется значением 1, и цикл продолжается до тех пор, пока `i` не станет больше 10.


>1. **Умножение чисел от 1 до 5 на 2:**
>   Этот пример демонстрирует использование цикла `for` для умножения чисел от 1 до 5 на 2.
>```java 
>for (int i = 1; i <= 5; i++) {
>  System.out.println(i * 2); 
>}
>```
>Каждая итерация умножает текущее значение `i` на 2 и выводит результат.
>
</details>

<details style="margin-left: 20px;">
<summary><strong><em> Бытовая аналогия, сравнивающая циклы `for`, `while` и `do-while`: (нажмите на треугольник, чтобы развернуть текст)</em></strong></summary>

> ### Цикл `for`:
> Представь себе рецепт приготовления пирога, где ты точно знаешь, что нужно добавить 5 столовых ложек сахара. Здесь
> каждое добавление ложки сахара - это итерация цикла. Ты заранее знаешь, что нужно выполнить действие ровно 5 раз, как
> в цикле `for`, где ты задаешь конкретное количество повторений.

> ### Цикл `while`: 
> Представь, что ты ждешь автобус на остановке. Ты будешь ждать до тех пор, пока автобус не приедет, но ты
> не знаешь точно, когда это произойдет. В этом случае, каждая минута ожидания - это итерация цикла. Ты продолжаешь
> ждать (выполнять цикл), пока не выполнится условие (автобус приедет). Это аналог цикла `while`, где выполнение
> продолжается до тех пор, пока выполняется условие.

> ### Цикл `do-while`: 
> Представь, что ты пробуешь новый вид чая. Ты решил, что попробуешь его хотя бы один раз, независимо
> от того, понравится он тебе или нет. После первого глотка, ты решаешь, будешь ли продолжать пить, если он тебе
> понравился. В этом случае, первый глоток - это гарантированное действие (первая итерация в `do-while`), а решение
> продолжать пить или нет зависит от твоего мнения (условия). Это подобно циклу `do-while`, где тело цикла выполняется хотя
> бы один раз, прежде чем проверяется условие.

</details>