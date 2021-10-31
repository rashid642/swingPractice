import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
public class First{
	public static void main(String args[]){
		//JFrame = a GUI window to add components to
		/*
		JFrame frame=new JFrame();//creates a frame
		
		frame.setTitle("First Software");//Sets title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application when clicked on X, by default is HIDE_ON_CLOSE
		//DO_NOTHING_ON_CLOSE do nothing when X is clicked

		frame.setResizable(false);//prevent resizing
		frame.setSize(420,420);//sets x and y dimension of frame
		frame.setVisible(true);

		ImageIcon image=new ImageIcon("profilepic.jpg");//create an imageicon
		frame.setIconImage(image.getImage());//change icon of frame
		
		//frame.getContentPane().setBackground(Color.green);//change color of background
		frame.getContentPane().setBackground(new Color(255,100,255));
		*/

		MyFrame myFrame=new MyFrame();
	}
}