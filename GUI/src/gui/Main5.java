package gui;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JScrollBar
		
		JFrame f=new JFrame("JScrollBar Örneği");
		JLabel lbl=new JLabel();
		
		lbl.setBounds(100,50,300,30);
		
		JScrollBar s=new JScrollBar(JScrollBar.VERTICAL);
		s.setBounds(100,100,50,100);
		
		s.addAdjustmentListener(new AdjustmentListener() {
			
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				// TODO Auto-generated method stub
				
				lbl.setText("ScrollBar Değeri : "+(s.getValue()+s.getModel().getExtent()));
			}
		});
		
		f.add(lbl);
		f.add(s);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
