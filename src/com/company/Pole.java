package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Pole extends JPanel {

    // Наша картинка фона
    private Image fon;

    // Наша картинка персонажа
    private Image person;
    static int x = 200;
    static int y = 500;

    // Наша картинка подарка
    private Image gift;
    static int giftX = 100;
    static int giftY = 400;

    // Через конструктор картинку передаем
    Pole() {
        try {
            fon = ImageIO.read(new File("resource/fon.png"));
            person = ImageIO.read(new File("resource/person.png"));
            gift = ImageIO.read(new File("resource/gift3.png"));
        } catch (IOException e) {
            System.out.println("Возникла ошибка при считывании файла фона");
        }

        // Таймер на движение подарка
        Timer timerDraw = new Timer(15, e -> downStart());
        timerDraw.start();
    }
    // Метод рисования чего угодно
    public void paintComponent(Graphics g) {
        g.drawImage(fon, 0, 0, null);
        g.drawImage(person, x, y, null);
        g.drawImage(gift, giftX, giftY, null);
    }

    public void downStart() {
        giftY = giftY + 1;
    }

}
