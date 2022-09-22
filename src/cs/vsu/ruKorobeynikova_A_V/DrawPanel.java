package cs.vsu.ruKorobeynikova_A_V;

import cs.vsu.ruKorobeynikova_A_V.backGround.DrawBackground;
import cs.vsu.ruKorobeynikova_A_V.backGround.DrawClouds;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private final DrawClouds clouds;
    Timer timer;

    public DrawPanel() {
        clouds = new DrawClouds(0);
        //анимация облаков по таймеру
        timer = new Timer(50, e -> {
            System.out.println(clouds.getX());
            if (clouds.getX() == 0) clouds.setX(-getWidth());
            clouds.setX(clouds.getX() + 1);
            repaint();
        });
    }
    private void drawSky(Graphics2D g2) {
        Color c1 = new Color(134, 239, 237);
        Color c2 = new Color(231, 253, 253);
        g2.setPaint(new LinearGradientPaint(0, 0, 0, getHeight(),
                new float[]{0.1f, 0.45f},
                new Color[]{c1, c2}));
        g2.fillRect(0, 0, getWidth(),getHeight());
    }

    @Override
    public void paint(Graphics g) {
        timer.start();
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;

        //рисуем небо
        drawSky(g2);

        //облака
        clouds.drawClouds(g2, getHeight());

        //рисуем оставшийся задний фон
        DrawBackground db = new DrawBackground();
        db.draw(g2);

        //рисуем кроша
        DrawCrosh dc = new DrawCrosh();
        dc.draw(g2);
    }
}


