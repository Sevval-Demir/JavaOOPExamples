package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JOptionPane
		
		JFrame f=new JFrame("OptionPane Örneği");
		JOptionPane.showMessageDialog(f, "Merhaba,Kodlama Vaktine Hoşgeldin!");
		
		String str=JOptionPane.showInputDialog(f,"Adınız");
		System.out.println(str);
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
