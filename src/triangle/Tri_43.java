package triangle;

public class Tri_43 {
	
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=0;i<n;i++) {
			int count=i+1;
			int a=n-1;
			for(int j=0;j<=i;j++) {
				System.out.print(count+" ");
				count=count+(a--);
			}
			System.out.println();
		}
		
	}

}
