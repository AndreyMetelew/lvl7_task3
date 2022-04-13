package task;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // Вывод задания №1
        threeArrays task1 = new threeArrays();
        task1.printList();

        // Вывод задания №2
        backwardWords task2 = new backwardWords();

        // Вывод задания №3
        imenno task3 = new imenno();

        // Вывод задания №4
        RAndL task4 = new RAndL();

        // Вывод задания №5
        doubleValues task5 = new doubleValues();

    }

}