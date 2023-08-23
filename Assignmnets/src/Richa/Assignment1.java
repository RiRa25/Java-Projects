package Richa;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size1, size2, choice, i, temp=1, a=1;
		String s1, s2, con, rev, middle, mono;
		char first, last;
		rev = "";
		
		System.out.println("Enter a sentence : ");
		s1 = sc.nextLine();
		
		size1 = s1.length();
		
		while(a == 1)
		{
		System.out.println("0.Exit the program");
		System.out.println("1.Print length of sentence");
		System.out.println("2.Concatenet two strings");
		System.out.println("3.Reverse the string");
		System.out.println("4.Compare two strings");
		System.out.println("5.Display first, last, middle character");
		System.out.println("6.Print monogram");
		
		System.out.println("Enter your choice : ");
		choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice)
		{
		case 1:
			System.out.println("The length of " + s1 + " is " + size1);
			break;
			
		case 2:
			System.out.println("Enter another sentence : ");
			s2 = sc.nextLine();
			con = s1 + " " + s2;
			System.out.println("Concatenated string is - " + con);
			break;
			
		case 3:
			for(i=size1-1; i>=0; i--)
			{
				rev = rev + s1.charAt(i);
			}
			System.out.println(rev);
			break;
			
		case 4:
			System.out.println("Enter another sentence : ");
			s2 = sc.nextLine();
			size2 = s2.length();
			if(size1 == size2)
			{
				for(i=0; i<size1; i++)
				{
					if(s1.charAt(i) == s2.charAt(i))
					{
						continue;
					}
					else
					{
						temp = 0;
					}
				}	
			}
			else
			{
				temp = 0;
			}
			
			if(temp == 1)
			{
				System.out.println("The strings are equal");
			}
			else
			{
				System.out.println("The strings are not equal");
			}
			break;
			
		case 5:
			middle = "";
			first = s1.charAt(0);
			last = s1.charAt(size1-1);
			if(size1 % 2 != 0)
			{
				middle = middle + s1.charAt((size1-1)/2);
				System.out.println("first character is - " + first);
				System.out.println("middle character is - " + middle);
				System.out.println("last character is - " + last);
			}
			else
			{
				int k = size1/2;
				middle = middle + s1.charAt(k-1) + s1.charAt(k);
				System.out.println("first character is - " + first);
				System.out.println("middle characters are - " + middle);
				System.out.println("last character is - " + last);
			}
			break;
			
		case 6:
			mono = "";
			mono = mono + s1.charAt(0);
			for(i=1; i<size1; i++)
			{
				if(s1.charAt(i) == ' ')
				{
					mono = mono + s1.charAt(i+1);
				}
			}
			System.out.println("The monogram is - " + mono);
			break;
			
		case 0:
			a = 0;
			break;
			
		default:
			System.out.println("Invalid input");
			break;
		}
		
		}
	}
}

