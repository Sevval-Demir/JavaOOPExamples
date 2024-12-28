import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class Main8 {

	public static void main(String[] args) {
		
		JFrame f=new JFrame("CheckBox Örneği");
		JLabel lb=new JLabel("Seçim Yapın !");
		lb.setBounds(150,50,300,50);
		JCheckBox ch1=new JCheckBox("C++");
		JCheckBox ch2=new JCheckBox("Java");
		
		ch1.setBounds(150,100,250,50);
		ch2.setBounds(150,150,250,50);
		
		ch1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				lb.setText("C++ Seçim Kutusu "+(e.getStateChange()==1 ? "seçildi" : "seçilmedi"));
				
			}
		});
		
		ch2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				lb.setText("Java Seçim Kutusu "+(e.getStateChange()==1 ? "seçildi" : "seçilmedi"));
				
			}
		});
		
		
		f.add(ch2);
		f.add(ch1);
		f.add(lb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
