package cs.vsu.ruKorobeynikova_A_V.backGround;

import cs.vsu.ruKorobeynikova_A_V.DrawPanel;

import javax.swing.*;
import java.awt.*;

public class DrawClouds extends JPanel {
    private int x0;

    public DrawClouds(int x0) {
        this.x0 = x0;
    }

    public void drawClouds(Graphics2D g2, int height) {
        Color c = new Color(250, 250, 250);
        g2.setColor(c);

        int kx = x0;
        int ky = 0;
        int upOrDownCloud = 0;
        while (ky < height / 3) {
            if (kx >= 800) {
                kx = x0;
                ky += 100;
                upOrDownCloud = 0;
            }
            if (upOrDownCloud == 0) {
                ky += 10;
                g2.fillOval(40 + kx, 40 + ky, 20, 20);
                g2.fillOval(55 + kx, 30 + ky, 25, 25);
                g2.fillOval(75 +kx, 35 + ky, 23, 23);
                g2.fillOval(95 + kx, 45 + ky, 15, 15);
                g2.fillOval(80 + kx, 50 + ky, 23, 23);
                g2.fillOval(53 + kx, 48 + ky, 30, 30);
                ky -= 10;
                upOrDownCloud = 1;
            } else {
                ky -= 10;
                g2.fillOval(40 + kx, 40 + ky, 20, 20);
                g2.fillOval(55 + kx, 30 + ky, 25, 25);
                g2.fillOval(75 + kx, 35 + ky, 23, 23);
                g2.fillOval(95 + kx, 45 + ky, 15, 15);
                g2.fillOval(80 + kx, 50 + ky, 23, 23);
                g2.fillOval(53 + kx, 48 + ky, 30, 30);
                ky += 10;
                upOrDownCloud = 0;
            }
            kx += 100;
        }
    }
    public int getX() {
        return x0;
    }

    public void setX(int x) {
        x0 = x;
    }
}
