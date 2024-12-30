package triangle;

public class Tri_42 {
	
	public static void main(String[] args) {
		
		int n=6;
		int a=2;
		int count=65;
		
		for(int i=0;i<n;i++) {
			int temp=count;
			for(int j=0;j<=i;j++) {
				System.out.print((char)temp--+" ");
			}
			count=count+(a++);
			System.out.println();
		}
		
	}

}
