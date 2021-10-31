import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
public class Main{
	public static void main(String args[]){
		JFrame frame =new JFrame();

		ImageIcon image=new ImageIcon("profilepic.jpg");
		//Border borderline=BorderFactory.createLineBorder(Color.green,3);

		JLabel label=new JLabel();//create a label
		label.setText("do u code");//set tet of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);//set text LEFT,CENTER,RIGHT of imageiicon

		label.setVerticalTextPosition(JLabel.TOP);//set text TOP,CENTER,BOTTOM of imageicon

		label.setForeground(Color.red);

		label.setFont(new Font("MV Boli",Font.PLAIN,20));
		//fontname,style,size

		label.setIconTextGap(-25);//set gap of text to image
		
		label.setBackground(Color.black);//set background color
		label.setOpaque(true);//display backgrond color
		
		//label.setBorder(borderline);

		label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within label

		label.setHorizontalAlignment(JLabel.CENTER);

		frame.setLayout(null);
		label.setBounds(100,100,250,250);//(x,y,width,heght)
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);

		frame.add(label);
		//frame.pack();//adjust according to label size

	}
}