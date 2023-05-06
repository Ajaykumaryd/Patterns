package characterspatterns;
import java.util.Scanner;
public class pattern4 {

//	A
//	BC
//	CDE
//	DEFG

			public static void main(String[] args){
//				Scanner s=new Scanner(System.in);
//				int n=s.nextInt();
//				int i=1;
//				while(i<=n){			
//					int j=1;
//					char num=(char )('A'+i-1);
//					while(j<=i){
//					System.out.print((char)(num));
//					  num++;
//						 j++;}
//						System.out.println();
//						i++;}
//					}
//				}

Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i=1;
while(i<=n){			
	int j=1;
	char num=(char )(65+i-1);
	while(j<=i){
	System.out.print((char)(num));
	  num++;
		 j++;}
		System.out.println();
		i++;}
	}
}

				

	


