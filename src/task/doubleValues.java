package task;

/* 5. Удвой слова

1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c → a,a,b,b,c,c.
3. Используя цикл for, выведи результат на экран, каждое значение с новой строки. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class doubleValues {

    ArrayList<String> list = new ArrayList<>();

    doubleValues () throws IOException {

        System.out.println();
        System.out.println("Задача №5: Нужно ввести с клавиатуры 10 слов в список строк и удвоить их, выведя результат на экран");
        System.out.println();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 5 строк для проверки работы:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Строка №" + (i + 1) + ": ");
            list.add(reader.readLine());
        }
        System.out.println();

        System.out.println("Производится удвоение...");
        for (int i = 0; i < list.size(); i++) {
            list.add(i,list.get(i));
            i++;
        }
        System.out.println();

        System.out.println("Удвоение завершено, вот наш новый список строк:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Строка №" + (i + 1) + ": " + list.get(i));
        }


    }
}