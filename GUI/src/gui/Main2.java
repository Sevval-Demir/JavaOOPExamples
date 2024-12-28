package gui;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Main2 {
	public static void main(String[] args)
	{
		//JTable
		//obj.setBounds(x,y,width,height)
		
		JFrame f=new JFrame("Table Örneği");
		
		String[][] veri= {{"1","Mat","85"},{"2","FEN","50"},{"3","TUR","100"}};
		String[] baslik= {"ID","DERS","NOT"};
		
		JTable jt=new JTable(veri,baslik);
		jt.setBounds(30,40,200,300);
		
		JScrollPane sp=new JScrollPane(jt);
		
		f.add(sp);
		f.setSize(400,400);
		f.setVisible(true);
	}

}
