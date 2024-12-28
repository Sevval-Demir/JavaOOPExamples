package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		//JComboBox
		//obj.setBounds(x,y,width,height)
		
		JFrame f=new JFrame("ComboBox Örneği");
		String arr[]= {"C","C#","C++","Java","Python"};
		JComboBox cb=new JComboBox(arr);
		
		cb.setBounds(50, 100, 90, 20);
		
		JButton btn=new JButton("Seç");
		btn.setBounds(50,150,80,20);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text="Seçilen Programlama Dili : "+cb.getItemAt(cb.getSelectedIndex());
			}
		});
		
		f.add(cb);
		f.add(btn);
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
