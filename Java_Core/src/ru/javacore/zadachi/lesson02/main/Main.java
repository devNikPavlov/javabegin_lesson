package ru.javacore.zadachi.lesson02.main;

/*
Задача “Компьютер”

Требуется доработать класс Computer из одной прошлой задачи:

добавить get/set
добавить 2 минимальных конструктора
свойству name прописать private
убрать дефолтное значение у name
методам прописать public
 */

import ru.javacore.zadachi.lesson02.computer.Computer;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer();

        computer.setName("IBM");        // изменили значение с помощью set

        computer.on();
        computer.off();
    }
}
