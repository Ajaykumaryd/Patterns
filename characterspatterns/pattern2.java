package characterspatterns;
import java.util.Scanner;
public class pattern2 {
//	ABCDE
//	BCDEF
//	CDEFG
//	DEFGH
//	EFGHI
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n){
			int j=1;
			char startingchar=(char)('A'+i-1);
			while(j<=n){
				System.out.print(startingchar);
				startingchar++;
				j++;}
			System.out.println();
			i++;}
				
				
			
		
	}

}
