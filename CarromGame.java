import javax.swing.*;
import java.awt.*;

public class CarromBoard extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Background
        g2.setColor(new Color(10, 90, 90));
        g2.fillRect(0, 0, 600, 600);

        // Board
        g2.setColor(new Color(205, 170, 125));
        g2.fillRoundRect(50, 50, 500, 500, 30, 30);

        // Inner border
        g2.setColor(new Color(160, 120, 80));
        g2.drawRoundRect(70, 70, 460, 460, 20, 20);

        // Pockets
        g2.setColor(Color.BLACK);
        g2.fillOval(45, 45, 40, 40);
        g2.fillOval(515, 45, 40, 40);
        g2.fillOval(45, 515, 40, 40);
        g2.fillOval(515, 515, 40, 40);

        // Center circle
        g2.setColor(Color.RED);
        g2.fillOval(280, 280, 40, 40);

        g2.setColor(Color.BLACK);
        g2.drawOval(250, 250, 100, 100);

        // Guide lines
        g2.drawLine(300, 120, 300, 480);
        g2.drawLine(120, 300, 480, 300);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Carrom Board");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new CarromBoard());
        frame.setVisible(true);
    }
}

