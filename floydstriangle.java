
import java.util.Scanner;

public class floydstriangle {
	
	public static void main (String args[]){
		int z=1;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
					if(i==n){
						System.out.println(z+"");
					}
					z++;
			}
		}
		
		
	}

}
