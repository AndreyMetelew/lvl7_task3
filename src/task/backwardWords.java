package task;

/* 2. Слова в обратном порядке

Введи с клавиатуры 5 слов в список строк. Удали 3-ий элемент списка, и выведи оставшиеся элементы в обратном порядке. */

import java.util.ArrayList;
import java.util.Scanner;

public class backwardWords {

    ArrayList<String> list = new ArrayList<>();

    backwardWords () {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Задача №2: Введите с клавиатуры 5 строк. 3-я будет удалена, а список будет выведен в обратном порядке");
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print("Строка №" + (i + 1) + ": ");
            String cache = scanner.nextLine();
            list.add(cache);
        }
        System.out.println();

        System.out.println("Массив перетасован, а строка №3 удалена. Вот таким стал массив задом наперед: ");
        list.remove(2);
        for (int i = list.size() - 1; i > -1; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println();

    }

}