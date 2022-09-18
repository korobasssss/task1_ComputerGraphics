package cs.vsu.ruKorobeynikova_A_V;

import javax.swing.*;

public class Main {

    public static void openMainWindow() {
        MainWindow mainWindow = new MainWindow();
        mainWindow.setTitle("Task1");
        mainWindow.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        mainWindow.setSize(800, 800);
        mainWindow.setVisible(true);
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setResizable(false);
    }

    public static void main(String[] args) {
        openMainWindow();
    }
}
