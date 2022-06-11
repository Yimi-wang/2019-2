import javax.swing.*;
public class Examen implements Runnable {
    JFrame creerFenetre(String title) {
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        return frame;
    }
    public void run() {
        JFrame [] frames;
        frames = new JFrame[2];
        frames[0] = creerFenetre("Joueur 1" );
        frames[1] = creerFenetre("Joueur 2" );
        MonApplication monApplication = new MonApplication();
        monApplication.demarre(frames, 10);
        frames[0].setVisible(true);
        frames[1].setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Examen());
    }
}