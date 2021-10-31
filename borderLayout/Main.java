import javax.swing.*;
import java.awt.*;
class frames{
	JFrame frame=new JFrame();
	frames(){
		createframes();
		createPanels();
	}
	public void createframes(){
		frame.setTitle("Border Layout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(new BorderLayout());
		frame.setBounds(100,100,500,500);
	}
	public void createPanels(){
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();

		panel1.setBackground(Color.black);
		panel2.setBackground(Color.DARK_GRAY);
		panel3.setBackground(Color.DARK_GRAY);
		panel4.setBackground(Color.black);
		panel5.setBackground(Color.white);

		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));

		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.WEST);
		frame.add(panel3,BorderLayout.EAST);
		frame.add(panel4,BorderLayout.SOUTH);
		frame.add(panel5,BorderLayout.CENTER);

	}	
}
class Main{
	public static void main(String args[]){
		new frames();
//Layout Manager defines the natural layout for components within a container
//3 main manager
//Border Layout is places components in 5 areas:NORTH SOUTH WEST EAST CENTER
//all extra spaces is placed in the center area
	}
}