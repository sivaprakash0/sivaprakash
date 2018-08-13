import java.util.Scanner;
public class findnumeric {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String no=in.next();int cnt = 0;
	for(int i=0;i<no.length();i++){
		char c[]=no.toCharArray();
		if(c[i]>='0' && c[i]<='9'){
			cnt++;
		}
	}
	if(cnt==no.length()){System.out.println("yes");}
	else{System.out.println("no");}
}
}
