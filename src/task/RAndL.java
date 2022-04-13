package task;

/* 4. Буква «р» и буква «л»

1. Создай список слов, заполни его самостоятельно.
2. Метод fix() должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RAndL {

    ArrayList<String> list = new ArrayList<>();

    void fix() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("р") && list.get(i).contains("л"))
                continue;
            else if (list.get(i).contains("р"))
                list.remove(i);
            else if (list.get(i).contains("л")) {
                list.add(i, list.get(i));
                i++;
            }
        }
    }

    RAndL () throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println();
        System.out.println("Задача №4: Нужно создать и самостоятельно заполнить список слов." +
                "\nТак же добавить метод fix(), который должен:" +
                "\nудалять из списка строк все слова, содержащие букву «р»;" +
                "\nудваивать все слова содержащие букву «л»;" +
                "\nесли слово содержит и букву «р» и букву «л», то оставить это слово без изменений;");
        System.out.println();

        System.out.println("Давайте введём слова, которые попадут в список.\n" +
                "Чтобы перестать - просто введите пустую строку");
        while (true)
        {
            System.out.print("Введите новую строку: ");
            String s = reader.readLine();
            if (s.isEmpty()) {
                System.out.println("Хорошо, новые слова больше не вводим");
                break;
            }
            else
                list.add(s);
        }
        System.out.println();

        System.out.println("Список строк такой:");
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
        System.out.println("\n");

        System.out.println("Производится проверка на вышеуказанные признаки в словах...");
        fix();
        System.out.println("\nНовый список строк теперь такой:");
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
        System.out.println();
    }

}