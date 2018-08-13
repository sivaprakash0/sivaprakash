import java.util.Scanner;
public class multi {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int sz=in.nextInt();
	int arr[]=new int[sz];
	for(int i=0;i<sz;i++){
		arr[i]=in.nextInt();
	}
	int mul=1,j=0;
	for(int i=0;i<sz;i++){
               j=arr[i];
		arr[i]=1;
		mul=1;
		for(int k=0;k<sz;k++){
		mul=arr[k]*mul;
		}
	    System.out.println(i+" multiple is :"+mul);
               arr[i]=j;
	}
}
}
