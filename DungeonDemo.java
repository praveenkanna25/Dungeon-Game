package game.org;
package game.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DungeonDemo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row and column:");
		int row = sc.nextInt();
		int col = sc.nextInt();
		System.out.println("Enter the Adventure Position");
		int adr = sc.nextInt();
		int adc = sc.nextInt();
		System.out.println("Enter the gold Position");
		int gdr = sc.nextInt();
		int gdc = sc.nextInt();
		System.out.println("Enter The Number of Pits");
		int countPits=sc.nextInt();
		int a=1;
		int[][] pits=new int[countPits][2];
		while(countPits>0) {
			System.out.println("Enter the pits "+ a+" row and column");
			  pits[a - 1][0] = sc.nextInt();
	            pits[a - 1][1] = sc.nextInt();
			a++;
			countPits--;
		}
		
		char[][] game = new char[row + 1][col + 1];
        game[adr][adc] = 'A';
        game[gdr][gdc] = 'G';

        for (int k = 0; k < pits.length; k++) {
            game[pits[k][0]][pits[k][1]] = 'P';
        }

		int adventurerow = adr;
		int adventurecol = adc;
		int pitrow=-1;
		int pitcol=-1;
		int goldrow = gdr;
		int goldcol = gdc;

		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[0].length; j++) {
				
				  if (game[i][j] == 'P') {
					pitrow = i;
					pitcol = j;
				}

				}
			}
		
		  int stepadventure = Math.abs(adr - gdr) + Math.abs(adc - gdc);

	        if (Math.abs(adventurerow - pitrow) <= 1 && Math.abs(adventurecol - pitcol) <= 1) {
	            System.out.println("No Possible  Solution.");
	        } else {
	            System.out.println("Minimum number of steps: " + stepadventure);
	        }
	    }
	}
