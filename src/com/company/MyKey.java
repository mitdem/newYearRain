package com.company;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class MyKey implements KeyListener {

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());

        Pole.x = Pole.x + 10;

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
