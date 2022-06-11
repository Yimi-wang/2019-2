public class Grille {
    int [][]tableboat1;
    int [][]tableplay1;
    int [][]tableboat2;
    int [][]tableplay2;
    int nbLigneGrille;
    int nbColonneGrille;
    int score1;
    int score2;
    int nbboat1=0;
    int nbboat2=0;
    int player=1;

    public Grille(int nbLignes, int nbColonnes){
        tableboat1=new int [nbLignes][nbColonnes];
        tableplay1=new  int [nbLignes][nbColonnes];
        tableboat2=new int [nbLignes][nbColonnes];
        tableplay2=new  int [nbLignes][nbColonnes];
        nbLigneGrille = nbLignes;
        nbColonneGrille = nbColonnes;
        for (int i=0; i<nbLignes;i++){
            for(int j =0; j<nbColonnes;j++){
                tableboat1[i][j]=0;
                tableplay1[i][j]=0;
                tableboat2[i][j]=0;
                tableplay2[i][j]=0;
            }
        }
    }

    void metboat1(int l, int c){
        tableboat1[l][c]=1;
        nbboat1++;
    }
    void metboat2(int l, int c){
        tableboat2[l][c]=1;
        nbboat2++;
    }
    void attackplayer1(int l, int c){
        if (tableboat2[l][c]==1){
            //如果击中就是1，没有击中就是2
            tableplay1[l][c]=1;
            tableboat2[l][c]=2;//这里变成2是为了在对方玩家信息里告诉那里被攻击了
            score1++;
        }else{
            tableplay1[l][c]=2;
        }
    }
    void attackplayer2(int l, int c){
        if (tableboat1[l][c]==1){
            //如果击中就是1，没有击中就是2
            tableplay2[l][c]=1;
            tableboat1[l][c]=2;//同上
            score2++;
        }else{
            tableplay2[l][c]=2;
        }
    }

    int gettableboat1(int l, int c){
        if(l>=0&&l<10&&c>=0&&c<10)
            return tableboat1[l][c];
        else
            return 0;

    }

    int gettableboat2(int l, int c){
        return tableboat2[l][c];
    }

    int gettableplayer1(int l, int c){
        return tableplay1[l][c];
    }

    int gettableplayer2(int l, int c){
        return tableplay2[l][c];
    }

    int getPlayer(){
        return player;
    }
    void changePlayer(){
        player=player+1;
        if (player==3)player=1;
    }

}
