package lab11f;

//@author sak5680

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;


public class Lab11f {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        FourLineComponent comp = new FourLineComponent();
        frame.add(comp);
        
        class MousePressListener implements MouseListener{
            public void mousePressed(MouseEvent event){
                comp.setPoint(event.getX(),event.getY());
                comp.repaint();
            }
            public void mouseReleased(MouseEvent event){}
            public void mouseClicked(MouseEvent event){}
            public void mouseEntered(MouseEvent event){}
            public void mouseExited(MouseEvent event){}
        }
    }
}
