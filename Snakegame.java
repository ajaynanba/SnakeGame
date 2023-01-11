//package com.snakegame;

import javax.swing.*;
import java.awt.*;

public class Snakegame extends JFrame {
    JFrame frame;
    Snakegame(){
        frame = new JFrame("Snake game");
        frame.setBounds(10,10,905,780);
        MyPanel panel = new MyPanel();
        panel.setBackground(Color.gray);
        frame.add(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
    public static void main(String[] args) {
        new Snakegame();


    }
}
