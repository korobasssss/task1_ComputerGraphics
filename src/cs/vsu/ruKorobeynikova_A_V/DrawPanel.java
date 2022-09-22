package cs.vsu.ruKorobeynikova_A_V;

import cs.vsu.ruKorobeynikova_A_V.backGround.DrawBackground;
import cs.vsu.ruKorobeynikova_A_V.backGround.DrawClouds;
import cs.vsu.ruKorobeynikova_A_V.foreGround.DrawCrosh;
import cs.vsu.ruKorobeynikova_A_V.foreGround.DrawRightHand;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private final DrawClouds clouds = new DrawClouds(0);
    private final DrawRightHand hand = new DrawRightHand();
    Timer timerForClouds;
    Timer timerForHand;

    public DrawPanel() {
        //анимация облаков по таймеру
        timerForClouds = new Timer(100, e -> {
            if (clouds.getX() == 0) clouds.setX(-1000);
            clouds.setX(clouds.getX() + 1);
            repaint();
        });

        //анимация руки по таймеру
        timerForHand = new Timer(2000, e -> {
            if (hand.getY() == 0) {
                hand.setY(-50);
            }
            else hand.setY(0);
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
        timerForClouds.start();
        timerForHand.start();

        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

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

        //рисуем анимированную руку
        hand.drawRHand(g2);

        //добавляем слова
        g2.setColor(Color.BLACK);
        g2.setFont(g.getFont().deriveFont(20f));
        if (hand.getY() == -50) g2.drawString("HELLO EVERYONE", 550, 400);
    }
}


