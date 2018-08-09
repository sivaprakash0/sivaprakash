import java.util.Scanner;
public class checkspl{
 public static void main(String args[]){
   Scanner in=new Scanner(System.in);
   String s=in.next();
   char c[]=s.toCharArray();
   int cnt=0,cnt1=0;
    for(int i=0;i<s.length();i++){
    if(c[i]==40){
          cnt++;
           }
       if(c[i]==41){
           cnt1++;
           } 
        }
 if(cnt==cnt1){
  System.out.println("yes");
  }
   else{
   System.out.println("no");
   }
}
}
