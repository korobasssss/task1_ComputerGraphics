package cs.vsu.ruKorobeynikova_A_V;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() throws HeadlessException {
        DrawPanel drawPanel = new DrawPanel();
        this.add(drawPanel);
    }
}
