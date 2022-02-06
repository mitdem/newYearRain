package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Добавим окно
        Okno okno = new Okno();

        // Наше поле
        Pole pole = new Pole();

        // Таймер на обновление картинки
        Timer timerDraw = new Timer(50, e -> pole.repaint());
        timerDraw.start();

        // Добавим компонент поля в окно
        okno.add(pole);

        // Отобразить окно
        okno.setVisible(true);
    }
}
