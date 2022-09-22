package cs.vsu.ruKorobeynikova_A_V.foreGround;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class DrawRightHand {
    private int y;

    public void drawRHand (Graphics2D g2) {
        g2.setStroke(new BasicStroke(5F));
        Color c1 = new Color(143, 235, 246);
        Color c2 = new Color(35, 143, 166);
        g2.setColor(c1);
        GeneralPath gp = new GeneralPath();
        gp.moveTo(480, 485);
        gp.curveTo(480, 485, 540, 480, 545, 540 + 3 * y);
        gp.curveTo(550, 540 + 3 * y, 527, 580 + 5 * y, 505, 550 + 3 * y);
        gp.curveTo(505, 550 + 3 * y, 505, 520 + 2 * y, 480, 502 + y);
        gp.curveTo(480, 502 + y, 465, 487, 480, 485);
        g2.fill(gp);
        g2.setColor(c2);
        g2.draw(gp);
    }

    public int getY() {
        return y;
    }


    public void setY(int y0) {
        y = y0;
    }

}
