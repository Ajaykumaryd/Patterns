package mirrorpatterns;
import java.util.Scanner;
public class pattern6 {

	public static void main(String[] args){
//		   1
//		  232
//		 34543
//		4567654

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n){
			int spaces=1;
			while(spaces<=n-i){
				System.out.print(" ");
				spaces++;}
			int j=1;
			int inc=i;
			while(j<=i){
				System.out.print(inc); 
			inc++;
			j++;
			 }
			
		    int dec=(2*i)-2;
		    j=1;
		    while(j<=i-1){
		    	System.out.print(dec);
		    	dec--;
		    	j++;}
		    System.out.println();
			i++;}
		    }}
			
			
			
		
	




