import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ActionEventDemo implements ActionListener {
    JFrame frame=new JFrame();
    JButton button=new JButton("Click Me");

    ActionEventDemo(){
        prepareGUI();
        buttonProperties();
    }

    public void prepareGUI(){
        frame.setTitle("My Window");
        //frame.getContentPane().setLayout(null);
	frame.setLayout(null);
        frame.setVisible(true);
        frame.setBounds(0,0,400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void buttonProperties(){
	ImageIcon icon=new ImageIcon("profilepic.jpg");
        button.setBounds(50,50,200,200);
	button.setText("change color");
	button.setIcon(icon);
	button.setHorizontalTextPosition(JButton.LEFT);
	button.setVerticalTextPosition(JButton.BOTTOM);
        frame.add(button);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Changing Background Color
        frame.getContentPane().setBackground(Color.pink);
	System.out.println("clicked");

    }
}

public class temp {
    public static void main(String[] args)
    {
        new ActionEventDemo();
    }
}