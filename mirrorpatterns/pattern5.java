package mirrorpatterns;
import java.util.Scanner;
public class pattern5 {

	public static void main(String[] args) {
//		   1
//		  121
//		 12321
//		1234321
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n){
			int spaces=1;
			while(spaces<=n-i){
				System.out.print(" ");
				spaces++;}
			int j=1;
			int inc=1;
			while(j<=i){
				System.out.print(inc); 
			j++;
			inc++;}
			
		   int dec =i-1;
		    j=1;
		    while(j<=i-1){
		    	System.out.print(dec);
		    	dec--;
		    	j++;}
		    System.out.println();
			i++;}
		    }}
			
			
			
		
	


