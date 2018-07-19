import java.util.Scanner;
public class prodmult {
public static void main(String[] args) {
	Scanner rd=new Scanner(System.in);
	int sz=rd.nextInt();
	int arr[]=new int[sz];
	for(int i=0;i<sz;i++){
		arr[i]=rd.nextInt();
	}
	int tot=Math.abs(arr[0]*arr[1]);
	for(int i=2;i<sz;i++){
		tot=Math.abs(tot*arr[i]);
	}
	System.out.println(tot);
}
}
