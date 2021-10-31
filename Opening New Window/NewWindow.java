import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class NewWindow{
	int x;
	JFrame frame=new JFrame();
	JLabel label = new JLabel("Hello..!!!");
	NewWindow(int x){
		this.x=x;
		createframes();
	}
	public void createframes(){
		label.setBounds(0,0,150,50);
		label.setFont(new Font(null,Font.PLAIN,25));

		frame.setTitle("New Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setBounds(x,x,500,500);
		frame.add(label);
	}
}