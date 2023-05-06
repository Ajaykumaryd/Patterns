package characterspatterns;
import java.util.Scanner;
public class pattern1 {
//	ABCD
//	ABCD
//	ABCD
//	ABCD
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n){
			int j=1;
			while(j<=n){
				System.out.print((char)('A'+j-1));
				j++;}
			System.out.println();
			i++;}
				
				
			}
		}
//Scanner s=new Scanner(System.in);
//int n=s.nextInt();
//int i=1;
//while(i<=n){
//	int j=1;
//	while(j<=n){
//		System.out.print((char)(65+j-1));
//		j++;}
//	System.out.println();
//	i++;}
		

	


