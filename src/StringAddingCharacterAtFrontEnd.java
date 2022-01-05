package diwali;

import java.util.Scanner;
public class StringAddingCharacterAtFrontEnd {
	public static void main(String[] args) {
		String str;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any string ");
		str=sc.next();
		int lenght=str.length();
		char c=str.charAt(lenght-1);
		str=c+str+c;
		System.out.println(str);
	}

}
