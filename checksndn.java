package set1;
import java.util.Arrays;
import java.util.Scanner;
public class checksndn {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int sz=in.nextInt();
	int fn=in.nextInt();
	int arr[]=new int[sz];
	for(int i=0;i<sz;i++){
		arr[i]=in.nextInt();
	}
	Arrays.sort(arr);
	int cnt=0;
	for(int j=0;j<sz;j++){
		if(arr[j]==fn){
			cnt++;
		}
	}
	if(cnt==1){
		System.out.println("yes");
	}
	else{
		System.out.println("no");
	}
}
}
