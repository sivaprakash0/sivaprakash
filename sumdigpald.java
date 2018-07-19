package player;

import java.util.Scanner;

public class sumdigpald {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int tot=0;
	String s=Integer.toString(in.nextInt());
	char c[]=s.toCharArray();
	for(int i=0;i<s.length()-1;i++){
		int a=(c[i]-48)+(c[i+1]-48);
		tot=tot+a;
	}
	System.out.println(tot);	
	if(Integer.toString(tot).equals(new StringBuffer(Integer.toString(tot)).reverse().toString())){
		System.out.println("yes");
	}
	else{
		System.out.println("no");
	}
}
}
