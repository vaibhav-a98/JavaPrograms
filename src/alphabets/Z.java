package alphabets;

public class Z {
	
	public static void main(String[] args) {
		
		int n=9;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==8 || i+j==8)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}
