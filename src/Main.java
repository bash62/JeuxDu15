import De.*;
import Joueur.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Combien de joueurs ?");
        Scanner sc = new Scanner(System.in);
        ArrayList<Joueur> players = new ArrayList<Joueur>();
        int a = sc.nextInt();
        for (int i =0; i < a; i++){

            System.out.println("Nom du joueurs n° "+ i +" ?");
            String nomJoueur = sc.next();
            Joueur j = new Joueur(nomJoueur);
            players.add(j);

        }
        sc.close();


        Jeu15 p1 = new Jeu15(players);





    }
}
