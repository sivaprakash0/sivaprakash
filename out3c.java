package set3;

import java.util.Scanner;

public class out3c {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s=in.next();
	String s1=Character.toString(s.charAt(0));
	for(int i=3;i<s.length();i=i+3){
		s1=s1+s.substring(i, i+1);
		
	}
	System.out.println(s1);
}
}
