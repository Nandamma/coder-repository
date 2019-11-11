package String;

import java.util.Scanner;

public class Duplicates {
      public static void main(String[] args) 
      {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the string");
		 String s1=sc.nextLine();
		 char []ch=s1.toCharArray();
		 String s2="";
		 int c=0;
		 for (int i = 0; i < ch.length; i++) {
			int k=i;
			for (int j = i+1; j < ch.length && ch[i]!=' '; j++) {
				if (ch[i]==ch[j]) {
					c++;
					ch[j]=' ';
				}
				if (c>=1 && ch[i]!=' ') {
					System.out.print(ch[i]);
					c=0;
				}
			}
		}
	}
}
