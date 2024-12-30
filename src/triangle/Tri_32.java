package triangle;

public class Tri_32 {
	
	public static void main(String[] args) {
		
		int n=4;
		int count=1;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++)
				System.out.print(count+++" ");
			System.out.println();
		}
		System.out.println();
		
		int count2=1;
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>=i;j--)
				System.out.print(count2+++" ");
			System.out.println();
		}
		System.out.println();
		
		int count3=1;
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>i;j--)
				System.out.print("  ");
			for(int k=0;k<=i;k++)
				System.out.print(count3+++" ");
			System.out.println();
		}
		System.out.println();
		
		int count4=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++)
				System.out.print("  ");
			for(int k=n-1;k>=i;k--)
				System.out.print(count4+++" ");
			System.out.println();
		}
	}

}
