/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;


import static cardgame.MyCards.CTypes.Spade;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.lang.System.exit;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class MyKotsheena extends JFrame implements MouseMotionListener, MouseListener  {
    ArrayList<MyCards> Cards = new ArrayList<MyCards>();
    ArrayList<MyCards2> Cards2 = new ArrayList<MyCards2>();
    ArrayList<MyCards3> Cards3 = new ArrayList<MyCards3>();
    ArrayList<MyCards4> Cards4 = new ArrayList<MyCards4>();
    ArrayList<MyCards5> Cards5 = new ArrayList<MyCards5>();
    String CardsPath = "C:\\Users\\oo\\Documents\\Deck1";
    String CardPath2 = "C:\\Users\\oo\\Documents\\Deck2";
    String CardPath3 = "C:\\Users\\oo\\Documents\\Deck3";
    String CardPath4 = "C:\\Users\\oo\\Documents\\Deck4";
    String CardPath5 = "C:\\Users\\oo\\Documents\\Deck5";
    private int i;
    private int j;
    Container Cp = getContentPane();
    private JButton Instructions = new JButton();
    private JButton Exit = new JButton();
    private JButton Player1 = new JButton();
    private JButton Player2 = new JButton();
    private JButton Player3 = new JButton();
    private JButton Player4 = new JButton();
    private JButton PileOfCards = new JButton();
                                                
    public MyKotsheena() {
        setTitle("Shadow Masters");
        GraphicsEnvironment GE = GraphicsEnvironment.getLocalGraphicsEnvironment();
        setSize(GE.getMaximumWindowBounds().width, GE.getMaximumWindowBounds().height); 
        Buttons();
        Deck1();
        Deck2();
        Deck3();
        Deck4();
        Deck5();
    }
    
    public void Buttons(){
       Cp.setLayout(null);
       Instructions.setText(" RULES ");
       Instructions.setBounds(570, 20, 120, 50);
       Instructions.setBackground(Color.RED);
       Exit.setText(" EXIT ");
       Exit.setBounds(570, 90, 120, 50);
       Exit.setBackground(Color.RED);
       Player1.setText(" PLAYER 1");
       Player1.setBounds(200, 270, 100, 30);
       Player1.setBackground(Color.CYAN);
       Player2.setText(" PLAYER 3");
       Player2.setBounds(200, 420, 100, 30);
       Player2.setBackground(Color.YELLOW);
       Player3.setText(" PLAYER 2");
       Player3.setBounds(995, 270, 100, 30);
       Player3.setBackground(Color.MAGENTA);
       Player4.setText(" PLAYER 4");
       Player4.setBounds(995, 420, 100, 30);
       Player4.setBackground(Color.GREEN);
       PileOfCards.setText(" Pick A Card");
       PileOfCards.setBounds(560, 420, 150, 30);
       PileOfCards.setBackground(Color.WHITE);
       Instructions.addActionListener(new InstructionsButton());
       Exit.addActionListener(new ExitButton());
       Player1.addActionListener(new Player1());
       Player2.addActionListener(new Player2());
       Player3.addActionListener(new Player3());
       Player4.addActionListener(new Player4());
       PileOfCards.addActionListener(new MyPile());
       Cp.add(Instructions);
       Cp.add(Exit);
       Cp.add(Player1);
       Cp.add(Player2);
       Cp.add(Player3);
       Cp.add(Player4);
       Cp.add(PileOfCards);
    }
    
    public void Deck1() {
           for(i=0;i<1;i++){
            MyCards N = new MyCards();
            MyCards O = new MyCards();
            MyCards P = new MyCards();
            MyCards Q = new MyCards();
            MyCards R = new MyCards();
            MyCards S = new MyCards();
            MyCards T = new MyCards();
            MyCards U = new MyCards();
            MyCards V = new MyCards();
            MyCards W = new MyCards();
            N.CValue = 2;
            O.CValue = 11;
            P.CValue = 9;
            Q.CValue = 12;
            R.CValue = 7;
            S.CValue = 4;
            T.CValue = 6;
            U.CValue = 10;
            V.CValue = 8;
            W.CValue = 5;
            N.ImgName = CardsPath+"\\"+"2H.png";
            O.ImgName = CardsPath+"\\"+"JD.png";
            P.ImgName = CardsPath+"\\"+"9S.png";
            Q.ImgName = CardsPath+"\\"+"QH.png";
            R.ImgName = CardsPath+"\\"+"7S.png";
            S.ImgName = CardsPath+"\\"+"4C.png";   
            T.ImgName = CardsPath+"\\"+"6H.png";  
            U.ImgName = CardsPath+"\\"+"10C.png"; 
            V.ImgName = CardsPath+"\\"+"8H.png";
            W.ImgName = CardsPath+"\\"+"5D.png";
            Cards.add(N);
            Cards.add(O);
            Cards.add(P);
            Cards.add(Q);
            Cards.add(R);
            Cards.add(S);
            Cards.add(T);
            Cards.add(U);
            Cards.add(V);
            Cards.add(W);
            JLabel A13 = new JLabel();
            JLabel A14 = new JLabel();
            JLabel A15 = new JLabel();
            JLabel A16 = new JLabel();
            JLabel A17 = new JLabel();
            JLabel A18 = new JLabel();
            JLabel A19 = new JLabel();
            JLabel A20 = new JLabel();
            JLabel A21 = new JLabel();
            JLabel A22 = new JLabel();
            int x = 70;
            int y = 50;
            A13.setIcon(new ImageIcon(new ImageIcon(Cards.get(0).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            A14.setIcon(new ImageIcon(new ImageIcon(Cards.get(1).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            A15.setIcon(new ImageIcon(new ImageIcon(Cards.get(2).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            A16.setIcon(new ImageIcon(new ImageIcon(Cards.get(3).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            A17.setIcon(new ImageIcon(new ImageIcon(Cards.get(4).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            A18.setIcon(new ImageIcon(new ImageIcon(Cards.get(5).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            A19.setIcon(new ImageIcon(new ImageIcon(Cards.get(6).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            A20.setIcon(new ImageIcon(new ImageIcon(Cards.get(7).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            A21.setIcon(new ImageIcon(new ImageIcon(Cards.get(8).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            A22.setIcon(new ImageIcon(new ImageIcon(Cards.get(9).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            add(A13);
            add(A14);
            add(A15);
            add(A16);
            add(A17);
            add(A18);
            add(A19);
            add(A20);
            add(A21);
            add(A22);
            A13.addMouseMotionListener(this);
            A14.addMouseMotionListener(this);
            A15.addMouseMotionListener(this);
            A16.addMouseMotionListener(this);
            A17.addMouseMotionListener(this);
            A18.addMouseMotionListener(this);
            A19.addMouseMotionListener(this);
            A20.addMouseMotionListener(this);
            A21.addMouseMotionListener(this);
            A22.addMouseMotionListener(this);
            A13.setBounds(x, y, 70, 100);
            A14.setBounds(x, y, 70, 100);
            A15.setBounds(x, y, 70, 100);
            A16.setBounds(x, y, 70, 100);
            A17.setBounds(x, y, 70, 100);
            A18.setBounds(x, y, 70, 100);
            A19.setBounds(x, y, 70, 100);
            A20.setBounds(x, y, 70, 100);
            A21.setBounds(x, y, 70, 100);
            A22.setBounds(x, y, 70, 100);
            N.MyHolder = A13;
            O.MyHolder = A14;
            P.MyHolder = A15;
            Q.MyHolder = A16;
            R.MyHolder = A17;
            S.MyHolder = A18;
            T.MyHolder = A19;
            U.MyHolder = A20;
            V.MyHolder = A21;
            W.MyHolder = A22;
            add(N.MyHolder);
            add(O.MyHolder);
            add(P.MyHolder);
            add(Q.MyHolder);
            add(R.MyHolder);
            add(S.MyHolder);
            add(T.MyHolder);
            add(U.MyHolder);
            add(V.MyHolder);
            add(W.MyHolder);
        }
    }
    public void Deck2(){
            for(j=0;j<1;j++) { 
            MyCards2 Z17 = new MyCards2();
            MyCards2 Z18 = new MyCards2();
            MyCards2 Z19 = new MyCards2();
            MyCards2 Z20 = new MyCards2();
            MyCards2 Z21 = new MyCards2();
            MyCards2 Z22 = new MyCards2();
            MyCards2 Z23 = new MyCards2();
            MyCards2 Z24 = new MyCards2();
            MyCards2 Z25 = new MyCards2();
            MyCards2 Z26 = new MyCards2();
            Z17.CValue = 11;
            Z18.CValue = 4;
            Z19.CValue = 12;
            Z20.CValue = 8;
            Z21.CValue = 2;
            Z22.CValue = 13;
            Z23.CValue = 5;
            Z24.CValue = 8;
            Z25.CValue = 9;
            Z26.CValue = 3;
            Z17.ImgName = CardPath2+"\\"+"JC.png";
            Z18.ImgName = CardPath2+"\\"+"4S.png";
            Z19.ImgName = CardPath2+"\\"+"QS.png";
            Z20.ImgName = CardPath2+"\\"+"8C.png";
            Z21.ImgName = CardPath2+"\\"+"2S.png";
            Z22.ImgName = CardPath2+"\\"+"KC.png";
            Z23.ImgName = CardPath2+"\\"+"5S.png";
            Z24.ImgName = CardPath2+"\\"+"8D.png";
            Z25.ImgName = CardPath2+"\\"+"9D.png";
            Z26.ImgName = CardPath2+"\\"+"3D.png";
            Cards2.add(Z17);
            Cards2.add(Z18);
            Cards2.add(Z19);
            Cards2.add(Z20);
            Cards2.add(Z21);
            Cards2.add(Z22);
            Cards2.add(Z23);
            Cards2.add(Z24);
            Cards2.add(Z25);
            Cards2.add(Z26);
            JLabel Q = new JLabel();
            JLabel R = new JLabel();
            JLabel S = new JLabel();
            JLabel T = new JLabel();
            JLabel U = new JLabel();
            JLabel V = new JLabel();
            JLabel W = new JLabel();
            JLabel X = new JLabel();
            JLabel Y = new JLabel();
            JLabel Z = new JLabel();
            int x = 70;
            int y = 470;
            Q.setIcon(new ImageIcon(new ImageIcon(Cards2.get(0).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            R.setIcon(new ImageIcon(new ImageIcon(Cards2.get(1).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            S.setIcon(new ImageIcon(new ImageIcon(Cards2.get(2).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            T.setIcon(new ImageIcon(new ImageIcon(Cards2.get(3).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            U.setIcon(new ImageIcon(new ImageIcon(Cards2.get(4).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            V.setIcon(new ImageIcon(new ImageIcon(Cards2.get(5).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            W.setIcon(new ImageIcon(new ImageIcon(Cards2.get(6).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            X.setIcon(new ImageIcon(new ImageIcon(Cards2.get(7).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            Y.setIcon(new ImageIcon(new ImageIcon(Cards2.get(8).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            Z.setIcon(new ImageIcon(new ImageIcon(Cards2.get(9).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            add(Q);
            add(R);
            add(S);
            add(T);
            add(U);
            add(V);
            add(W);
            add(X);
            add(Y);
            add(Z);
            Q.addMouseMotionListener(this);
            R.addMouseMotionListener(this);
            S.addMouseMotionListener(this);
            T.addMouseMotionListener(this);
            U.addMouseMotionListener(this);
            V.addMouseMotionListener(this);
            W.addMouseMotionListener(this);
            X.addMouseMotionListener(this);
            Y.addMouseMotionListener(this);
            Z.addMouseMotionListener(this);
            Q.setBounds(x, y, 70, 100);
            R.setBounds(x, y, 70, 100);
            S.setBounds(x, y, 70, 100);
            T.setBounds(x, y, 70, 100);
            U.setBounds(x, y, 70, 100);
            V.setBounds(x, y, 70, 100);
            W.setBounds(x, y, 70, 100);
            X.setBounds(x, y, 70, 100);
            Y.setBounds(x, y, 70, 100);
            Z.setBounds(x, y, 70, 100);
            Z17.MyHolder = Q;
            Z18.MyHolder = R;
            Z19.MyHolder = S;
            Z20.MyHolder = T;
            Z21.MyHolder = U;
            Z22.MyHolder = V;
            Z23.MyHolder = W;
            Z24.MyHolder = X;
            Z25.MyHolder = Y;
            Z26.MyHolder = Z;
            add(Z17.MyHolder);
            add(Z18.MyHolder);
            add(Z19.MyHolder);
            add(Z20.MyHolder);
            add(Z21.MyHolder);
            add(Z22.MyHolder);
            add(Z23.MyHolder);
            add(Z24.MyHolder);
            add(Z25.MyHolder);
            add(Z26.MyHolder);
        }
    }
    
    public void Deck3() {
           for(i=0;i<1;i++) {
            MyCards3 Z1 = new MyCards3();
            MyCards3 Z2 = new MyCards3();
            MyCards3 Z3 = new MyCards3();
            MyCards3 Z4 = new MyCards3();
            MyCards3 Z5 = new MyCards3();
            MyCards3 Z6 = new MyCards3();
            MyCards3 Z7 = new MyCards3();
            MyCards3 Z8 = new MyCards3();
            MyCards3 Z9 = new MyCards3();
            MyCards3 Z10 = new MyCards3();
            Z1.CValue = 7;
            Z2.CValue = 10;
            Z3.CValue = 6;
            Z4.CValue = 11;
            Z5.CValue = 4;
            Z6.CValue = 12;
            Z7.CValue = 5;
            Z8.CValue = 14;
            Z9.CValue = 2;
            Z10.CValue = 9;
            Z1.ImgName = CardPath3+"\\"+"7H.png";
            Z2.ImgName = CardPath3+"\\"+"10D.png";
            Z3.ImgName = CardPath3+"\\"+"6S.png";
            Z4.ImgName = CardPath3+"\\"+"JS.png";
            Z5.ImgName = CardPath3+"\\"+"4H.png";
            Z6.ImgName = CardPath3+"\\"+"QC.png";
            Z7.ImgName = CardPath3+"\\"+"5C.png";
            Z8.ImgName = CardPath3+"\\"+"AD.png";
            Z9.ImgName = CardPath3+"\\"+"2D.png";
            Z10.ImgName = CardPath3+"\\"+"9H.png";
            Cards3.add(Z1);
            Cards3.add(Z2);
            Cards3.add(Z3);
            Cards3.add(Z4);
            Cards3.add(Z5);
            Cards3.add(Z6);
            Cards3.add(Z7);
            Cards3.add(Z8);
            Cards3.add(Z9);
            Cards3.add(Z10);
            JLabel A = new JLabel();
            JLabel B = new JLabel();
            JLabel C = new JLabel();
            JLabel D = new JLabel();
            JLabel E = new JLabel();
            JLabel F = new JLabel();
            JLabel G = new JLabel();
            JLabel H = new JLabel();
            JLabel I = new JLabel();
            JLabel J = new JLabel();
            int x = 1150;
            int y = 50;
            A.setIcon(new ImageIcon(new ImageIcon(Cards3.get(0).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            B.setIcon(new ImageIcon(new ImageIcon(Cards3.get(1).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            C.setIcon(new ImageIcon(new ImageIcon(Cards3.get(2).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            D.setIcon(new ImageIcon(new ImageIcon(Cards3.get(3).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            E.setIcon(new ImageIcon(new ImageIcon(Cards3.get(4).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            F.setIcon(new ImageIcon(new ImageIcon(Cards3.get(5).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            G.setIcon(new ImageIcon(new ImageIcon(Cards3.get(6).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            H.setIcon(new ImageIcon(new ImageIcon(Cards3.get(7).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            I.setIcon(new ImageIcon(new ImageIcon(Cards3.get(8).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            J.setIcon(new ImageIcon(new ImageIcon(Cards3.get(9).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            add(A);
            add(B);
            add(C);
            add(D);
            add(E);
            add(F);
            add(G);
            add(H);
            add(I);
            add(J);
            A.addMouseMotionListener(this);
            B.addMouseMotionListener(this);
            C.addMouseMotionListener(this);
            D.addMouseMotionListener(this);
            E.addMouseMotionListener(this);
            F.addMouseMotionListener(this);
            G.addMouseMotionListener(this);
            H.addMouseMotionListener(this);
            I.addMouseMotionListener(this);
            J.addMouseMotionListener(this);
            A.setBounds(x, y, 70, 100);
            B.setBounds(x, y, 70, 100);
            C.setBounds(x, y, 70, 100);
            D.setBounds(x, y, 70, 100);
            E.setBounds(x, y, 70, 100);
            F.setBounds(x, y, 70, 100);
            G.setBounds(x, y, 70, 100);
            H.setBounds(x, y, 70, 100);
            I.setBounds(x, y, 70, 100);
            J.setBounds(x, y, 70, 100);
            Z1.MyHolder = A;
            Z2.MyHolder = B;
            Z3.MyHolder = C;
            Z4.MyHolder = D;
            Z5.MyHolder = E;
            Z6.MyHolder = F;
            Z7.MyHolder = G;
            Z8.MyHolder = H;
            Z9.MyHolder = I;
            Z10.MyHolder = J;
            add(Z1.MyHolder);
            add(Z2.MyHolder);
            add(Z3.MyHolder);
            add(Z4.MyHolder);
            add(Z5.MyHolder);
            add(Z6.MyHolder);
            add(Z7.MyHolder);
            add(Z8.MyHolder);
            add(Z9.MyHolder);
            add(Z10.MyHolder);
           }
    }
    
    public void Deck4() {
          for(i=0;i<1;i++) {
            MyCards4 X = new MyCards4();
            MyCards4 Z = new MyCards4();
            MyCards4 Y = new MyCards4();
            MyCards4 A = new MyCards4();
            MyCards4 B = new MyCards4();
            MyCards4 C = new MyCards4();
            MyCards4 D = new MyCards4();
            MyCards4 E = new MyCards4();
            MyCards4 F = new MyCards4();
            MyCards4 G = new MyCards4();
            X.CValue = 2;
            Z.CValue = 3;
            Y.CValue = 10;
            A.CValue = 7;
            B.CValue = 13;
            C.CValue = 9;
            D.CValue = 14;
            E.CValue = 11;
            F.CValue = 6;
            G.CValue = 12;
            X.ImgName = CardPath4+"\\"+"2C.png";
            Z.ImgName = CardPath4+"\\"+"3H.png";
            Y.ImgName = CardPath4+"\\"+"10S.png";
            A.ImgName = CardPath4+"\\"+"7D.png";
            B.ImgName = CardPath4+"\\"+"KS.png";
            C.ImgName = CardPath4+"\\"+"9C.png";
            D.ImgName = CardPath4+"\\"+"AS.png";
            E.ImgName = CardPath4+"\\"+"JH.png";
            F.ImgName = CardPath4+"\\"+"6D.png";
            G.ImgName = CardPath4+"\\"+"QD.png";
            Cards4.add(X); // Add First Card.
            Cards4.add(Z);
            Cards4.add(Y);
            Cards4.add(A);
            Cards4.add(B);
            Cards4.add(C);
            Cards4.add(D);
            Cards4.add(E);
            Cards4.add(F);
            Cards4.add(G);
            JLabel Ace = new JLabel();
            JLabel Heart = new JLabel();
            JLabel Spade = new JLabel();
            JLabel Clubs = new JLabel();
            JLabel A1 = new JLabel();
            JLabel A2 = new JLabel();
            JLabel A3 = new JLabel();
            JLabel A4 = new JLabel();
            JLabel A5 = new JLabel();
            JLabel A6 = new JLabel();
            int x = 1150;
            int y = 470 ;
            Ace.setIcon(new ImageIcon(new ImageIcon(Cards4.get(0).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            Heart.setIcon(new ImageIcon(new ImageIcon(Cards4.get(1).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            Spade.setIcon(new ImageIcon(new ImageIcon(Cards4.get(2).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            Clubs.setIcon(new ImageIcon(new ImageIcon(Cards4.get(3).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            A1.setIcon(new ImageIcon(new ImageIcon(Cards4.get(4).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            A2.setIcon(new ImageIcon(new ImageIcon(Cards4.get(5).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            A3.setIcon(new ImageIcon(new ImageIcon(Cards4.get(6).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            A4.setIcon(new ImageIcon(new ImageIcon(Cards4.get(7).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            A5.setIcon(new ImageIcon(new ImageIcon(Cards4.get(8).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            A6.setIcon(new ImageIcon(new ImageIcon(Cards4.get(9).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            add(Ace);
            add(Heart);
            add(Spade);
            add(Clubs);
            add(A1);
            add(A2);
            add(A3);
            add(A4);
            add(A5);
            add(A6);
            Ace.addMouseMotionListener(this);
            Heart.addMouseMotionListener(this);
            Spade.addMouseMotionListener(this);
            Clubs.addMouseMotionListener(this);
            A1.addMouseMotionListener(this);
            A2.addMouseMotionListener(this);
            A3.addMouseMotionListener(this);
            A4.addMouseMotionListener(this);
            A5.addMouseMotionListener(this);
            A6.addMouseMotionListener(this);
            Ace.setBounds(x, y, 70, 100);
            Heart.setBounds(x, y, 70, 100);
            Spade.setBounds(x, y, 70, 100);
            Clubs.setBounds(x, y, 70, 100);
            A1.setBounds(x, y, 70, 100);
            A2.setBounds(x, y, 70, 100);
            A3.setBounds(x, y, 70, 100);
            A4.setBounds(x, y, 70, 100);
            A5.setBounds(x, y, 70, 100);
            A6.setBounds(x, y, 70, 100);
            X.MyHolder = Ace;
            Z.MyHolder = Heart;
            Y.MyHolder = Spade;
            A.MyHolder = Clubs;
            B.MyHolder = A1;
            C.MyHolder = A2;
            D.MyHolder = A3;
            E.MyHolder = A4;
            F.MyHolder = A5;
            G.MyHolder = A6;
            add(X.MyHolder);
            add(Z.MyHolder);
            add(Y.MyHolder);
            add(A.MyHolder);
            add(B.MyHolder);
            add(C.MyHolder);
            add(D.MyHolder);
            add(E.MyHolder);
            add(F.MyHolder);
            add(G.MyHolder);
          }
    }
    
    public void Deck5(){
          for(i=0;i<1;i++) {
              MyCards5 A = new MyCards5();
              MyCards5 B = new MyCards5();
              MyCards5 C = new MyCards5();
              MyCards5 D = new MyCards5();
              MyCards5 E = new MyCards5();
              MyCards5 F = new MyCards5();
              MyCards5 G = new MyCards5();
              MyCards5 H = new MyCards5();
              MyCards5 I = new MyCards5();
              MyCards5 J = new MyCards5();
              MyCards5 K = new MyCards5();
              MyCards5 L = new MyCards5();
              A.CValue = 3;
              B.CValue = 4;
              C.CValue = 5;
              D.CValue = 13;
              E.CValue = 10;
              F.CValue = 14;
              G.CValue = 6;
              H.CValue = 13;
              I.CValue = 7;
              J.CValue = 3;
              K.CValue = 14;
              L.CValue = 8;
              A.ImgName = CardPath5+"\\"+"3C.png";
              B.ImgName = CardPath5+"\\"+"4D.png";
              C.ImgName = CardPath5+"\\"+"5H.png";
              D.ImgName = CardPath5+"\\"+"KH.png";
              E.ImgName = CardPath5+"\\"+"10H.png";
              F.ImgName = CardPath5+"\\"+"AC.png";
              G.ImgName = CardPath5+"\\"+"6C.png";
              H.ImgName = CardPath5+"\\"+"KD.png";
              I.ImgName = CardPath5+"\\"+"7C.png";
              J.ImgName = CardPath5+"\\"+"3S.png";
              K.ImgName = CardPath5+"\\"+"AH.png";
              L.ImgName = CardPath5+"\\"+"8S.png";
              Cards5.add(A);
              Cards5.add(B);
              Cards5.add(C);
              Cards5.add(D);
              Cards5.add(E);
              Cards5.add(F);
              Cards5.add(G);
              Cards5.add(H);
              Cards5.add(I);
              Cards5.add(J);
              Cards5.add(K);
              Cards5.add(L);
              JLabel Z1 = new JLabel();
              JLabel Z2 = new JLabel();
              JLabel Z3 = new JLabel();
              JLabel Z4 = new JLabel();
              JLabel Z5 = new JLabel();
              JLabel Z6 = new JLabel();
              JLabel Z7 = new JLabel();
              JLabel Z8 = new JLabel();
              JLabel Z9 = new JLabel();
              JLabel Z10 = new JLabel();
              JLabel Z11 = new JLabel();
              JLabel Z12 = new JLabel();
              int x = 600;
              int y = 500;
            Z1.setIcon(new ImageIcon(new ImageIcon(Cards5.get(0).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            Z2.setIcon(new ImageIcon(new ImageIcon(Cards5.get(1).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            Z3.setIcon(new ImageIcon(new ImageIcon(Cards5.get(2).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            Z4.setIcon(new ImageIcon(new ImageIcon(Cards5.get(3).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            Z5.setIcon(new ImageIcon(new ImageIcon(Cards5.get(4).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            Z6.setIcon(new ImageIcon(new ImageIcon(Cards5.get(5).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            Z7.setIcon(new ImageIcon(new ImageIcon(Cards5.get(6).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            Z8.setIcon(new ImageIcon(new ImageIcon(Cards5.get(7).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            Z9.setIcon(new ImageIcon(new ImageIcon(Cards5.get(8).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            Z10.setIcon(new ImageIcon(new ImageIcon(Cards5.get(9).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            Z11.setIcon(new ImageIcon(new ImageIcon(Cards5.get(10).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            Z12.setIcon(new ImageIcon(new ImageIcon(Cards5.get(11).ImgName).getImage().getScaledInstance(70, 100, Image.SCALE_DEFAULT)));
            add(Z1);
            add(Z2);
            add(Z3);
            add(Z4);
            add(Z5);
            add(Z6);
            add(Z7);
            add(Z8);
            add(Z9);
            add(Z10);
            add(Z11);
            add(Z12);
            Z1.addMouseMotionListener(this);
            Z2.addMouseMotionListener(this);
            Z3.addMouseMotionListener(this);
            Z4.addMouseMotionListener(this);
            Z5.addMouseMotionListener(this);
            Z6.addMouseMotionListener(this);
            Z7.addMouseMotionListener(this);
            Z8.addMouseMotionListener(this);
            Z9.addMouseMotionListener(this);
            Z10.addMouseMotionListener(this);
            Z11.addMouseMotionListener(this);
            Z12.addMouseMotionListener(this);
            Z1.setBounds(x, y, 70, 100);
            Z2.setBounds(x, y, 70, 100);
            Z3.setBounds(x, y, 70, 100);
            Z4.setBounds(x, y, 70, 100);
            Z5.setBounds(x, y, 70, 100);
            Z6.setBounds(x, y, 70, 100);
            Z7.setBounds(x, y, 70, 100);
            Z8.setBounds(x, y, 70, 100);
            Z9.setBounds(x, y, 70, 100);
            Z10.setBounds(x, y, 70, 100);
            Z11.setBounds(x, y, 70, 100);
            Z12.setBounds(x, y, 70, 100);
            A.MyHolder = Z1;
            B.MyHolder = Z2;
            C.MyHolder = Z3;
            D.MyHolder = Z4;
            E.MyHolder = Z5;
            F.MyHolder = Z6;
            G.MyHolder = Z7;
            H.MyHolder = Z8;
            I.MyHolder = Z9;
            J.MyHolder = Z10;
            K.MyHolder = Z11;
            L.MyHolder = Z12;
            add(A.MyHolder);
            add(B.MyHolder);
            add(C.MyHolder);
            add(D.MyHolder);
            add(E.MyHolder);
            add(F.MyHolder);
            add(G.MyHolder);
            add(H.MyHolder);
            add(I.MyHolder);
            add(J.MyHolder);
            add(K.MyHolder);
            add(L.MyHolder);
          }  
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        for(MyCards X : Cards) {
          if(X.MyHolder.equals(e.getSource())){
          X.MyHolder.setBounds(e.getXOnScreen()-35, e.getYOnScreen()-50, 70, 100);   // Mouse Dragging Coordinates.
          }
        }
        for(MyCards2 Y : Cards2) {
            if(Y.MyHolder.equals(e.getSource())){
                Y.MyHolder.setBounds(e.getXOnScreen()-35,e.getYOnScreen()-50,70,100);
            }
        }
        for(MyCards3 Z : Cards3) {
            if(Z.MyHolder.equals(e.getSource())){
                Z.MyHolder.setBounds(e.getXOnScreen()-35,e.getYOnScreen()-50,70,100);
        }
    }
        for(MyCards4 W : Cards4) {
            if(W.MyHolder.equals(e.getSource())){
                W.MyHolder.setBounds(e.getXOnScreen()-35,e.getYOnScreen()-50,70,100);
        }
    }
        for(MyCards5 V : Cards5){
            if(V.MyHolder.equals(e.getSource())){
                V.MyHolder.setBounds(e.getXOnScreen()-35,e.getYOnScreen()-50,70,100);
        }
    }
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {}

    @Override
    public void mouseClicked(MouseEvent e) {}
   
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
    
    public static class InstructionsButton implements ActionListener { 
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "* Each Player Has 10 Cards, In order to WIN the Player must Collect 4 Cards of the Same Number *");
            JOptionPane.showMessageDialog(null, "* Player 1 Starts the Game then -> Player 2 then -> Player 3 then _> Player 4");
            JOptionPane.showMessageDialog(null, "* Players Play by Turn, They have the Option of Picking a Card from the Pile of Cards or from the Ground *");
            JOptionPane.showMessageDialog(null, "* The Player Must ALWAYS Leave a Card on the Ground when his turn comes *");
            JOptionPane.showMessageDialog(null, "* It is Better if each Player Spreads his Cards in 2 rows by 5 Columns *");
            JOptionPane.showMessageDialog(null, "* First Player to Collect 4 Cards of the (SAME NUMBER) WINS! *");
            JOptionPane.showMessageDialog(null, "              *  ENJOY ;)  *");
        }
     }
    
    public static class ExitButton implements ActionListener{          
        @Override
        public void actionPerformed(ActionEvent e) {
            exit(0);
        }  
    } 
    
    public static class Player1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "              * PLAYER 1 *");
        }
    }
    
    public static class Player2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "              * PLAYER 3 *");
        }  
    }
    
    public static class Player3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "              * PLAYER 2 *");
        }
    }
    
    public static class Player4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "              * PLAYER 4 *");
        }
    }
    
    public static class MyPile implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "* Pick ONE Card...Leave a Card on the Ground * ");
        }
        
    }
}
