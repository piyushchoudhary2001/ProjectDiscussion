import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDiscussion implements ActionListener {

   JFrame frame;
   JButton button,button2;
   SwingDiscussion()
   {
       frame=new JFrame("Session");
       frame.setLayout(null);
       frame.setVisible(true);
       frame.setBackground(Color.blue);
       frame.setSize(1000,600);

       button=new JButton("Click me!!");
       button.setSize(100,50);
       button.addActionListener(this);

       button2=new JButton("BT2");
       button2.setSize(100,50);
       button2.setLocation(200,100);
       button2.addActionListener(this);

       frame.add(button);
       frame.add(button2);

       frame.getContentPane().setBackground(Color.yellow);

   }





    public static void main(String[] args) {
       SwingDiscussion obj=new SwingDiscussion();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s=e.getActionCommand();

        if(s.equals("Click me!!"))
        {
            frame.getContentPane().setBackground(Color.red);
        }
        if(s.equals("BT2"))
        {
            frame.getContentPane().setBackground(Color.black);
        }
    }
}
