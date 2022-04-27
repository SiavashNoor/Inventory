package com.inventory;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.getContentPane().setBackground(Color.YELLOW);

        this.setResizable(true);
        this.setVisible(true);


    }
}
