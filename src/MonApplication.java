import javax.swing.*;
import java.awt.*;

public class MonApplication {
    Grille grille;
    static JFrame [] f;


    public void demarre(JFrame[] frames, int nb){
        f = new JFrame[2];
        f = frames;
        grille = new Grille(nb,nb);
        VueGrille1 v1 = new VueGrille1(grille);


        Box barreHorizontale = Box.createVerticalBox();
        JLabel Information = new JLabel("Information");
        barreHorizontale.add(Information);

        v1.addMouseListener(new AdapteurSouris1(grille, v1,Information));
        frames[0].add(v1);
        frames[0].add(barreHorizontale, BorderLayout.SOUTH);


    }

}
