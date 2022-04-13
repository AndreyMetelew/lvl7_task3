package task;

/* 1. Три массива

1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList, выведи эти три списка на экран. Сначала тот, который для x%3, потом для x%2 и потом последний. */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class threeArrays {

    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> twoMultiplyList = new ArrayList<>();
    ArrayList<Integer> threeMultiplyList = new ArrayList<>();

    threeArrays () throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Задача №1: Введите с клавиатуры 10 чисел. Мы их сохраним и рассортируем по кратности 3-м и 2-м.");
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print("Число №" + (i + 1) + ": ");
            int cache = scanner.nextInt();
            list.add(cache);
        }

        for (Integer integer : list) {
            if (integer % 3 == 0)
                threeMultiplyList.add(integer);
            if (integer % 2 == 0)
                twoMultiplyList.add(integer);
        }
        System.out.println();

    }

    void printList () {

        System.out.println("Массив чисел, кратных 3: ");
        for (Integer integer : threeMultiplyList) {
            System.out.println(integer);
        }
        System.out.println();

        System.out.println("Массив чисел, кратных 2: ");
        for (Integer integer : twoMultiplyList) {
            System.out.println(integer);
        }
        System.out.println();

        System.out.println("Введенный Вами массив:");
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println();

    }

}