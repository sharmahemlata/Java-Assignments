import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.font.TextAttribute;
import java.util.*;
import java.applet.Applet;

/*<applet code="two.class" height=250 width=450>
</applet>*/
 
public class two extends Applet implements ItemListener
{
	JComboBox cb1,cb2;
	JCheckBox c1,c2,c3;
	JTextArea tf;
	public void init()
	{
		String fonts[]={"URW Chancery L","Caladea","Fixed"};	
		String sizes[]={"5","10","15","20","25","30"};
		cb1=new JComboBox(fonts);
		cb1.setBounds(70,30,150,20); 
		cb2=new JComboBox(sizes);
		cb2.setBounds(250,30,100,20); 
		c1=new JCheckBox("BOLD");
		c1.setBounds(60,80,80,20); 
		c2=new JCheckBox("ITALIC");
		c2.setBounds(160,80,80,20); 
		c3=new JCheckBox("UNDERLINE");
		c3.setBounds(260,80,80,20);
		tf=new JTextArea("");
		tf.setBounds(60,150,300,150);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		c1.addItemListener(this);
		c2.addItemListener(this); 
		c3.addItemListener(this);
		add(cb1);
		add(cb2);
		add(c1);
		add(c2);
		add(c3);
		add(tf);
		setLayout(null);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent e)
	{
		String font=(String)cb1.getSelectedItem();
		String siz=(String)cb2.getSelectedItem();
		int size=Integer.parseInt(siz);
		if(c1.isSelected())
		{
			Font f=new Font(font,Font.BOLD,size);
			tf.setFont(f);
		}
		if(c2.isSelected())
		{
			Font f=new Font(font,Font.ITALIC,size);
			tf.setFont(f);
		}
		if(c3.isSelected())
		{
			Font f=tf.getFont();
			Map att=f.getAttributes();
			att.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
			tf.setFont(f.deriveFont(att));
		}
	}
}
