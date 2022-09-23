package cs.vsu.ruKorobeynikova_A_V;

import cs.vsu.ruKorobeynikova_A_V.backGround.DrawBackground;
import cs.vsu.ruKorobeynikova_A_V.backGround.DrawClouds;
import cs.vsu.ruKorobeynikova_A_V.foreGround.DrawCrosh;
import cs.vsu.ruKorobeynikova_A_V.foreGround.DrawRightHand;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private final DrawRightHand hand = new DrawRightHand();

    Timer timerForClouds;
    Timer timerForHand;

    DrawClouds firstCloud = new DrawClouds(0, 200);
    DrawClouds secondCloud = new DrawClouds(100, 40);
    DrawClouds thirdCloud = new DrawClouds(200, 50);
    DrawClouds fourthCloud = new DrawClouds(500, 120);
    DrawClouds fifthsCloud = new DrawClouds(705, 200);

    public DrawPanel() {
        //анимация облаков по таймеру
        timerForClouds = new Timer(10, e -> {
            if(firstCloud.getX() >= 800) {
                secondCloud.setX(-100);
            } else if (secondCloud.getX() >= 800){
                firstCloud.setX(-100);
            } else if (thirdCloud.getX() >= 800) {
                thirdCloud.setX(-100);
            } else if (fourthCloud.getX() >= 800) {
                fourthCloud.setX(-100);
            } else if (fifthsCloud.getX() > 800) {
                fifthsCloud.setX(-100);
            }

            firstCloud.setX(firstCloud.getX() + 1);
            secondCloud.setX(secondCloud.getX() + 1);
            thirdCloud.setX(thirdCloud.getX() + 1);
            fourthCloud.setX(fourthCloud.getX() + 1);
            fifthsCloud.setX(fifthsCloud.getX() + 1);

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
        firstCloud.paint(g2);
        secondCloud.paint(g2);
        thirdCloud.paint(g2);
        fourthCloud.paint(g2);
        fifthsCloud.paint(g2);

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


