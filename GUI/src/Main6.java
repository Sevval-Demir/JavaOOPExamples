import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main6 {

	public static void main(String[] args) {
		//JPasswordField
		//obj.setBounds(x,y,width,height);
		
		JFrame f=new JFrame("PasswordField Örneği");
		
		JLabel l1=new JLabel("Şifre : ");
		l1.setBounds(20,20,100,30);
		
		JPasswordField pass=new JPasswordField();
		pass.setBounds(20,50,100,30);
		
		JButton btn=new JButton("Gönder");
		btn.setBounds(20,80,100,30);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String password=new String(pass.getPassword());
				l1.setText(l1.getText()+password);
				
			}
		});
		
		f.add(l1);
		f.add(pass);
		f.add(btn);
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		

	}

}
