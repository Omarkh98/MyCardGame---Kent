/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;
import javax.swing.JLabel;

/**
 *
 * @author user
 */
public class MyCards4 {
    public static enum CTypes{ Spade, Heart, Diamond, Clubs};
    public int CValue;
    public String CName;
    public String ImgName;
    public CTypes CardType;
    public JLabel MyHolder;  
}
