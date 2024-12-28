import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Main2 {

	public static void main(String[] args) {
		//JButton
		//btn.setBounds(x,y,width,height)
		
		JFrame f=new JFrame("Buton Örneği");
		JButton btn=new JButton("Gönder");
		btn.setBounds(100,100,100,30);
		
		btn.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						System.out.println("Butona tıklandı");
					}
			
				});
		f.add(btn);
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
