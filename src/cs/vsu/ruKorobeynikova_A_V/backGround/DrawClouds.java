package cs.vsu.ruKorobeynikova_A_V.backGround;

import java.awt.*;


public class DrawClouds {
    private int x;
    private int y;

    public DrawClouds(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void paint(Graphics2D g2) {
        Color c = new Color(250, 250, 250);
        g2.setColor(c);
        g2.fillOval(40 + x, 40 + y, 20, 20);
        g2.fillOval(55 + x, 30 + y, 25, 25);
        g2.fillOval(75 + x, 35 + y, 23, 23);
        g2.fillOval(95 + x, 45 + y, 15, 15);
        g2.fillOval(80 + x, 50 + y, 23, 23);
        g2.fillOval(53 + x, 48 + y, 30, 30);
    }
//public class DrawClouds extends JPanel {
//    private int x0;
//
//    public DrawClouds(int x0) {
//        this.x0 = x0;
//    }
//
//    public void drawClouds(Graphics2D g2, int height) {
//        Color c = new Color(250, 250, 250);
//        g2.setColor(c);
//
//        firstCloud(g2);
//        secondCloud(g2);
//        thirdCloud(g2);
//        fourthCloud(g2);
//        fifthCloud(g2);
//    }
//    public void firstCloud(Graphics2D g2) {
//        g2.fillOval(40 + x0, 40, 20, 20);
//        g2.fillOval(55 + x0, 30, 25, 25);
//        g2.fillOval(75 + x0, 35, 23, 23);
//        g2.fillOval(95 + x0, 45, 15, 15);
//        g2.fillOval(80 + x0, 50, 23, 23);
//        g2.fillOval(53 + x0, 48, 30, 30);
//    }
//
//    public void secondCloud(Graphics2D g2) {
//        g2.fillOval(40 + x0 + 200, 40 + 80, 20, 20);
//        g2.fillOval(55 + x0 + 200, 30 + 80, 25, 25);
//        g2.fillOval(75 + x0 + 200, 35 + 80, 23, 23);
//        g2.fillOval(95 + x0 + 200, 45 + 80, 15, 15);
//        g2.fillOval(80 + x0 + 200, 50 + 80, 23, 23);
//        g2.fillOval(53 + x0 + 200, 48 + 80, 30, 30);
//    }
//
//    public void thirdCloud(Graphics2D g2) {
//        g2.fillOval(40 + x0 + 650, 40 + 200, 20, 20);
//        g2.fillOval(55 + x0 + 650, 30 + 200, 25, 25);
//        g2.fillOval(75 + x0 + 650, 35 + 200, 23, 23);
//        g2.fillOval(95 + x0 + 650, 45 + 200, 15, 15);
//        g2.fillOval(80 + x0 + 650, 50 + 200, 23, 23);
//        g2.fillOval(53 + x0 + 650, 48 + 200, 30, 30);
//    }
//
//    public void fourthCloud(Graphics2D g2) {
//        g2.fillOval(40 + x0 + 400, 40 + 150, 20, 20);
//        g2.fillOval(55 + x0 + 400, 30 + 150, 25, 25);
//        g2.fillOval(75 + x0 + 400, 35 + 150, 23, 23);
//        g2.fillOval(95 + x0 + 400, 45 + 150, 15, 15);
//        g2.fillOval(80 + x0 + 400, 50 + 150, 23, 23);
//        g2.fillOval(53 + x0 + 400, 48 + 150, 30, 30);
//    }
//
//    public void fifthCloud(Graphics2D g2) {
//        g2.fillOval(40 + x0 - 100, 40 + 150, 20, 20);
//        g2.fillOval(55 + x0 - 100, 30 + 150, 25, 25);
//        g2.fillOval(75 + x0 - 100, 35 + 150, 23, 23);
//        g2.fillOval(95 + x0 - 100, 45 + 150, 15, 15);
//        g2.fillOval(80 + x0 - 100, 50 + 150, 23, 23);
//        g2.fillOval(53 + x0 - 100, 48 + 150, 30, 30);
//    }
//
//    public int getX() {
//        return x0;
//    }
//
//    public void setX(int x) {
//        x0 = x;
//    }
}
