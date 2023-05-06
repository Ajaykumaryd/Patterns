package characterspatterns;
import java.util.Scanner;
public class pattern5 {
//	E
//	DE
//	CDE
//	BCDE
//	ABCDE
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		char num=(char)n;
		for(int i=1;i<=n;i++){
			char start=(char)('A'+num-1);
			for(int j=1;j<=i;j++){
			System.out.print((char)(start));
			start++;			
			;}num--;
            System.out.println();}
			}
		}



	


