/**
 * 
 * Purpose : Binary conversion
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  24-10-2018
 *
 ********************************************************************/
import java.util.Scanner;
/*
 * here using scanner class properties
 */

public class BinaryConv {
	/*
	 * main method for convert the decimal to binary
	 */

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int dec;//initialize the  decimal
		System.out.println("enter the dec number");
		dec=s.nextInt();//getting the input user
		//call the method
		boolean b=false;
		while(b==false) {
			if(dec<=255)
			{	Conversion.binary(dec);
			b=true;
			break;
			}
			System.out.println("enter only minimum 8 bit not more range is 0 to 255  ");
			
			dec=s.nextInt();
		}
		s.close();
	}

}
