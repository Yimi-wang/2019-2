import javax.swing.*;
import java.awt.*;

public class VueGrille1 extends JComponent {
    Graphics2D drawable;
    int largeur;
    int hauteur;

    Grille grille;
    int largeurCase;
    int hauteurCase;

    public VueGrille1(Grille g) {
        grille = g;
    }

    @Override
    public void paintComponent(Graphics g){
        drawable=(Graphics2D) g;
        largeur=getSize().width;
        hauteur=getSize().height;
        drawable.clearRect(0, 0, largeur, hauteur);
        tracerGrille();
        tracerJeu();


    }

    public void tracerGrille() {
        largeurCase = largeur / 22;
        hauteurCase = hauteur / 11;

        //画正方形才需要。
//        largeurCase = Math.min(largeurCase, hauteurCase);
//        hauteurCase = largeurCase;

        int i, j;
        int x;
        int y;
        int tailleColonnes = hauteurCase * 10;
        int tailleLignes = largeurCase * 10;

        for (i = 0; i <= 21; i++) {

            x = i * largeurCase+largeurCase/2;
            drawable.drawLine(x, hauteurCase/2, x, tailleColonnes+hauteurCase/2);
        }

        for (j = 0; j <= 10; j++) {
            y = j * hauteurCase+hauteurCase/2;
            drawable.drawLine(largeurCase/2, y, tailleLignes+largeurCase/2, y);
            drawable.drawLine(largeurCase/2+11*largeurCase, y, tailleLignes*2+largeurCase+largeurCase/2, y);
        }

    }

    public void tracerJeu(){
        for(int i = 0; i <10; i++){
            for (int j = 0; j < 10;  j++){
                if (grille.tableboat1[i][j]==1)
                    drawable.drawRect(i*largeurCase+largeurCase/2+10,j*hauteurCase+hauteurCase/2+10,largeurCase-20,hauteurCase-20);
                else if(grille.tableboat1[i][j]==2) {
                    drawable.drawLine(i*largeurCase+largeurCase/2,(j+1)*hauteurCase+hauteurCase/2,(i+1)*largeurCase+largeurCase/2,j*hauteurCase+hauteurCase/2);
                    drawable.drawLine(i*largeurCase+largeurCase/2,j*hauteurCase+hauteurCase/2,(i+1)*largeurCase+largeurCase/2,(j+1)*hauteurCase+hauteurCase/2);
                }


                if (grille.tableboat2[i][j]==1)
                    drawable.drawRect(i*largeurCase+largeurCase/2+10,j*hauteurCase+hauteurCase/2+10,largeurCase-20,hauteurCase-20);
                else if(grille.tableboat2[i][j]==2) {
                    drawable.drawLine(i*largeurCase+largeurCase/2,(j+1)*hauteurCase+hauteurCase/2,(i+1)*largeurCase+largeurCase/2,j*hauteurCase+hauteurCase/2);
                    drawable.drawLine(i*largeurCase+largeurCase/2,j*hauteurCase+hauteurCase/2,(i+1)*largeurCase+largeurCase/2,(j+1)*hauteurCase+hauteurCase/2);
                }


                if(grille.tableplay1[i][j]==1)
                    drawable.drawRect((i+11)*largeurCase+largeurCase/2+10,j*hauteurCase+hauteurCase/2+10,largeurCase-20,hauteurCase-20);
                else if(grille.tableplay1[i][j]==2){
                    drawable.drawLine((i+11)*largeurCase+largeurCase/2,(j+1)*hauteurCase+hauteurCase/2,(i+12)*largeurCase+largeurCase/2,j*hauteurCase+hauteurCase/2);
                    drawable.drawLine((i+11)*largeurCase+largeurCase/2,j*hauteurCase+hauteurCase/2,(i+12)*largeurCase+largeurCase/2,(j+1)*hauteurCase+hauteurCase/2);
                }

            }
        }



    }


}
