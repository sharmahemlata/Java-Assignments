import java.lang.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import javax.swing.*;
import java.applet.*;
/*<applet code="one.class" height=250 width=435 /></applet>*/
public class one extends Applet implements ActionListener 
{
	JPanel p1,p2,p3;
	static int cnt=0,u=0,w1=0,flag=0,w2=0;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,start,wins;
	int [][]a=new int[3][3];
	public void init()
	{
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		b1=new JButton("     ");
		b2=new JButton("     ");
		b3=new JButton("     ");
		b4=new JButton("     ");
		b5=new JButton("     ");
		b6=new JButton("     ");
		b7=new JButton("     ");
		b8=new JButton("     ");
		b9=new JButton("     ");
		b10=new JButton("User 1 (X)");
		b11=new JButton("User 2 (0)");
		b12=new JButton("Ties");
		start=new JButton("Start");
		wins=new JButton("User _ Wins");
		setLayout(null);
		p1.setBounds(50,50,200,100);
		p2.setBounds(250,50,140,100);
		p3.setBounds(50,150,340,50);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		p1.add(b6);
		p1.add(b7);
		p1.add(b8);
		p1.add(b9);
		p3.add(b10);
		p3.add(b11);
		p3.add(b12);
		p2.add(start);
		p2.add(wins);
		add(p1);
		add(p2);
		add(p3);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				a[i][j]=0;
		}
		setForeground(Color.white);
		setBackground(Color.darkGray);
	}
	public void start()
	{
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		start.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{		
			if(cnt>=3&&cnt<=9)
			{
				if((b1.getText().equals("  X  ")&&b2.getText().equals("  X  ")&&b3.getText().equals("  X  "))||(b1.getText().equals("  X  ")&&b4.getText().equals("  X  ")&&b7.getText().equals("  X  "))||(b1.getText().equals("  X  ")&&b5.getText().equals("  X  ")&&b9.getText().equals("  X  "))||(b6.getText().equals("  X  ")&&b9.getText().equals("  X  ")&&b3.getText().equals("  X  "))||(b7.getText().equals("  X  ")&&b8.getText().equals("  X  ")&&b9.getText().equals("  X  "))||(b7.getText().equals("  X  ")&&b5.getText().equals("  X  ")&&b3.getText().equals("  X  "))||(b4.getText().equals("  X  ")&&b5.getText().equals("  X  ")&&b5.getText().equals("  X  ")))
				{
					wins.setText("User 1 Wins");
					flag=0;
					for(int i=0;i<3;i++)
					{
						for(int j=0;j<3;j++)
							a[i][j]=0;
					}
					b1.setText("     ");
					b2.setText("     ");
					b3.setText("     ");
					b4.setText("     ");
					b5.setText("     ");
					b6.setText("     ");
					b7.setText("     ");
					b8.setText("     ");
					b9.setText("     ");
					w1=1;
				}
				else if((b1.getText().equals("  0  ")&&b2.getText().equals("  0  ")&&b3.getText().equals("  0  "))||(b1.getText().equals("  0  ")&&b4.getText().equals("  0  ")&&b7.getText().equals("  0  "))||(b1.getText().equals("  0  ")&&b5.getText().equals("  0  ")&&b9.getText().equals("  0  "))||(b6.getText().equals("  0  ")&&b9.getText().equals("  0  ")&&b3.getText().equals("  0  "))||(b7.getText().equals("  0  ")&&b8.getText().equals("  0  ")&&b9.getText().equals("  0  "))||(b7.getText().equals("  0  ")&&b5.getText().equals("  0  ")&&b3.getText().equals("  0  "))||(b4.getText().equals("  0  ")&&b5.getText().equals("  0  ")&&b5.getText().equals("  0  ")))
				{
					wins.setText("User 2 Wins");
					flag=0;
					for(int i=0;i<3;i++)
					{
						for(int j=0;j<3;j++)
							a[i][j]=0;
					}
					b1.setText("     ");
					b2.setText("     ");
					b3.setText("     ");
					b4.setText("     ");
					b5.setText("     ");
					b6.setText("     ");
					b7.setText("     ");
					b8.setText("     ");
					b9.setText("     ");
					w2=1;
				}
				else
				{
					w1=0;
					w2=0;
				}
			}	
			if(cnt>=9&&w1==0&&w2==0)
			{
				JOptionPane.showMessageDialog(null,"IT'S A TIE .START THE GAME AGAIN .");
				flag=0;
				cnt=0;
				u=0;
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
						a[i][j]=0;
				}
				b1.setText("     ");
				b2.setText("     ");
				b3.setText("     ");
				b4.setText("     ");
				b5.setText("     ");
				b6.setText("     ");
				b7.setText("     ");
				b8.setText("     ");
				b9.setText("     ");
				w1=0;
				w2=0;
			}
			if(cnt<=9&&w1==0&&w2==0)
			{
				if(ae.getSource()==b1)
				{
					if(flag==0)
						JOptionPane.showMessageDialog(null,"START THE GAME FIRST");
					else
					{
						if(a[0][0]==1)
							JOptionPane.showMessageDialog(null,"ALREADY SELECTED");
						else if(a[0][0]==0)
						{
							if(u%2==0)
								b1.setText("  X  ");
							else if(u%2!=0)
								b1.setText("  0  ");
							u++;
							cnt++;
							a[0][0]=1;
						}
					}
				}
				if(ae.getSource()==b2)
				{
					if(flag==0)
						JOptionPane.showMessageDialog(null,"START THE GAME FIRST");
					else
					{
						if(a[0][1]==1)
							JOptionPane.showMessageDialog(null,"ALREADY SELECTED");
						else if(a[0][1]==0)
						{
							if(u%2==0)
								b2.setText("  X  ");
							else if(u%2!=0)
								b2.setText("  0  ");
							u++;
							cnt++;
							a[0][1]=1;
						}
					}
				}if(ae.getSource()==b3)
				{
					if(flag==0)
						JOptionPane.showMessageDialog(null,"START THE GAME FIRST");
					else
					{
						if(a[0][2]==1)
							JOptionPane.showMessageDialog(null,"ALREADY SELECTED");
						else if(a[0][2]==0)
						{
							if(u%2==0)
								b3.setText("  X  ");
							else if(u%2!=0)
								b3.setText("  0  ");
							u++;
							cnt++;
							a[0][2]=1;
						}
					}
				}if(ae.getSource()==b4)
				{
					if(flag==0)
						JOptionPane.showMessageDialog(null,"START THE GAME FIRST");
					else
					{
						if(a[1][0]==1)
							JOptionPane.showMessageDialog(null,"ALREADY SELECTED");
						else if(a[1][0]==0)
						{
							if(u%2==0)
								b4.setText("  X  ");
							else if(u%2!=0)
								b4.setText("  0  ");
							u++;
							cnt++;
							a[1][0]=1;
						}
					}
				}if(ae.getSource()==b5)
				{
					if(flag==0)
						JOptionPane.showMessageDialog(null,"START THE GAME FIRST");
					else
					{
						if(a[1][1]==1)
							JOptionPane.showMessageDialog(null,"ALREADY SELECTED");
						else if(a[1][1]==0)
						{
							if(u%2==0)
								b5.setText("  X  ");
							else if(u%2!=0)
								b5.setText("  0  ");
							u++;
							cnt++;
							a[1][1]=1;
						}
					}
				}if(ae.getSource()==b6)
				{
					if(flag==0)
						JOptionPane.showMessageDialog(null,"START THE GAME FIRST");
					else
					{
						if(a[1][2]==1)
							JOptionPane.showMessageDialog(null,"ALREADY SELECTED");
						else if(a[1][2]==0)
						{
							if(u%2==0)
								b6.setText("  X  ");
							else if(u%2!=0)
								b6.setText("  0  ");
							u++;
							cnt++;
							a[1][2]=1;
						}
					}
				}if(ae.getSource()==b7)
				{
					if(flag==0)
						JOptionPane.showMessageDialog(null,"START THE GAME FIRST");
					else
					{
						if(a[2][0]==1)
							JOptionPane.showMessageDialog(null,"ALREADY SELECTED");
						else if(a[2][0]==0)
						{
							if(u%2==0)
								b7.setText("  X  ");
							else if(u%2!=0)
								b7.setText("  0  ");
							u++;
							cnt++;
							a[2][0]=1;
						}
					}
				}if(ae.getSource()==b8)
				{
					if(flag==0)
						JOptionPane.showMessageDialog(null,"START THE GAME FIRST");
					else
					{
						if(a[2][1]==1)
							JOptionPane.showMessageDialog(null,"ALREADY SELECTED");
						else if(a[2][1]==0)
						{
							if(u%2==0)
								b8.setText("  X  ");
							else if(u%2!=0)
								b8.setText("  0  ");
							u++;
							cnt++;
							a[2][1]=1;
						}
					}
				}if(ae.getSource()==b9)
				{
					if(flag==0)
						JOptionPane.showMessageDialog(null,"START THE GAME FIRST");
					else
					{
						if(a[2][2]==1)
							JOptionPane.showMessageDialog(null,"ALREADY SELECTED");
						else if(a[2][2]==0)
						{
							if(u%2==0)
								b9.setText("  X  ");
							else if(u%2!=0)
								b9.setText("  0  ");
							u++;
							cnt++;
							a[2][2]=1;
						}
					}
				}
				if(ae.getSource()==start)
				{
					if(flag==1)
						JOptionPane.showMessageDialog(null,"GAME IS ALREADY STARTED");
					else
					{
						flag=1;
						for(int i=0;i<3;i++)
						{
							for(int j=0;j<3;j++)
								a[i][j]=0;
						}
						b1.setText("     ");
						b2.setText("     ");
						b3.setText("     ");
						b4.setText("     ");
						b5.setText("     ");
						b6.setText("     ");
						b7.setText("     ");
						b8.setText("     ");
						b9.setText("     ");
						cnt=0;
						u=0;
						w1=0;
						w2=0;
					}
				}
			}
		}
		catch(Exception e){}
	}
}
						










