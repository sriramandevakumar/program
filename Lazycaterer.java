import java.util.Scanner;

public class Lazycaterer {
	
	public static void main (String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int p=((n*n)+n+2)/2;
		for(int i=1;i<=n;i++){
			System.out.println(p);
			p++;
		}
	}
}
