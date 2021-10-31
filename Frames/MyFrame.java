import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
public class MyFrame extends JFrame{
	MyFrame(){
		this.setTitle("First Software");//Sets title
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application when clicked on X, by default is HIDE_ON_CLOSE
		//DO_NOTHING_ON_CLOSE do nothing when X is clicked

		this.setResizable(false);//prevent resizing
		this.setSize(420,420);//sets x and y dimension of frame
		this.setVisible(true);

		ImageIcon image=new ImageIcon("profilepic.jpg");//create an imageicon
		this.setIconImage(image.getImage());//change icon of frame
		
		//this.getContentPane().setBackground(Color.green);//change color of background
		this.getContentPane().setBackground(new Color(255,100,255));
	}
}