import java.util.Scanner;
public class DicePart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dice = new Scanner(System.in);
		System.out.println("This program will simulate tossing a pair of dice.");
		System.out.print("How many times would you like the dice to be tossed?");
		int number = dice.nextInt();
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		int ten = 0;
		int eleven = 0;
		int twelve = 0;
		for(int i = 1; i <= number; i++) {
			int random = (int)(Math.random() * 11 + 2);
			System.out.print(random + " ");
			if (random == 2) {two++;}
			if (random == 3) {three++;}
			if (random == 4) {four++;}
			if (random == 5) {five++;}
			if (random == 6) {six++;}
			if (random == 7) {seven++;}
			if (random == 8) {eight++;}
			if (random == 9) {nine++;}
			if (random == 10) {ten++;}
			if (random == 11) {eleven++;}
			if (random == 12) {twelve++;}
		
		} 
		System.out.println();
		System.out.print("2: ");
		for (int a = 0; a < two; a++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("3: ");
		for (int b = 0; b < three; b++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("4: ");
		for (int c = 0; c < four; c++) {
			System.out.print("*");
		} 
		System.out.println();
		System.out.print("5: ");
		for(int d = 0; d < five; d++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("6: ");
		for(int e = 0; e < six; e++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("7: ");
		for(int f = 0; f < seven; f++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("8: ");
		for(int g = 0; g < eight; g++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("9: ");
		for(int h = 0; h < nine; h++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("10: ");
		for(int i = 0; i < ten; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("11: ");
		for(int j = 0; j < eleven; j++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("12: ");
		for(int k = 0; k < twelve; k++) {
			System.out.print("*");
		}
		}
	}


