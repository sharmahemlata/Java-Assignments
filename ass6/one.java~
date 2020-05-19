import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




class one implements ActionListener
{


	JFrame f1;
	JButton b1;
	ButtonGroup bg;
	JRadioButton r1,r2,r3;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1;	
	String str;

	one() 	
	{
	f1 = new JFrame("Number Converter");
	b1 = new JButton("GO");
//	l2 = new JLabel("Enter Binary Number");
	b1.addActionListener(this);
	f1.setSize(600,600);
	f1.setVisible(true);
	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f1.setLayout(null);
	r1 = new JRadioButton("Hexadecimal");
	r2 = new JRadioButton("Decimal");
	r3 = new JRadioButton("Octal");
	bg = new ButtonGroup();
	//t1 = new JTextField();
	l1 = new JLabel();
	bg.add(r1);
	bg.add(r2);
	bg.add(r3);
	r1.setBounds(100,100,150,10);
	r2.setBounds(100,140,100,10);
	r3.setBounds(100,180,100,10);
	//t1.setBounds(230,250,200,30);
	//l2.setBounds(60,250,150,40);
	b1.setBounds(180,300,150,30);
	l1.setBounds(100,350,300,40);
	//f1.add(t1);
	f1.add(r1);
	f1.add(r2);
	f1.add(r3);
	f1.add(b1);
	f1.add(l1);
//	f1.add(l2);
	}
	
	public void actionPerformed(ActionEvent aie)
	{
	int a[] = {0,1,2,4};
	String input,seg,oct,sum;
	char arr[];
	int i,j,k,m,n,c,dec,isbinary=0;
	if(aie.getSource()==b1)
	{
		input = JOptionPane.showInputDialog(this,"Enter the binary no");
		n = Integer.parseInt(input); 
		if(r1.isSelected())//hexadecimal
		{
		String hexstr="";
		char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		dec=0;
		i=0;
		n = Integer.parseInt(input);
		int rem;
		while(n!=0)
		{
		rem = n%10;
		n/=10;
		dec+=rem*Math.pow(2,i);
		++i;
		}
		while(dec>0)
		{
		rem = dec%16;
		hexstr = hexstr+hex[rem];
		dec = dec/16;
		}
		l1.setText(hexstr);						
		}
		if(r2.isSelected())//decimal
		{
		dec=0;
		i=0;
		n = Integer.parseInt(input);
		int rem;
		while(n!=0)
		{
		rem = n%10;
		n/=10;
		dec+=rem*Math.pow(2,i);
		++i;
		}
		l1.setText(Integer.toString(dec));	
		}


		if(r3.isSelected())//octal
		{
		dec=0;
		i=0;
		n = Integer.parseInt(input);
		int rem,octalnum=0;
		while(n!=0)
		{
		rem = n%10;
		n/=10;
		dec+=rem*Math.pow(2,i);
		++i;
		}
		i=1;
		rem=0;
		while(dec!=0)
		{
		rem+=dec%8;
		octalnum = octalnum+(rem*1);
		dec=dec/8;
		i=i*10;
		}
		l1.setText(Integer.toString(octalnum));		
		}
	}

	}
	
	public static void main(String ss[])
	{
	new one();	
	}

}
