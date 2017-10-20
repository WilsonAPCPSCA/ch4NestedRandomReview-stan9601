import java.util.Scanner;
public class Coinflip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner coin = new Scanner(System.in);
		System.out.println("This program will simulate flipping a fair coin.");
		System.out.println();
		System.out.print("How many times would you like the coin to be flipped?");
		int heads = 0;
		int tails = 0;
		int number = coin.nextInt();
		for(int i = 1; i <= number; i++) {
			int random = (int)(Math.round(Math.random()));
			if(random == 0) {
				System.out.print("H");
				heads++;
			}else{
				System.out.print("T");
				tails++;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("There were " + heads + " heads" + " and " + tails + " tails.");
	}

}
