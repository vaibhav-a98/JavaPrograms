package triangle;

public class Tri_05 {
	
	public static void main(String[] args) throws InterruptedException {
		
		int n=5;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>=j)
					System.out.print("* ");
				else
					System.out.print("  ");
				Thread.sleep(10);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j>=n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
				Thread.sleep(10);

			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i<=j)
					System.out.print("* ");
				else
					System.out.print("  ");
				Thread.sleep(10);

			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j<=n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
				Thread.sleep(10);
			}
			System.out.println();
		}
		
	}

}
