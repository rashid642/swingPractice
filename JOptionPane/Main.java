import javax.swing.JOptionPane;
class Main{
	public static void main(String args[]){
//JOptionPane is pop up a standard dialog box that prompts users for a value or informs themof something

		JOptionPane.showMessageDialog(null,"This is text","Title kuch bhi", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,"This is text","Title kuch bhi", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,"This is text","Title kuch bhi", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null,"This is text","Title kuch bhi", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null,"This is text","Title kuch bhi", JOptionPane.ERROR_MESSAGE);

		//JOptionPane.showConfirmDialog(null,"do u code?","this is my title", JOptionPane.YES_NO_CANCEL_OPTION);
		System.out.println(JOptionPane.showConfirmDialog(null,"do u code?","this is my title", JOptionPane.YES_NO_CANCEL_OPTION));
		//yes return 0;
		//no return 1;
		//cancel return 2;
		
		String name=JOptionPane.showInputDialog("Whats ur name?:");
		System.out.println(name);
		//explore showoptiondialog
	}
}