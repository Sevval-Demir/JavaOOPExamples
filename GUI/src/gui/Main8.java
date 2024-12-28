package gui;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JProgressBar
		
		JFrame f=new JFrame("JProgressBar Örneği");
		JProgressBar jb=new JProgressBar(0,2000);
		
		jb.setBounds(40,40,160,30);
		jb.setValue(0);
		jb.setStringPainted(true);
		
		f.add(jb);
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
		int i=0;
		while(i<=200)
		{
			jb.setValue(i);
			i+=20;
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
