
public class Conversion {
	/**
	 * 
	 * @param decimalnumber
	 */
public static void binary(int decimalnumber) {
	
		
		int a=decimalnumber;
		//to concantenate the values
		String binarynumber="";
		/*
		 * 
		 * using while loop
		 * iterate upto num!=0
		 * 
		 */
		while(decimalnumber!=0)
		{
			int dec=decimalnumber%2;
			binarynumber=dec+binarynumber;
			decimalnumber=decimalnumber/2;
		}
		//to print the binary value for decimal number
		System.out.println("the binary value of "+a+" is ("+binarynumber+")2");
		/*
		 * function call
		 * to print the nibble values for given binary 
		 * 
		 */
		for (int i = binarynumber.length(); i < 8; i++) {
			binarynumber="0"+binarynumber;
		}
		System.out.println(binarynumber);
		nibbles(binarynumber);
	}
	/**
	 * 
	 * @param brinaynumber binary value in string 
	 */
	static void nibbles(String brinaynumber)
	{
		String nibble="";
		char c[]=brinaynumber.toCharArray();
		// mid value to swap the binary value for nibble calculation 
		int mid=c.length/2;
		for(int i=mid;i<c.length;i++)
		{
			nibble=nibble+c[i];
		}
		for(int i=0;i<mid;i++)
		{
			nibble=nibble+c[i];
		}
		System.out.println("the nibble value is "+nibble);
		char ch[]=nibble.toCharArray();
		// to convert string into integer 

		//to count the digits of number
		int count=nibble.length(),j=0,sum=0,i=nibble.length()-1;int num;
		while(count!=0)
		{
			if(ch[i]==0)
				num=(int)ch[i]-47;
			else
				num=(int)ch[i]-48;
			j++;
			int dec=1;
			/*
			 * if loop for only rem=1 
			 * j used as power 
			 */
			if(num==1)
			{
				for(int k=0;k<j-1;k++)
				{
					dec=dec*2;
					
				}
				// sum to calculate the value
				sum=sum+dec;
				
			}
			i--;
			count--;
		}
		// to print the results
		System.out.println(sum);
	}
	}