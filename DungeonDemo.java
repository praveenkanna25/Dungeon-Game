package game.org;
package game.org;

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
		System.out.println("Enter the trigger position:");
		int tgr = sc.nextInt();
		int tgc = sc.nextInt();

		System.out.println("Enter the gold Position");
		int gdr = sc.nextInt();
		int gdc = sc.nextInt();
		char[][] game = new char[row + 1][col + 1];
		game[adr][adc] = 'A';
		game[mtr][mtc] = 'M';
		game[tgr][tgc] = 'A';
		game[gdr][gdc] = 'G';

		int adventurerow = -1;
		int adventurecol = -1;
		int monsterrow = -1;
		int monstercol = -1;
		int triggerrow = -1;
		int triggercol = -1;

		int goldrow = -1;
		int goldcol = -1;

		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[0].length; j++) {
				if (game[i][j] == 'A') {
					adventurerow = i;
					adventurecol = j;
				} else if (game[i][j] == 'G') {
					goldrow = i;
					goldcol = j;
				} else if (game[i][j] == 'M') {
					monsterrow = i;
					monstercol = j;

				} else if (game[i][j] == 'T') {
					triggerrow = i;
					triggercol = j;

				}

			}
		}
		int stepadventure = Math.abs(adr - gdr) + Math.abs(adc - gdc);
		int steptrigger = Math.abs(adr - tgr) + Math.abs(adc - tgc);
		int stepmonster = Math.abs(mtr - gdr) + Math.abs(mtc - gdc);

		System.out.println(stepadventure);
		System.out.println(steptrigger);
		System.out.println(stepmonster);

		if (stepmonster < stepadventure) {
			if (stepadventure < steptrigger) {

				System.out.println("Number of steps: " + (stepmonster + Math.abs(mtr - gdr) + Math.abs(mtc - gdc)));
			} else {

				System.out.println("Number of steps: " + (steptrigger + Math.abs(mtr - gdr) + Math.abs(mtc - gdc)));

			}
		} else {
			System.out.println("Adventure: Takes gold with minimum steps: " + stepadventure);

		}
	}
}
