import java.awt.*;
import java.awt.event.*;

public class Loginpage extends Frame {
      TextField name, pass;
     Loginpage()
      {
           setLayout(new FlowLayout());
           this.setLayout(null);
           Label p=new Label("Name:",Label.CENTER);
           Label p=new Label("password",Label.CENTER);
           name=new TextField(20);
           pass=new TextField(20);
           pass.setEchoChar('*');
           b1=new Button("submit");
           b2=mew Buttom("cancel");
           this.add(n);
           this.add(name);
           this.add(p)};
           this.add(pass);
           this.add(b1);
           this.add(b2);
           n.setBounds(70,100,90,80);
           p.setBounds(70,140,90,60);
           name.setBounds(400,200,80,50);
           pass.setBounds(400,240,80,30);
           b1.setBounds(150,200,80,50);
           b2.setBounds(250,200,80,50);
            addWindowListener(new WindowAdapter()
           {
            public voud windowClosing(WindowEvent e )
            {
                system.exit(0);
             }
       });
       public static void main(string args[])
       {
            Loginpage ml=new Loginpage();
            ml.setVisible(true);
            ml.setSize(600,600);
            ml.setTitle("SVVV login window");
             }
    }         