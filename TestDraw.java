package Chapter8;

import javax.swing.JFrame;
public class TestDraw {
     public static void main(String[] args)
     {
         DrawPanel1 panel = new DrawPanel1();      
         JFrame app = new JFrame();
      
         app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         app.add(panel);
         app.setSize(300, 300);
         app.setVisible(true);
     }
}
