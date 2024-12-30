package triangle;

public class Tri_41 {
	
	public static void main(String[] args) {
		
		int n=7;
		int count=1;
		int a=2;
		
		for(int i=0;i<n;i++) {
			int temp=count;
			for(int j=0;j<=i;j++) {
				System.out.print(temp--+" ");
			}
			count=count+(a++);
			System.out.println();
		}
		
	}

}
