import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdapteurSouris1 extends MouseAdapter {
    Grille grille;
    VueGrille1 v1;
    JLabel info;

    public AdapteurSouris1(Grille g, VueGrille1 v, JLabel jl) {
        grille = g;
        v1 = v;
        info = jl;
    }

    public void mousePressed(MouseEvent e) {
        //如果是玩家1该操作
        if (grille.getPlayer() == 1) {
            //如果船的数量少于6
            if (grille.nbboat1 < 6) {
                int l = (e.getX() - v1.largeurCase / 2) / v1.largeurCase;
                int c = (e.getY() - v1.hauteurCase / 2) / v1.hauteurCase;
                info.setText("点击的是" + l + " " + c);
                if (l < 10 && l >= 0 && c < 10 & c >= 0) {
                    switch (grille.nbboat1) {
                        case 0:
                            grille.metboat1(l, c);
                            v1.repaint();
                            break;
                        case 1:
                            if (grille.gettableboat1(l - 1, c) == 1 || grille.gettableboat1(l + 1, c) == 1 || grille.gettableboat1(l, c - 1) == 1 || grille.gettableboat1(l, c + 1) == 1) {
                                grille.metboat1(l, c);
                                v1.repaint();
                            } else {
                                info.setText("这里不能放船");
                            }
                            break;
                        case 2:
                            grille.metboat1(l,c);
                            v1.repaint();
                            break;
                        case 3:
                            if (grille.gettableboat1(l - 1, c) == 1 || grille.gettableboat1(l + 1, c) == 1 || grille.gettableboat1(l, c - 1) == 1 || grille.gettableboat1(l, c + 1) == 1) {
                                grille.metboat1(l, c);
                                v1.repaint();
                            } else {
                                info.setText("这里不能放船");
                            }
                            break;
                        case 4:
                            if(grille.gettableboat1(l - 1, c) == 1&&grille.gettableboat1(l-2,c)==1){
                                grille.metboat1(l, c);
                                v1.repaint();
                            } else if (grille.gettableboat1(l + 1, c) == 1&&grille.gettableboat1(l+2,c)==1) {
                                grille.metboat1(l, c);
                                v1.repaint();
                            }else if (grille.gettableboat1(l , c-1) == 1&&grille.gettableboat1(l,c-2)==1){
                                grille.metboat1(l, c);
                                v1.repaint();
                            }else if (grille.gettableboat1(l , c+1) == 1&&grille.gettableboat1(l,c+2)==1){
                                grille.metboat1(l, c);
                                v1.repaint();
                            }else{
                                info.setText("这里不能放船");
                            }
                            break;
                        case 5:
                            if(grille.gettableboat1(l - 1, c) == 1&&grille.gettableboat1(l-2,c)==1){
                                grille.metboat1(l, c);
                                v1.repaint();
                            } else if (grille.gettableboat1(l + 1, c) == 1&&grille.gettableboat1(l+2,c)==1) {
                                grille.metboat1(l, c);
                                v1.repaint();
                            }else if (grille.gettableboat1(l , c-1) == 1&&grille.gettableboat1(l,c-2)==1){
                                grille.metboat1(l, c);
                                v1.repaint();
                            }else if (grille.gettableboat1(l , c+1) == 1&&grille.gettableboat1(l,c+2)==1){
                                grille.metboat1(l, c);
                                v1.repaint();
                            }else{
                                info.setText("这里不能放船");
                            }
                            break;

                    }


                }
            }


        }


    }

}
