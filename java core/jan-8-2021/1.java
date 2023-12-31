//AWT->Abstract Windows Toolkit
import java.awt.*;

class Test
{
public static void main(String arg[])
{
Frame f=new Frame("Welcome");

Button b=new Button("Click");
b.setBounds(50,100,180,70);

f.add(b);
f.setSize(300,300);//frame size 300 width and 300 height  
f.setLayout(null);//no layout manager  
f.setVisible(true);//now frame will be visible, by default not visible  
}
}

