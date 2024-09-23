package Project;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Graphics;

class HappySmiley extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200); 
        
        g.setColor(Color.RED);
        g.fillOval(100, 100, 20, 20); 
        g.fillOval(180, 100, 20, 20); 
        
        g.setColor(Color.BLACK);
        g.drawArc(110, 150, 80, 50, 0, -180); 
    }
}

class SadSmiley extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.GREEN);
        g.fillOval(50, 50, 200, 200); 
        
        g.setColor(Color.BLACK);
        g.fillOval(100, 100, 20, 20); 
        g.fillOval(180, 100, 20, 20); 
        
        g.setColor(Color.BLACK);
        g.drawArc(110, 150, 80, 50, 0, 180); 
    }
}

class AngrySmiley extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.RED);
        g.fillOval(50, 50, 200, 200); 
        
        g.setColor(Color.BLACK);
        g.fillOval(100, 100, 20, 20); 
        g.fillOval(180, 100, 20, 20); 

        g.drawLine(90, 90, 110, 80); 
        g.drawLine(190, 80, 210, 90); 

        g.drawArc(110, 150, 80, 50, 0, -180); 
    }
}

class CrySmiley extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200); 
        
        g.setColor(Color.BLACK);
        g.fillOval(100, 100, 20, 20); 
        g.fillOval(180, 100, 20, 20); 

        g.setColor(Color.WHITE);
        g.fillOval(95, 120, 15, 25); 
        g.fillOval(175, 120, 15, 25); 

        g.setColor(Color.BLACK);
        g.drawArc(110, 150, 80, 50, 180, -180); 
    }
}

public class Shapes {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(
            "Enter 1 for happy smiley\n" +
            "Enter 2 for sad smiley\n" +
            "Enter 3 for angry smiley\n" +
            "Enter 4 for cry smiley");
        
        int choice;
        try {
            choice = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number between 1 and 4.");
            return;
        }
        
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        
        if (choice == 1) {
            application.add(new HappySmiley());
        } else if (choice == 2) {
            application.add(new SadSmiley());
        } else if (choice == 3) {
            application.add(new AngrySmiley());
        } else if (choice == 4) {
            application.add(new CrySmiley());
        } else {
            JOptionPane.showMessageDialog(null, "Invalid choice. Please enter a number between 1 and 4.");
            return;
        }
        
        application.setSize(400, 400); 
        application.setVisible(true); 
    }
}
