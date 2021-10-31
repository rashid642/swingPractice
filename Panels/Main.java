import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.BorderLayout;
class Main{
	public static void main(String ars[]){
		//JPanel is a GUI component that functions as a container to hold other components
		ImageIcon icon=new ImageIcon("profilepic.jpg");

		JLabel label=new JLabel();
		label.setText("Rashid");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.RIGHT);
		label.setBounds(0,0,200,200);
		
		JPanel redPanel=new JPanel();
		redPanel.setBackground(Color.red);	
		redPanel.setBounds(0,0,250,250);
		redPanel.add(label);

		JPanel bluePanel=new JPanel();
		bluePanel.setBackground(Color.blue);	
		bluePanel.setBounds(250,0,250,250);

		JPanel greenPanel=new JPanel();
		greenPanel.setBackground(Color.green);	
		greenPanel.setBounds(0,250,500,250);
		//greenPanel.setLayout(new BorderLayout());
		greenPanel.setLayout(null);
		greenPanel.add(label);		

		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);
		frame.add(redPanel);
		frame.add(bluePanel);		
		frame.add(greenPanel);
	
	}
}