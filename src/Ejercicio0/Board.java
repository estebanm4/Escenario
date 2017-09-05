/*
PLANTILLA BASE PARA CREACION DE ESCENARIOS.
 */
package Ejercicio0;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener{

    private final int DELAY = 25;
    private Timer timer;
    private int xRef = 50;
    private int yRef = 50;
    
    public Board(){
        timer = new Timer(this.DELAY, this);
        timer.start();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.blue);
        g.fillRect(this.xRef+0, yRef+30, 50, 10);
        
        g.setColor(Color.black);
        g.fillOval(this.xRef+10,yRef+40,10,10);
        
        g.setColor(Color.black);
        g.fillOval(this.xRef+30,yRef+40,10,10);
        
        g.setColor(Color.blue);
        g.fillRect(this.xRef+10,yRef+20, 25, 10);
        
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        this.xRef=+1;
        repaint();
    
    }
    
    
    
}
