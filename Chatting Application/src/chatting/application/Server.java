package chatting.application;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Server extends JFrame implements ActionListener{
    
    Server(){ //Contrustor for showing frame when main fucntion is called!
        
        setLayout(null); // show some layout(ex box,etc)
        
        JPanel p1 = new JPanel(); //kind of navbar
        p1.setBackground(new Color(7,94,84));
        p1.setBounds(0,0,450,70);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
        Image i2 = i1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel back = new JLabel(i3);
        back.setBounds(5,20,25,25);
        p1.add(back);
        back.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent ae) {
                
                System.exit(0);
            }
        });
        
        
        
        setSize(450,700); // Size of frame(of app)
        setLocation(200,50);// change the location where frame will visible
        getContentPane().setBackground(Color.WHITE); // to set color of background color
        
        
        
        
        
        
        setVisible(true); // To show the frame
    }
    
    public void actionPerformed(ActionEvent ae){
        
    }
    
    
    public static void main(String args[]){
        new Server();
        
    }
}
