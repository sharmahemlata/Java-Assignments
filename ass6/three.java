import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class three implements ActionListener
{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bdiv,bmul,bdt,beq,back,clr;
	JTextField T;
	JFrame J;
	int f1=0;
	static double a=0,b=0,c=0;
	static int ch=0;
	Font fnt = new Font("ArialBlack",Font.BOLD,20);
	three()
	{
		J = new JFrame("CALCULATOR");
		J.setSize(400,320);
		J.setBounds(300,200,400,320);
		J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		J.setLayout(null);
		T = new JTextField();
		T.setBounds(10,20,370,50);
		T.setFont(fnt);
		J.add(T);
		back = new JButton("BACK");
		back.setBounds(10,80,180,30);
		back.addActionListener(this);
		J.add(back);
		clr = new JButton("CLEAR");
		clr.setBounds(200,80,180,30);
		clr.addActionListener(this);
		J.add(clr);
		b9 = new JButton("9");
		b9.setBounds(10,120,90,30);
		b9.addActionListener(this);
		J.add(b9);
		b8 = new JButton("8");
		b8.setBounds(110,120,90,30);
		b8.addActionListener(this);
		J.add(b8);
		b7 = new JButton("7");
		b7.setBounds(210,120,90,30);
		b7.addActionListener(this);
		J.add(b7);
		badd = new JButton("+");
		badd.setBounds(310,120,70,30);
		J.add(badd);
		badd.addActionListener(this);
		b6 = new JButton("6");
		b6.setBounds(10,160,90,30);
		b6.addActionListener(this);
		J.add(b6);
		b5 = new JButton("5");
		b5.setBounds(110,160,90,30);
		b5.addActionListener(this);
		J.add(b5);
		b4 = new JButton("4");
		b4.setBounds(210,160,90,30);
		b4.addActionListener(this);
		J.add(b4);
		bsub = new JButton("-");
		bsub.setBounds(310,160,70,30);
		J.add(bsub);
		bsub.addActionListener(this);
		b3 = new JButton("3");
		b3.setBounds(10,200,90,30);
		b3.addActionListener(this);
		J.add(b3);
		b2 = new JButton("2");
		b2.setBounds(110,200,90,30);
		b2.addActionListener(this);
		J.add(b2);
		b1 = new JButton("1");
		b1.setBounds(210,200,90,30);
		b1.addActionListener(this);
		J.add(b1);
		bmul = new JButton("*");
		bmul.setBounds(310,200,70,30);
		J.add(bmul);
		bmul.addActionListener(this);
		bdt = new JButton(".");
		bdt.setBounds(10,240,90,30);
		bdt.addActionListener(this);
		J.add(bdt);
		b0 = new JButton("0");
		b0.setBounds(110,240,90,30);
		b0.addActionListener(this);
		J.add(b0);
		beq = new JButton("=");
		beq.setBounds(210,240,90,30);
		beq.addActionListener(this);
		J.add(beq);
		bdiv = new JButton("/");
		bdiv.setBounds(310,240,70,30);
		J.add(bdiv);
		bdiv.addActionListener(this);
		J.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
			T.setText(T.getText().concat("1"));
		if(ae.getSource()==b2)
			T.setText(T.getText().concat("2"));
		if(ae.getSource()==b3)
			T.setText(T.getText().concat("3"));
		if(ae.getSource()==b4)
			T.setText(T.getText().concat("4"));
		if(ae.getSource()==b5)
			T.setText(T.getText().concat("5"));
		if(ae.getSource()==b6)
			T.setText(T.getText().concat("6"));
		if(ae.getSource()==b7)
			T.setText(T.getText().concat("7"));
		if(ae.getSource()==b8)
			T.setText(T.getText().concat("8"));
		if(ae.getSource()==b9)
			T.setText(T.getText().concat("9"));
		if(ae.getSource()==b0)
			T.setText(T.getText().concat("0"));
		if(ae.getSource()==bdt)
			T.setText(T.getText().concat("."));
		if(ae.getSource()==clr)
			T.setText("");

		if(ae.getSource()==badd)
		{
		if(T.getText().equals(""))
		{
		JOptionPane.showMessageDialog(J,"Please enter a number first","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else
		{
			a = Double.parseDouble(T.getText());			
			T.setText("");
			ch=1;
		}
		}
		if(ae.getSource()==bsub)
		{
		if(T.getText().equals(""))
                {
                JOptionPane.showMessageDialog(J,"Please enter a number first","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                else
                {

			a = Double.parseDouble(T.getText());
			T.setText("");
			ch=2;
		}
		}
		if(ae.getSource()==bmul)
		{
		if(T.getText().equals(""))
                {
                JOptionPane.showMessageDialog(J,"Please enter a number first","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                else
                {

			a = Double.parseDouble(T.getText());
			T.setText("");
			ch=3;
		}
		}
		if(ae.getSource()==bdiv)
		if(T.getText().equals(""))
                {
                JOptionPane.showMessageDialog(J,"Please enter a number first","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                else
                {

		{
			a = Double.parseDouble(T.getText());
			T.setText("");
			ch=4;
		}

		try
		{
			if(ae.getSource()==back)
			{
				if(T.getText().length() == 1)
					T.setText("");
				else
					T.setText(T.getText().substring(0,T.getText().length()-1));
			}
	
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(J,"!! CANNOT BACKSPACE MORE !!","ALERT",JOptionPane.WARNING_MESSAGE);
		}
		}
		if(ae.getSource()==beq)
		{
			try
			{
				switch(ch)
				{
					case 1: b = Double.parseDouble(T.getText());
							c = a + b;
							T.setText("ADDITION: "+c);
							f1=1;
							break;
					case 2: b = Double.parseDouble(T.getText());
							c = a - b;
							T.setText("SUBTRACTION: "+c);
							f1=1;
							break;
					case 3: b = Double.parseDouble(T.getText());
							c = a * b;
							T.setText("MULTIPLICATION: "+c);
							f1=1;
							break;
					case 4: b = Double.parseDouble(T.getText());
							if(b==0)
							{
								JOptionPane.showMessageDialog(J,"CANNOT DIVIDE BY 0","ERROR",JOptionPane.ERROR_MESSAGE);
								break;
							}
							c = a / b;
							T.setText("DIVISION: "+c);
							f1=1;
							break;
					default: c=0;
								T.setText(""+c);
				}
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(J,""+e,"ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
		
		
	}
	public static void main(String []args)
	{
		new three();
	}
}
