package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Pole extends JPanel {

    // Наша картинка фона
    private Image fon;

    // Наша картинка фона
    private Image person;

    //наш подарок
    private Image gift3;

    Pole() {
        try {
            fon = ImageIO.read(new File("resource/fon.png"));
            person = ImageIO.read(new File("resource/person.png"));
            gift3 = ImageIO.read(new File("resource/gift3.png"));
        } catch (IOException e) {
            System.out.println("Возникла ошибка при считывании файла");
        }
    }


        // Метод рисования чего угодно
        public void paintComponent(Graphics g) {
            g.drawImage(fon, 0, 0, null);
            g.drawImage(person, 200, 200, null);
            g.drawImage(gift3, 250, 100, null);
        }
    }
