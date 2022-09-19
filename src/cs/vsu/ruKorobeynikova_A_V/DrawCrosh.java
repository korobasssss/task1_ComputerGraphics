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
        //рука правая
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

        //рука левая
        g2.setColor(c1);
        GeneralPath gp1 = new GeneralPath();
        gp1.moveTo(263, 420);
        gp1.curveTo(265, 420, 215, 430, 210, 480);
        gp1.curveTo(210, 480, 220, 510, 250, 490);
        gp1.curveTo(250, 490, 260, 470, 267, 455);
        gp1.curveTo(267, 455, 267, 450, 265, 420);
        g2.fill(gp1);
        g2.setColor(c2);
        gp1.curveTo(265, 420, 215, 430, 210, 480);
        gp1.curveTo(210, 480, 220, 510, 247, 490);
        gp1.curveTo(250, 490, 260, 470, 267, 455);
        gp1.curveTo(267, 455, 267, 450, 265, 420);
        gp1.moveTo(210, 482);
        gp1.lineTo(227, 469);
        gp1.moveTo(227, 495);
        gp1.lineTo(237, 480);
        g2.draw(gp1);
        //нога левая
        GeneralPath gp2 = new GeneralPath();
        g2.setColor(c2);
        g2.drawOval();
//        gp2.moveTo(263, 420);
//        gp2.curveTo(265, 420, 215, 430, 210, 480);
//        gp2.curveTo(210, 480, 220, 510, 250, 490);
//        gp2.curveTo(250, 490, 260, 470, 267, 455);
//        gp2.curveTo(267, 455, 267, 450, 265, 420);
//        g2.fill(gp2);
//        g2.setColor(c2);
//        gp2.curveTo(265, 420, 215, 430, 210, 480);
//        gp2.curveTo(210, 480, 220, 510, 247, 490);
//        gp2.curveTo(250, 490, 260, 470, 267, 455);
//        gp2.curveTo(267, 455, 267, 450, 265, 420);
//        gp2.moveTo(210, 482);
//        gp2.lineTo(227, 469);
//        gp2.moveTo(227, 495);
//        gp2.lineTo(237, 480);
//        g2.draw(gp2);
    }

    public void draw(Graphics2D g2) {
        //рисуем тело
        drawBody(g2);

        //рисуем руки и ноги
        drawHandsAndFeet(g2);
    }
}
