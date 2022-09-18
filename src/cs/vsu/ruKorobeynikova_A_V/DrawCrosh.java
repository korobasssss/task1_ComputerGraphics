package cs.vsu.ruKorobeynikova_A_V;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class DrawCrosh {
    Color c1 = new Color(150, 243, 242);
    Color c2 = new Color(29, 145, 144);

    private void drawBody(Graphics2D g2) {
        g2.setColor(c1);
        g2.fillOval(265, 300, 250, 250);
        g2.setColor(c2);
        g2.setStroke(new BasicStroke(4.6F));
        g2.drawOval(265, 300, 250, 250);
    }

    private void drawHandsAndFeet(Graphics2D g2) {
        //g2.fillOval(480, 485, 10, 10);
        //g2.drawArc(425, 490, 130, 130, 0, 90);
        g2.setColor(c1);
        GeneralPath gp = new GeneralPath();
        gp.moveTo(480, 485);
        gp.curveTo(480, 485, 540, 480, 545, 540);
        gp.curveTo(550, 540, 527, 580, 505, 550);
        gp.curveTo(505, 550, 505, 520, 480, 502);
        gp.curveTo(480, 502, 465, 487, 480, 485);
        gp.closePath();
        g2.fill(gp);
        g2.setColor(c2);
        gp.moveTo(480, 485);
        gp.curveTo(480, 485, 540, 480, 545, 540);
        gp.curveTo(550, 540, 527, 580, 505, 550);
        gp.curveTo(505, 550, 505, 520, 480, 502);
        gp.curveTo(480, 502, 465, 487, 480, 485);
        gp.moveTo(542, 549);
        gp.lineTo(530, 532);
        gp.moveTo(527, 556);
        gp.lineTo(517, 542);
        g2.draw(gp);
    }

    public void draw(Graphics2D g2) {
        //рисуем тело
        drawBody(g2);

        //рисуем руки и ноги
        drawHandsAndFeet(g2);
    }
}
