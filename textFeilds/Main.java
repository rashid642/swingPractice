import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ActionEventDemo implements ActionListener {
    JFrame frame=new JFrame();
    JTextField textFeild=new JTextField();
    JButton button = new JButton("Submit");

    ActionEventDemo(){
        prepareGUI();
        textfeilds();
	submitbutton();
    }

    public void prepareGUI(){
        frame.setTitle("My Window");
        //frame.getContentPane().setLayout(null);
	frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setBounds(0,0,400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
    }
    public void textfeilds(){
	textFeild.setPreferredSize(new Dimension(250,40));
	frame.add(textFeild);
    }
    public void submitbutton(){
	button.addActionListener(this);
	frame.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
		System.out.println("Welcome "+textFeild.getText());
	}
    }
}

public class Main {
    public static void main(String[] args)
    {
        new ActionEventDemo();
    }
}