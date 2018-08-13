import java.util.Scanner;
public class sameline {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int ar[]=new int[6];
	for(int i=0;i<6;i++){
		ar[i]=in.nextInt();
	}
	if(ar[0]==ar[2] && ar[2]==ar[4] || ar[1]==ar[3] && ar[3]==ar[5]){
		System.out.println("yes");
	}
	else{
		System.out.println("no");
	}
}
}
