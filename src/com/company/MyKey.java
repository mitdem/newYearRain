package com.company;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class MyKey implements KeyListener {

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
