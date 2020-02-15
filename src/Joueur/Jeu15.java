package Joueur;

import De.DE;
import java.util.ArrayList;
import java.util.Scanner;

public class Jeu15 {
        private Scanner sc = new Scanner(System.in);
        private ArrayList<Joueur> players;
        private DE lede;

        public Jeu15(ArrayList<Joueur> players){
            this.players = players;
            this.lede = new DE();

        }
        public ArrayList<Joueur> getPlayers(){
            return this.players;
        }
        public void faireJouerUnePartie(Joueur j) {

            do {
                j.lancer(lede);
                System.out.println(j.toString());

            }while(!j.won() && !j.isOut() && j.keepGoing(sc));

        }

        public void jouerUnePartie(){
            for (Joueur player : players) {
                faireJouerUnePartie(player);
            }

        }
        public ArrayList<Joueur> max(ArrayList<Joueur> j){
            int max = 0;
            ArrayList<Joueur> res = new ArrayList<Joueur>();
            for (Joueur player : j){
                if (player.getScore() > max){
                    max = player.getScore();
                }
            }
            for (Joueur player : j){
                if (player.getScore() == 0){
                    res.add(player);
                }
            }
            return res;


        }
        public ArrayList<Joueur> lesGagnants(){

            ArrayList<Joueur> winner = new ArrayList<Joueur>();
            for (Joueur j : players){
                if (players.contains(j.getScore() == 15)){
                    if(j.getScore() == 15){
                        winner.add(j);
                    }
                }
                else{
                    for (Joueur js : max(players)){
                        winner.add(js);
                    }

                }
            }

            return winner;
        }
}
