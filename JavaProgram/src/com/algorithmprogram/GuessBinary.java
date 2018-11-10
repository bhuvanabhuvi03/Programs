package com.algorithmprogram;

import java.util.Scanner;

public class GuessBinary {
	static Scanner s = new Scanner(System.in);

	public static void find(int a[]) {
		int low = 0;
		int high = a.length;
		int mid = (low + high) / 2;
		int ch;
		// System.out.println("1.lesser than"+a[(low+high)/2]+"\n 2.greater than
		// "+a[(low+high)/2]+"\n3.quess number is"+a[(low+high)/2]);
		int flag = 1;
		// System.out.println("enter the choice");
		// ch=s.nextInt();
		boolean b = false;
		do {
			/*
			 * ask the user this is your guess number or not
			 */
			while (flag != 0) {
				System.out.println("1.lesser than" + a[(low + high) / 2] + "\n 2.greater than " + a[(low + high) / 2]
						+ "\n3. i think ur guess number is" + a[(low + high) / 2]);
				System.out.println("enter the choice");
				ch = s.nextInt();
				if (ch == 1) {
					System.out.println("ss");
					high = ((low + high) / 2);
					System.out.println(a[high]);
				} else if (ch == 2) {
					low = (low + high) / 2;
				}
//		if(a[high]==a[low]) {
				// System.out.println("quess number is"+a[(low+high)/2]);
				// flag--;
				// break;
				// }
				else if (ch == 3) {
					System.out.println(" this is  ur guess number is" + a[(low + high) / 2]);
					flag--;
					break;
				}
			}
			if (flag == 0) {
				// System.out.println("searched element is"+a[(low+high)/2]);
				b = true;
				break;
			}
		} while (b != false);
	}
}
