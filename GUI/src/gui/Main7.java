package gui;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JPopupMenu
		
		JFrame f=new JFrame("PopupMenü Örneği");
		JPopupMenu pm=new JPopupMenu("Menü");
		
		JMenuItem cut=new JMenuItem("Kes");
		JMenuItem copy=new JMenuItem("Kopyala");
		JMenuItem paste=new JMenuItem("Yapıştır");
		
		pm.add(cut);
		pm.add(copy);
		pm.add(paste);
		
		cut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(f, "Kes butonuna tıklandı");
			}
		});
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
