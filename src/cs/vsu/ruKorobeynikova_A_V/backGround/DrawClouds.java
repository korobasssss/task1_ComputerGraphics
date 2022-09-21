package cs.vsu.ruKorobeynikova_A_V.backGround;

import java.awt.*;

public class DrawClouds {
    public static void drawClouds(Graphics2D g2, int x0, int y0) {
        Color c = new Color(250, 250, 250);
        g2.setColor(c);

        int kx = x0;
        int ky = y0;
        for (int i = 0; i <= 13; i++) {
            if (i == 7) {
                kx = x0;
                ky = 100;
            }
            if (i % 2 == 0) {
                ky += 10;
                g2.fillOval(40 + kx, 40 + ky, 20, 20);
                g2.fillOval(55 + kx, 30 + ky, 25, 25);
                g2.fillOval(75 +kx, 35 + ky, 23, 23);
                g2.fillOval(95 + kx, 45 + ky, 15, 15);
                g2.fillOval(80 + kx, 50 + ky, 23, 23);
                g2.fillOval(53 + kx, 48 + ky, 30, 30);
                ky -= 10;
            } else {
                ky -= 10;
                g2.fillOval(40 + kx, 40 + ky, 20, 20);
                g2.fillOval(55 + kx, 30 + ky, 25, 25);
                g2.fillOval(75 +kx, 35 + ky, 23, 23);
                g2.fillOval(95 + kx, 45 + ky, 15, 15);
                g2.fillOval(80 + kx, 50 + ky, 23, 23);
                g2.fillOval(53 + kx, 48 + ky, 30, 30);
                ky += 10;
            }
            kx += 100;
        }
    }
}
