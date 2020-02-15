package Joueur;

import De.DE;

import java.util.Scanner;

public class Joueur {

    private String pseudo;
    private int score;

    public Joueur(String pseudo){
        this.pseudo = pseudo;
        this.score = 0;
    }

    public String getPseudo(){
        return this.pseudo;
    }

    public int getScore() {
        return this.score;
    }
    public String toString(){
        return this.pseudo + " " + this.score;
    }

    public  void commencerPartie(){
        this.score = 0;
    }
    public  void lancer(DE d){
        d.lancer();
        this.score += d.getValeur();
    }
    public boolean isOut(){
        return this.score > 15;
    }

    public boolean won(){
        return this.score == 15;
    }

    public boolean keepGoing(Scanner sc){
        System.out.println("Voulez vous continuer à jouer ? 0 : Oui  / 1 : Non");
        int res = sc.nextInt();
        return res == 0;
    }


}
