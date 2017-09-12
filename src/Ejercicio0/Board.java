/*
PLANTILLA BASE PARA CREACION DE ESCENARIOS.
 */
package Ejercicio0;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {

    private final int DELAY = 25;
    private Timer timer;
    private int xRefCa;
    private int yRefCa;
    private int xRefOv;
    private int yRefOv;
    private int xRefGa;
    private int numIma;
            
    
    public Board(){
        timer = new Timer(this.DELAY, this);
        timer.start();
        xRefCa = 50;
        yRefCa = 350;
        xRefOv = 500;
        yRefOv = 50;
        xRefGa = 20;
        numIma = 0;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
         
        Image fondo = loadImage("fondo.png");
        g.drawImage(fondo, 0, 0, null);
        
        g.setColor(Color.blue);
        g.fillRect(this.xRefCa+0, yRefCa+30, 100, 20);
        
        g.setColor(Color.black);
        g.fillOval(this.xRefCa+15,yRefCa+40,20,20);
        
        g.setColor(Color.black);
        g.fillOval(this.xRefCa+60,yRefCa+40,20,20);
        
        g.setColor(Color.blue);
        g.fillRect(this.xRefCa+50,yRefCa+10, 20, 20);
        
        g.setColor(Color.black);
        g.drawRect(xRefCa, yRefCa+20, 50, 30);
        Rectangle carro = new Rectangle(this.xRefCa, yRefCa+20, 50, 30 );
        
        g.setColor(Color.orange);
        g.fillOval(xRefOv+500, yRefOv, 50, 50);
        
        g.setColor(Color.orange);
        g.drawRect(xRefOv+1500, yRefOv, 50, 50);
        Rectangle ovalo = new Rectangle(this.xRefOv+500, yRefOv, 50, 50);
        
        Image cat = loadImage("cats.gif");
        g.drawImage(cat, this.xRefGa, 100, (this.xRefGa+132), (100+80), (this.numIma*132), 0, (this.numIma*132)+132, 80, this);
        
        //g.drawImage(cat, 152, 100, 284, 180, 264, 0, 396, 80, this);
              
        //if(carro.intersects(ovalo)){
        //    this.timer.stop();
        //}
    }
    
    public Image loadImage(String imageName){           
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.xRefCa ++;
        this.xRefOv ++;
        //this.numIma ++;
        this.xRefGa ++;
        if (this.numIma == 6){
            this.numIma = 0;
        } else {
            this.numIma++;
        }
        repaint();
    }
}
