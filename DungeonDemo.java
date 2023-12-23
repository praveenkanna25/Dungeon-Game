package game.org;

import java.util.Scanner;

public class DungeonDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and column:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		System.out.println("Enter the Adventure Position");
		 int adr=sc.nextInt();
		 int adc=sc.nextInt();
		System.out.println("Enter the gold Position");
		int gdr=sc.nextInt();
		int gdc=sc.nextInt();
		char[][] game = new char[row+1][col+1];
		game[adr][adc] = 'A';
		game[gdr][gdc] = 'G';
		
		int adventurerow=-1;
		int adventurecol=-1;
		int goldrow=-1;
		int goldcol=-1;
		
		for(int i=0;i<game.length;i++) {
			for(int j=0;j<game[0].length;j++) {
				  if (game[i][j] == 'A') {
	                    adventurerow = i;
	                    adventurecol = j;
	                } else if (game[i][j] == 'G') {
	                    goldrow = i;
	                    goldcol = j;
	                }
				  
				  
			}
		}
		int step = Math.abs(adventurerow-goldrow) + Math.abs(adventurecol-goldcol);

	      
        System.out.println("step to reach:" + step);
				
	}


}
