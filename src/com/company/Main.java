package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // Наше поле
        Pole pole;

        // Здесь мы картинку загружаем
        try {
            Image imageFon = ImageIO.read(new File("resource/fon.png"));
            Image imagePerson = ImageIO.read(new File("resource/person.png"));
            Image imageGift3 = ImageIO.read(new File("resource/gift3.png"));
            pole = new Pole(imageFon,imagePerson,imageGift3);
        } catch (IOException e) {
            System.out.println("Возникла ошибка при считывании файла фона");
            pole = new Pole();
        }

        // Добавим окно
        JFrame okno = new JFrame();

        // Добавим компонент поля в окно
        okno.add(pole);

        // Задаем параметры для окна
        okno.setBounds(0,0,1024,768);

        // Создадим заголовок
        okno.setTitle("Новогодний дождь");

        // Отобразить окно
        okno.setVisible(true);

    }
}
