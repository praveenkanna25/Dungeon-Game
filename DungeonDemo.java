package game.org;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DungeonDemo {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the row and column:");
	        int row = sc.nextInt();
	        int col = sc.nextInt();
	        System.out.println("Enter the Adventure Position");
	        int adr = sc.nextInt();
	        int adc = sc.nextInt();
	        System.out.println("Enter the Monster position:");
	        int mtr = sc.nextInt();
	        int mtc = sc.nextInt();
	        System.out.println("Enter the gold Position");
	        int gdr = sc.nextInt();
	        int gdc = sc.nextInt();
	        char[][] game = new char[row + 1][col + 1];
	        game[adr][adc] = 'A';
	        game[mtr][mtc] = 'M';
	        game[gdr][gdc] = 'G';

	        int adventurerow = -1;
	        int adventurecol = -1;
	        int monsterrow = -1;
	        int monstercol = -1;
	        int goldrow = -1;
	        int goldcol = -1;

	        List<String> adventurerPath = new ArrayList<>();

	        for (int i = 0; i < game.length; i++) {
	            for (int j = 0; j < game[0].length; j++) {
	                if (game[i][j] == 'A') {
	                    adventurerPath.add("(" + i + "," + j + ")");
	                    adventurerow = i;
	                    adventurecol = j;
	                } else if (game[i][j] == 'G') {
	                    goldrow = i;
	                    goldcol = j;
	                } else if (game[i][j] == 'M') {
	                    monsterrow = i;
	                    monstercol = j;
	                }
	            }
	        }

	        System.out.println("Adventurer's Path:");
	        for (String position : adventurerPath) {
	            System.out.println(position);
	        }

	        int stepadventure = Math.abs(adventurerow - goldrow) + Math.abs(adventurecol - goldcol);
	        int stepmonster = Math.abs(monsterrow - goldrow) + Math.abs(monstercol - goldcol);

	        if (stepmonster < stepadventure) {
	            System.out.println("No Possible solution");
	        } else
	            System.out.println("Step to reach: " + stepadventure);
	    }
	
}
