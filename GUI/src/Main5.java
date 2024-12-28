import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main5 {

	public static void main(String[] args) {
		//JTextArea
		//obj.setBounds(x,y,width,height)
		
		JFrame f=new JFrame("TextArea Örneği");
		JLabel l1,l2;
		JTextArea area;
		JButton btn;
		
		l1=new JLabel();
		l1.setBounds(50,25,100,30);
		
		l2=new JLabel();
		l2.setBounds(160,25,100,30);
		
		area=new JTextArea();
		area.setBounds(20,75,250,200);
		
		btn=new JButton("Hesapla");
		btn.setBounds(100,300,120,30);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String text=area.getText();
				String words[]=text.split("\\s");
				l1.setText("Kelime :"+words.length);
				l2.setText("Karakter :"+text.length());
				
			}
		});
		
		f.add(l1);
		f.add(l2);
		f.add(area);
		f.add(btn);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
