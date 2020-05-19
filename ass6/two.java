import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

class two implements ActionListener
{
	JFrame F;
	JMenuBar Mb;
	JMenu Mf,Ms,M4;
	JMenuItem M1,M2,M3,M5,M6;
	JTextArea T;
	Font fnt = new Font("ComicSansMS",1,20);
	Font fnt1 = new Font("ComicSansMS",1,15);
	static int flag=0;
	String file;
	//JFileChooser open;
	two()
	{
		F = new JFrame("FILE MENU");
		F.setLayout(null);
		F.setBounds(250,200,400,400);
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Mb = new JMenuBar();
		Mf = new JMenu("  File");
		Ms = new JMenu("  Settings");
		M4 = new JMenu("  Change Case ");
		Mf.setFont(fnt);
		Ms.setFont(fnt);
		M4.setFont(fnt1);
		Mb.add(Mf);
		Mb.add(Ms);
		Ms.add(M4);
		M1 = new JMenuItem("  Load");
		M1.addActionListener(this);
		Mf.add(M1);
		M1.setFont(fnt1);
		M2 = new JMenuItem("  Save");
		M2.addActionListener(this);
		Mf.add(M2);
		M2.setFont(fnt1);
		M3 = new JMenuItem("  Exit");
		M3.addActionListener(this);
		Mf.add(M3);
		M3.setFont(fnt1);
		M5 = new JMenuItem("  Upper Case");
		M5.addActionListener(this);
		M4.add(M5);
		M5.setFont(fnt1);
		M6 = new JMenuItem("  Lower Case");
		M6.addActionListener(this);
		M4.add(M6);
		M6.setFont(fnt1);
		F.setJMenuBar(Mb);
		F.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==M3)
		{
			int n = JOptionPane.showConfirmDialog(F,"Are you sure want to exit ?","CONFIRMATION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
			if(n==JOptionPane.YES_OPTION)
				System.exit(0);
		}
		if(ae.getSource()==M1)
		{
			JFileChooser open = new JFileChooser(); 
			int option = open.showOpenDialog(open);
		//	file = JOptionPane.showInputDialog(F,"Enter the file name to load: ");
			File fp = new File(open.getSelectedFile().getPath());
			try
			{
				String line;
				if(fp.isFile())
				{
					T = new JTextArea(100,100);
					T.setBounds(10,10,480,400);
					F.add(T);
					BufferedReader br = new BufferedReader(new FileReader(fp));
					while((line = br.readLine())!=null)
					{
						T.setText(T.getText().concat(line)+"\n");
					}
					flag=1;
				}
				else
					JOptionPane.showMessageDialog(F,"INVALID FILE","ERROR",JOptionPane.ERROR_MESSAGE);
			}
			catch(Exception e){}
		}
		if(ae.getSource()==M5)
		{
			if(flag==1)
			{
				int n = JOptionPane.showConfirmDialog(F,"Are you sure want to change case ?","CONFIRMATION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
				if(n == JOptionPane.YES_OPTION)
				{
					String str = T.getText();
					T.setText(str.toUpperCase());
				}
			}
			else if(flag==0)
				JOptionPane.showMessageDialog(F,"FILE NOT SELECTED","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		if(ae.getSource()==M6)
		{
			if(flag==1)
			{
				int n = JOptionPane.showConfirmDialog(F,"Are you sure want to change case ?","CONFIRMATION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
				if(n == JOptionPane.YES_OPTION)
				{
					String str = T.getText();
					T.setText(str.toLowerCase());
				}
			}
			else if(flag==0)
				JOptionPane.showMessageDialog(F,"FILE NOT SELECTED","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		if(ae.getSource()==M2)
		{
			JFileChooser save = new JFileChooser();
			int option = save.showSaveDialog(save);
			File file = new File(save.getSelectedFile().getPath());
			/*int n = JOptionPane.showConfirmDialog(F,"Are you sure want to change case ?","CONFIRMATION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
				if(n == JOptionPane.YES_OPTION)*/
				{
					try
					{
						String str = T.getText();
						FileOutputStream fos = new FileOutputStream(file);
						byte buff[] = str.getBytes();
						fos.write(buff);
						fos.close();
						JOptionPane.showMessageDialog(F,"File Saved Successfully");
					}
					catch(Exception e){}
				}
		}
	}
	public static void main(String args[])
	{
		new two();
	}
}
