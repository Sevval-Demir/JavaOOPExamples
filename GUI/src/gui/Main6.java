package gui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JMenu
		
		JFrame f= new JFrame("Menü Örneği");
		JMenuBar mb=new JMenuBar();
		JMenu menu=new JMenu("Anamenü");
		JMenu submenu=new JMenu("Alt Menü");
		
		JMenuItem i1=new JMenuItem("Menu 1");
		JMenuItem i2=new JMenuItem("Menu 2");
		JMenuItem i3=new JMenuItem("Menu 3");
		JMenuItem i4=new JMenuItem("Menu 4");
		
		JMenuItem a1=new JMenuItem("AltMenu 1");
		JMenuItem a2=new JMenuItem("AltMenu 2");
		submenu.add(a1);
		submenu.add(a2);
		
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		menu.add(i4);
		menu.add(submenu);
		
		mb.add(menu);
		f.setJMenuBar(mb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
