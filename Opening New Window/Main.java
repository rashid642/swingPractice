import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class frames implements ActionListener {
	JFrame frame=new JFrame();
	int x;
	JButton myButton = new JButton("New Window");
	frames(){
		x=0;
		createframes();
	}
	public void createframes(){
		myButton.setBounds(100,100,200,40);
		myButton.setFocusable(false);
		myButton.addActionListener(this);

		frame.setTitle("Border Layout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setBounds(100,100,500,500);
		frame.add(myButton);
	}

	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==myButton){
			//frame.dispose();//get rid of already page;
			NewWindow myWindow=new NewWindow(x);
			x+=20;
		}
	}	
}

class Main{
	public static void main(String args[]){
		new frames();
	}
}