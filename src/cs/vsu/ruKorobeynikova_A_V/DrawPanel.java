package cs.vsu.ruKorobeynikova_A_V;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;
import java.awt.geom.Path2D;

public class DrawPanel extends JPanel {

    public DrawPanel() {
    }

//    private void drawSky(Graphics2D g2) {
//        Color c1 = new Color(134, 239, 237);
//        Color c2 = new Color(231, 253, 253);
//        g2.setPaint(new LinearGradientPaint(0, 0, 0, getHeight(),
//                new float[]{0.1f, 0.45f},
//                new Color[]{c1, c2}));
//        g2.fillRect(0, 0, getWidth(),getHeight());
//    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;

        //рисуем небо
        //drawSky(g2);

        //рисуем задний фон
        DrawBackground db = new DrawBackground();
        db.draw(g2);

        //рисуем кроша
        DrawCrosh dc = new DrawCrosh();
        dc.draw(g2);

    }
}


