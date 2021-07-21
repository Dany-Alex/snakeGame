/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danygames.snakegame;

import com.danygames.snakegame.vista.vistaGame;

/**
 *
 * @author Artist
 */
public class init {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        prueba prueba = new prueba();
        prueba.setVisible(true);
        prueba.setBounds(400, 200, 500, 300);
        prueba.setLocationRelativeTo(null);
        // prueba.pack();
        vistaGame vistaGame = new vistaGame();

        vistaGame.setVisible(true);

        vistaGame.jPanel1.getGraphics().fillRect(50, 50, 50, 50);

    }

}
