package assignments;
import java.util.Scanner;
public class ass3 {
//	1357
//	3571
//	5713
//	7135
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n){
		int j=i;
		while(j<n+i){
			System.out.print(((2*j)-1)%(2*n));
			j++;}		
			System.out.println();
			i++;}
		
	}

	}

