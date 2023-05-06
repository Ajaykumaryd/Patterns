package characterspatterns;
import java.util.Scanner;
public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A
//		AB
//		ABC
//		ABCD
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			char q='A';
			while(j<=i){
				System.out.print(q);
				q++;
				j++;}
			System.out.println();
			i++;
			}
		}
	}


