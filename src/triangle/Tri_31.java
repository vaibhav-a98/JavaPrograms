package triangle;

public class Tri_31 {
	
	public static void main(String[] args) {
		
		char ch='A';
		int n=5;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) 
				System.out.print(ch+++" ");
			System.out.println();
		}
		System.out.println();
		
		char ch2='A';
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>=i;j--)
				System.out.print(ch2+++" ");
			System.out.println();
		}
		System.out.println();
		
		char ch3='A';
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>i;j--)
				System.out.print("  ");
			for(int k=0;k<=i;k++)
				System.out.print(ch3+++" ");
			System.out.println();
		}
		System.out.println();
		
		char ch4='A';
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++)
				System.out.print("  ");
			for(int k=n-1;k>=i;k--)
				System.out.print(ch4+++" ");
			System.out.println();
		}
	}

}