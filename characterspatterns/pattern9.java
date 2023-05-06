package characterspatterns;

import java.util.Scanner;

public class pattern9 {
//	A
//	BB
//	CCC
//	DDDD
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n){
			char a=(char)(64+i);
			int j=1;			
			while(j<=i){
				System.out.print(a);
				j++;}
			System.out.println();
			i++;
			}
		}
	}
	


