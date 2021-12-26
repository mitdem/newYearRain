package com.company;

import javax.swing.*;
import java.awt.*;

public class Pole extends JPanel {

    // Наша картинка фона
    private Image fon;

    // Наша картинка фона
    private Image person;

    //наш подарок
    private Image gift3;

    Pole() {
    }

    // Через конструктор картинку передаем
    Pole(Image image1, Image image2,Image image3) {
        fon = image1;
        person = image2;
        gift3 = image3;
    }

    // Метод рисования чего угодно
    public void paintComponent(Graphics g) {
        g.drawImage(fon, 0, 0, null);
        g.drawImage(person, 200, 200, null);
        g.drawImage(gift3, 250, 100, null);
    }
}
