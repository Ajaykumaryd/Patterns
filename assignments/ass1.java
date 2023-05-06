package assignments;
import java.util.Scanner;
public class ass1 {
	public static void main(String[] args) {
//		        1=1
//				1+2=3
//				1+2+3=6
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int sum=i;
	    while(i<=n){
            int sn=1;
            int j=1;
            while(j<=i){
            if(sn<i){
            System.out.print(sn+"+");
            	j++;
            	sn++;}
            	else{
            		System.out.print(sn+"="+sum);
            		j++;
            	}}
              System.out.println();
              i++;
              sum=sum+i;
            	}
            }
	    	
	    }
	


