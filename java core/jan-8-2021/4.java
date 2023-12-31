//swing
import javax.swing.*;
import java.awt.event.*;

class Test implements ActionListener
{
JTextField tf;
Test()
{
JFrame f=new JFrame("Welcome");

tf=new JTextField();
tf.setBounds(50,50,180,50);
JButton b=new JButton("Click");
b.setBounds(50,100,180,70);

f.add(tf);
f.add(b);

b.addActionListener(this);

f.setSize(300,300);//frame size 300 width and 300 height  
f.setLayout(null);//no layout manager  
f.setVisible(true);//now frame will be visible, by default not visible  

}
public void actionPerformed(ActionEvent ae)
{
String msg=tf.getText();
System.out.println("Value="+msg);
}

public static void main(String arg[])
{
Test t=new Test();
}
}

