package cs.vsu.ruKorobeynikova_A_V.foreGround;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;

public class DrawCrosh {
    Color c1 = new Color(143, 235, 246);
    Color c2 = new Color(35, 143, 166);
    Color c3 = new Color(245, 110, 139);
    Color c4 = new Color(45, 102, 148);
    Color c5 = new Color(239, 89, 69, 255);


    private void drawBody(Graphics2D g2) {
        g2.setColor(c1);
        g2.fillOval(265, 300, 250, 250);
        g2.setColor(c2);
        g2.setStroke(new BasicStroke(5F));
        g2.drawOval(265, 300, 250, 250);
    }

    private void drawHandsAndFeetAndEars(Graphics2D g2) {
        GeneralPath gp = new GeneralPath();
        g2.setColor(c1);

        //рука левая
        gp.moveTo(263, 420);
        gp.curveTo(265, 420, 215, 430, 210, 480);
        gp.curveTo(210, 480, 220, 510, 250, 490);
        gp.curveTo(250, 490, 260, 470, 267, 455);
        gp.curveTo(267, 455, 267, 450, 265, 420);

        //нога правая
        gp.moveTo(395, 550);
        gp.curveTo(395, 550, 385, 560, 395, 575);
        gp.curveTo(395, 575, 420, 585, 465, 585);
        gp.curveTo(465, 585, 480, 575, 460, 560);
        gp.curveTo(460, 560, 440, 547, 426, 543);
        gp.curveTo(420, 547, 410, 548, 395, 550);

        //нога левая
        gp.moveTo(380, 548);
        gp.curveTo(380, 548, 390, 560, 380, 575);
        gp.curveTo(380, 575, 340, 585, 320, 585);
        gp.curveTo(320, 585, 305, 575, 315, 565);
        gp.curveTo(315, 565, 325, 555, 345, 542);
        gp.curveTo(345, 542, 365, 547, 380, 548);

        //правое ухо
        gp.moveTo(430, 305);
        gp.curveTo(430, 305, 470, 200, 520, 130);
        gp.curveTo(520, 130, 585, 100, 580, 170);
        gp.curveTo(580, 170, 576, 200, 455, 316);

        //левое ухо
        gp.moveTo(430 - 30, 305 - 5);
        gp.curveTo(430 - 30, 305 - 5, 470 - 70, 200 - 10, 520 - 100, 130 - 5);
        gp.curveTo(520 - 100, 130 - 5, 585 - 95, 100 - 30, 580 - 90, 170 - 20);
        gp.curveTo(580 - 90, 170 - 20, 576 - 90, 200 - 10, 455 - 25, 316 - 10);

        g2.fill(gp);
        g2.setColor(c2);
        g2.draw(gp);
        gp.closePath();
    }

    private void drawEyesAndNose(Graphics2D g2) {
        //рисуем глаза и зрачки
        AffineTransform old = g2.getTransform();
        g2.rotate(0.5, 360, 320);
        g2.setColor(Color.white);
        g2.fillOval(360, 320, 63, 75);
        g2.setColor(c2);
        g2.drawOval(360, 320, 63, 75);
        g2.setColor(Color.black);
        g2.fillOval(400, 347, 17, 22);
        g2.setTransform(old);
        g2.rotate(0.4, 420, 330);
        g2.setColor(Color.white);
        g2.fillOval(420, 330, 70, 85);
        g2.setColor(c2);
        g2.drawOval(420, 330, 70, 85);
        g2.setColor(Color.black);
        g2.fillOval(426, 371, 17, 22);
        g2.setTransform(old);

        //рисуем нос
        g2.setColor(c5);
        g2.fillOval(377, 393, 29, 27);

        //брови
        g2.setColor(c4);
        g2.rotate(0.4f, 360, 300);
        g2.setStroke(new BasicStroke(12F));
        g2.drawArc(375, 285, 20, 10, 30, 140);
        g2.drawArc(430, 270, 20, 10, 30, 140);
        g2.setTransform(old);
        g2.setStroke(new BasicStroke(5F));
    }

    private void drawMouth(Graphics2D g2) {
        //полоска снизу носа
        g2.setColor(c2);
        g2.drawLine(383, 419, 377, 435);
        g2.setStroke(new BasicStroke(3F));

        //"рот"
        g2.setColor(c2);
        GeneralPath gp = new GeneralPath();
        gp.moveTo(330, 430);
        gp.curveTo(330, 430, 377, 430, 430, 475);
        gp.curveTo(430, 475, 415, 480, 405, 485);
        g2.setColor(c3);
        g2.fill(gp);
        g2.setColor(c2);
        gp.closePath();
        g2.draw(gp);

        //зубы
        AffineTransform old = g2.getTransform();
        g2.rotate(0.4f);
        g2.setColor(Color.white);
        g2.fillRect(500, 260, 38, 38);
        g2.setColor(c2);
        g2.drawRect(500, 260, 38, 38);
        g2.drawLine(519, 264, 519, 296);
        g2.setTransform(old);

    }

    public void draw(Graphics2D g2) {
        //рисуем тело
        drawBody(g2);

        //рисуем руки и ноги
        drawHandsAndFeetAndEars(g2);

        //рисуем глаза, нос
        drawEyesAndNose(g2);

        //рисуем рот и область между носом и ртом
        drawMouth(g2);
    }
}
