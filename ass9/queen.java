import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class queen extends JFrame implements ActionListener
{
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,clear;
	int k,count,count1;
	int b[][];
	int i,j;
	queen()
	{
		clear=new JButton("Clear");
		b0=new JButton("");
		b1=new JButton("");
		b2=new JButton("");
		b3=new JButton("");
		b4=new JButton("");
		b5=new JButton("");
		b6=new JButton("");
		b7=new JButton("");
		b8=new JButton("");
		b9=new JButton("");
		b10=new JButton("");
		b11=new JButton("");
		b12=new JButton("");
		b13=new JButton("");
		b14=new JButton("");
		b15=new JButton("");
		clear.setBounds(30,40,280,30);
		b0.setBounds(40,100,50,40);
		b0.setBackground(Color.gray);
		b1.setBounds(110,100,50,40);
		b1.setBackground(Color.white);
		b2.setBounds(180,100,50,40);
		b2.setBackground(Color.gray);
		b3.setBounds(250,100,50,40);
		b3.setBackground(Color.white);
		b4.setBounds(40,150,50,40);
		b4.setBackground(Color.white);
		b5.setBounds(110,150,50,40);
		b5.setBackground(Color.gray);
		b6.setBounds(180,150,50,40);
		b6.setBackground(Color.white);
		b7.setBounds(250,150,50,40);
		b7.setBackground(Color.gray);
		b8.setBounds(40,200,50,40);
		b8.setBackground(Color.gray);
		b9.setBounds(110,200,50,40);
		b9.setBackground(Color.white);
		b10.setBounds(180,200,50,40);
		b10.setBackground(Color.gray);
		b11.setBounds(250,200,50,40);
		b11.setBackground(Color.white);
		b12.setBounds(40,250,50,40);
		b12.setBackground(Color.white);
		b13.setBounds(110,250,50,40);
		b13.setBackground(Color.gray);
		b14.setBounds(180,250,50,40);
		b14.setBackground(Color.white);
		b15.setBounds(250,250,50,40);
		b15.setBackground(Color.gray);
		b=new int[4][4];
		add(clear);
		add(b0);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(b12);
		add(b13);
		add(b14);
		add(b15);
		
		clear.addActionListener(this);
		b0.addActionListener(this);
                b1.addActionListener(this);
		b2.addActionListener(this);
                b3.addActionListener(this);
                b4.addActionListener(this);
                b5.addActionListener(this);
		b6.addActionListener(this);
                b7.addActionListener(this);
                b8.addActionListener(this);
                b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
                b12.addActionListener(this);
		b13.addActionListener(this);
                b14.addActionListener(this);
                b15.addActionListener(this);
		setLayout(null);
               	setTitle("Queens Puzzle");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,500);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b0)
		{
			k++;
			b0.setText("Q");
		}
		if(ae.getSource()==b1)
		{
			count++;
			k++;
			b1.setText("Q");
		}
		if(ae.getSource()==b2)
		{	
			count1++;
			k++;
			b2.setText("Q");
		}
		if(ae.getSource()==b3)
		{
			k++;
			b3.setText("Q");
		}
		if(ae.getSource()==b4)
		{
			count1++;
			k++;
			b4.setText("Q");
		}
		if(ae.getSource()==b5)
		{
			k++;
			b5.setText("Q");
		}
		if(ae.getSource()==b6)
		{
			k++;
			b6.setText("Q");
		}
		if(ae.getSource()==b7)
		{
			count++;
			k++;
			b7.setText("Q");
		}
		if(ae.getSource()==b8)
		{
			count++;
			k++;
			b8.setText("Q");
		}
		if(ae.getSource()==b9)
		{
			k++;
			b9.setText("Q");
		}
		if(ae.getSource()==b10)
		{	
			k++;
			b10.setText("Q");
		}
		if(ae.getSource()==b11)
		{
			count1++;
			k++;
			b11.setText("Q");
		}
		if(ae.getSource()==b12)
		{
			k++;
			b12.setText("Q");
		}
		if(ae.getSource()==b13)
		{
			count1++;
			k++;
			b13.setText("Q");
		}
		if(ae.getSource()==b14)
		{
			count++;
			k++;
			b14.setText("Q");
		}
		if(ae.getSource()==b15)
		{
			k++;
			b15.setText("Q");
		}
		if(ae.getSource()==clear)
		{
			k=0;
			count1=0;
			count=0;
			b0.setText("");
			b1.setText("");
			b2.setText("");
			b3.setText("");
			b4.setText("");
			b5.setText("");
			b6.setText("");
			b7.setText("");
			b8.setText("");
			b9.setText("");
			b10.setText("");
			b11.setText("");
			b12.setText("");
			b13.setText("");
			b14.setText("");
			b15.setText("");
		}
		if(k==4)
		{
			if(count1!=4&&count!=4)
			{
				JOptionPane.showMessageDialog(null,"You Loose");
			}
			if(count==4)
			{
				JOptionPane.showMessageDialog(null,"You Win");
				b[0][0]=b[0][2]=b[0][3]=b[1][0]=b[1][1]=b[1][2]=b[2][1]=b[2][2]=b[2][3]=b[3][0]=b[3][1]=b[3][3]=0;
				b[0][1]=b[1][3]=b[2][0]=b[3][2]=1;
				for(i=0;i<4;i++)
				{
					System.out.print("\n");
					for(j=0;j<4;j++)
					{
						System.out.print(b[i][j]);
					}
				}
			}
			if(count1==4)
			{
				JOptionPane.showMessageDialog(null,"You Win");
				b[0][0]=b[0][1]=b[0][3]=b[1][1]=b[1][2]=b[1][3]=b[2][0]=b[2][1]=b[2][2]=b[3][0]=b[3][2]=b[3][3]=0;
				b[0][2]=b[1][0]=b[2][3]=b[3][1]=1;
				for(i=0;i<4;i++)
				{
					System.out.print("\n");
					for(j=0;j<4;j++)
					{
						System.out.print(b[i][j]);
					}
				}
			}
		}
	}
	public static void main(String[] args)
	{
		new queen();
	}
}
				
