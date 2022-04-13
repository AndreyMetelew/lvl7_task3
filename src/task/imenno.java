package task;

/* 3. Слово «именно»

1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for, вывести результат на экран. Каждый элемент списка с новой строки. */

import java.util.ArrayList;

public class imenno {

    ArrayList<String> list = new ArrayList<>();

    imenno () {

        System.out.println();
        System.out.println("Задача №3: Создан список из слов \"мама\", \"мыла\" и \"раму\"." +
                "\nПосле каждого слова будет вставлено слово \"именно\", а так же выведено на экран");
        System.out.println();

        list.add("мама");
        list.add("мыла");
        list.add("раму");
        String s = "именно";

        System.out.println("Итак, наш список такой:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n");

        System.out.println("Теперь мы добавим меж этими словами слово \"именно\"...");
        for (int i = 0; i < list.size(); i++) {
            list.add(i, s);
            i++;
        }

        System.out.println("... и посмотрим, что из этого получилось:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n");

    }

}