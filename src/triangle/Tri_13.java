package triangle;

public class Tri_13 {
	
	public static void main(String[] args) throws InterruptedException {
		
		int n=5;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			Thread.sleep(50);
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<n;i++) {
			for(int j=0;i+j<=n-1;j++) {
				System.out.print("* ");
			}
			Thread.sleep(50);
			System.out.println();
		}
	}

}
