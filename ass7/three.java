import javax.swing.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.*;
/*
<applet code="three.class" width="100" height="100"></applet>*/
public class three extends Applet implements ActionListener
{
	JTextField t1;
	JButton b1,b2;
	
	public void init()
	{
		t1=new JTextField("Welcome!");
		b1=new JButton("Background");	
		b2=new JButton("Foreground");
		//b1.setBounds(50,100,100,100);
		//b2.setBounds(100,100,100,100);
		add(t1);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);	
	}

public void actionPerformed(ActionEvent ae) 
{
		
	if(ae.getSource()==b1)
	{
		Color c=JColorChooser.showDialog(null,"select colour",Color.RED);
		setBackground(c);
	}
	else if(ae.getSource()==b2)
	{                                                       
			Color c=JColorChooser.showDialog(null,"select colour",Color.RED);
			t1.setForeground(c);	
	}	
}
}

