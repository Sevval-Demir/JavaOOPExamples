package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f=new JFrame("List Örneği");
		
		DefaultListModel<String> l=new DefaultListModel<>();
		l.addElement("C++");
		l.addElement("Javascript");
		l.addElement("Java");
		l.addElement("PHP");
		
		JList<String> list=new JList<>(l);
		list.setBounds(100,100,75,75);
		list.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
		
		DefaultListModel<String> l2=new DefaultListModel<>();
		l2.addElement("Swing");
		l2.addElement("Laravel");
		l2.addElement("VueJs");
		l2.addElement("Bootstrap");
		
		JList<String> list2=new JList<>(l2);
		list2.setBounds(100,200,75,85);
		
		JButton btn=new JButton("Göster");
		btn.setBounds(200,150,80,30);
		btn.addActionListener(new ActionListener() {
			String txt="";
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(list.getSelectedIndex()!=-1)
				{
					txt="Seçilen Programlama Dili :"+list.getSelectedValue();
				}
				
				if(list2.getSelectedIndex()!=-1)
				{
					txt+=", Seçilen Framework : ";
					for(Object item : list2.getSelectedValuesList())
					{
						txt+=item;
					}
				}
				System.out.println(txt);
				
			}
		});
		
		f.add(list);
		f.add(list2);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
