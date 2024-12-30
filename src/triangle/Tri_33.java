package triangle;

public class Tri_33 {
	
	public static void main(String[] args) {
		
		int n=5;
		char ch1='A';
		char ch2='a';
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(ch1++);
				System.out.print(ch2+++" ");
			}
			System.out.println();
		}
		
	}

}
