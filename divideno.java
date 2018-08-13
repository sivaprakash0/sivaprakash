import java.util.Scanner;
public class divideno {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int no=in.nextInt();
	int no1=in.nextInt();
	int res=1;
  if(no1<=100000){
	for(int i=1;i<(no1/2);i++){
		if(no%i==0 && no1%i==0){
		res=i;
		}
	}
	System.out.println(res);
  }
}
}
