/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Omolemo
 */

//https://introcs.cs.princeton.edu/java/15inout/GUI.java.html (where it is found/referencing)
public class GUI implements ActionListener {
    
    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    
    public GUI ()
            {
               frame = new JFrame();
                
                JButton button = new JButton("Click Me");
                button.addActionListener(this);
               label = new JLabel("Number of clicks: 0");
                
                
                 panel = new JPanel();
                panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
                panel.setLayout(new GridLayout(0,1));
                panel.add(button);
                panel.add(label);
                
                frame.add(panel, BorderLayout.CENTER);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Our GUI");
                frame.pack();
                frame.setVisible(true);
            }
            
    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       count++;
       label.setText("Number of clicks: " + count);
    }
    
}
