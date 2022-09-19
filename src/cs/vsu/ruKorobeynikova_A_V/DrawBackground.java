package cs.vsu.ruKorobeynikova_A_V;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

public class DrawBackground extends JPanel {

    private void drawSky(Graphics2D g2) {
        Color c1 = new Color(117, 239, 236);
        g2.setPaint(new LinearGradientPaint(0, 0, 0, getHeight(),
                new float[]{0.1f, 0.6f},
                new Color[]{c1, Color.WHITE}));
        g2.fillRect(0, 0, getWidth(),getHeight());
    }

    private void drawCurve(Graphics2D g2) {
        Color c1 = new Color(240, 234, 127);
        Color c2 = new Color(182, 174, 22);
        GeneralPath gp = new GeneralPath();
        gp.moveTo(0, 350);
        gp.curveTo(0, 350, 0, 350, 250, 330);
        gp.curveTo(250, 330, 350, 360, 480, 350);
        gp.curveTo(480, 350, 520, 340, 550, 349);
        gp.curveTo(550, 349, 650, 360, 800, 350);
        g2.setColor(c1);
        gp.curveTo(800, 450, 800, 60, 800,800);
        gp.curveTo(800, 800, 500, 800, 0, 800);
        gp.curveTo(0, 800, 0, 600, 0, 350);

        g2.fill(gp);

        g2.setColor(c2);
        gp.moveTo(0, 350);
        gp.curveTo(0, 350, 0, 350, 250, 330);
        gp.curveTo(250, 330, 350, 360, 480, 350);
        gp.curveTo(480, 350, 520, 340, 550, 349);
        gp.curveTo(550, 349, 650, 360, 800, 350);

        g2.draw(gp);
    }

    private void drawClouds(Graphics2D g2) {
        Color c = new Color(250, 250, 250);
        g2.setColor(c);

        int kx = 0;
        int ky = 0;
        for (int i = 0; i <= 13; i++) {
            if (i == 7) {
                kx = 0;
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

    public void draw(Graphics2D g2) {
        //рисуем небо
        //drawSky(g2);

        //рисуем "землю"
        drawCurve(g2);

        //рисуем облака
        drawClouds(g2);
    }
}
