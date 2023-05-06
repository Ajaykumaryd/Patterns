package characterspatterns;
import java.util.Scanner;
public class pattern7 {
//	ABCD
//	ABC
//	AB
//	A
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=n;
		while(i>=1) {
			int j=1;
			char q=(char)('A'+j-1);
			while(j<=i){
				System.out.print(q);
				q++;
				j++;}
			System.out.println();
			i--;
			}
		}
	}


