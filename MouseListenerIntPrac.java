import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.*;
public class MouseListenerIntPrac extends JPanel{
    JFrame frame;
    JLabel label;
    public MouseListenerIntPrac(){
        frame = new JFrame();
        frame.add(this);
        frame.setVisible(true);
        frame.setSize(400, 400);
        setFocusable(true);
        label = new JLabel("Demo for mouse events", JLabel.CENTER);
        frame.add(label);
        frame.addMouseListener(new MouseInterface());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public class MouseInterface implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            label.setText("It Clicked!");
            label.setForeground(Color.ORANGE);

        }
        @Override
        public void mouseReleased(MouseEvent e) {
            label.setText("I've been released");
            label.setForeground(Color.RED);
        }
        @Override
        public void mouseEntered(MouseEvent e) {
            label.setText("“It's not easy to be a cat.” -Tom");
            frame.getContentPane().setBackground(Color.RED);
        }
        @Override
        public void mouseExited(MouseEvent e) {
            label.setText("you can do this!");
            label.setForeground(Color.WHITE);
            frame.getContentPane().setBackground(Color.BLACK);


        }
        @Override
        public void mousePressed(MouseEvent e) {
            label.setText("Will it click or release");
            frame.getContentPane().setBackground(Color.GREEN);

        }
    }
    public static void main(String[] args){
        MouseListenerIntPrac demo = new MouseListenerIntPrac();
    }
}
