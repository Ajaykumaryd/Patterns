package characterspatterns;
import java.util.Scanner;
public class pattern8 {
//	ABCD
//	BCD
//	CD
//	D

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n){
			int j=n;
			char q=(char)('A'+i-1);
			while(j>=i){
				System.out.print(q);
				q++;
				j--;}
			System.out.println();
			i++;
			}
		}
	}

	


