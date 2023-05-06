package mirrorpatterns;
import java.util.Scanner;
public class pattern1 {

	public static void main(String[] args){
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
//		int i=1;
//		while(i<=n){
//			int j=1;
//			while(j<=n-i){
//				System.out.print(" ");
//				j++;}
//			j=1;
//			while(j<=i){
//				System.out.print("*");
//				j++;}
//			System.out.println();
//			i++;}}}
	  
		for(int i=1;i<=n;i++){
		for(int spaces=1;spaces<=n-i;spaces++){
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println();}
		
		}
		
	}
//                           *
//                          **
//                         ***
		
	


