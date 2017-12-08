/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyKotsheena K = new MyKotsheena();
        K.setVisible(true);
        K.getContentPane().setBackground(Color.BLACK);
        K.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
