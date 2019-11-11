package String;

import java.util.Scanner;

public class CharCount {
	
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the string");
	    String s1=sc.nextLine();
	    char []ch=s1.toCharArray();
	    String s2="";
	    for (int i = 0; i < ch.length; i++) {
	    	if(ch[i]!=' ') {
	    		int c=1;
	    		for (int j = i+1; j < ch.length; j++) {
					if(ch[i]==ch[j]) {
						ch[j]=' ';
						c++;
					}
				}
	    		System.out.println(ch[i] +" "+ "occured"+" "+  c +"times");
	    	}
			
		}
	    
	}
}
