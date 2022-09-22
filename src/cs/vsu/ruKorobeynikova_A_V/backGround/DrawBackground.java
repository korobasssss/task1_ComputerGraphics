package cs.vsu.ruKorobeynikova_A_V.backGround;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

public class DrawBackground extends JPanel {

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

    public void draw(Graphics2D g2) {
        //рисуем "землю"
        drawCurve(g2);
    }
}
