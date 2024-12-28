import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main7 {

	public static void main(String[] args) {
		
		JFrame f=new JFrame("CheckBox Örneği");
		JLabel lb=new JLabel();
		lb.setBounds(150,50,300,50);
		JCheckBox ch1=new JCheckBox("C++");
		JCheckBox ch2=new JCheckBox("Java");
		
		ch1.setBounds(150,100,250,50);
		ch2.setBounds(150,150,250,50);
		
		JButton btn=new JButton("Kontrol");
		btn.setBounds(150,200,100,30);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(ch1.isSelected())
				{
					System.out.println(ch1.getText()+" Seçildi !");
				}
				
				if(ch2.isSelected())
				{
					System.out.println(ch2.getText()+" Seçildi !");
				}
			}
		});
		
		f.add(btn);
		f.add(ch2);
		f.add(ch1);
		f.add(lb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
