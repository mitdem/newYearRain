package com.company;

public class Main {

    public static void main(String[] args) {
        // Наше поле
        Pole pole = new Pole();

        // Добавим окно
        Okno okno = new Okno();

        // Добавим компонент поля в окно
        okno.add(pole);

    }
}
