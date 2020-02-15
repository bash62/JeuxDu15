package De;

import java.util.Random;

public class DE {
    private static Random rd = new Random();
    private int valeur;

    public DE(){
        this.valeur = -1;
    }
    public DE(int valeur){
        this.valeur = valeur;
    }

    public int getValeur(){

        return this.valeur;
    }

    public int getValeurCachee(){
        int valeurCachee = -1;
        if (this.valeur != -1){
            valeurCachee = 7 - this.valeur;
        }
        return valeurCachee;
    }

    public void lancer(){
        this.valeur = rd.nextInt(6)+1;

    }

}
