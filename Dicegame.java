import java.util.Scanner;
import java.util.Random;
public class Dicegame{

	public static void main(String args[]){
		int bid;
		int playerbudget=10;
	    int pcbudget=10;
		Dicegame player= new Dicegame();
		Dicegame pc = new Dicegame();
		System.out.println("remaining player budget:"+ playerbudget +";remaining pcbudget:" + pcbudget );
		boolean set= true;
		while(set==true){
			int pcroll= pc.play();
			int playerroll= player.play(); 

			System.out.print("Input bid value:");
			Scanner sc = new Scanner(System.in);
			bid= sc.nextInt();
			if(pcroll>playerroll){
				pcbudget= pcbudget+bid;
				playerbudget= playerbudget-bid;
				System.out.println("remaining player budget:"+ playerbudget +";remaining pcbudget:" + pcbudget );
			}
			else if(pcroll<playerroll){
				pcbudget= pcbudget-bid;
				playerbudget= playerbudget+bid;
				System.out.println("remaining player budget:"+ playerbudget +";remaining pcbudget:" + pcbudget );
			}
			if(playerbudget<=0 || pcbudget<=0 || bid<0){
				System.out.print("game over");
				set = false;
			}
	}
}

public int play(){

	int randint=0;
	randint=(new Random()).nextInt(7);
	return randint;
	}
}
