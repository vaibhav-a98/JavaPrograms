package alphabets;

public class O {
	
	public static void main(String[] args) {
		
		int n=9;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0 || i==8 || j==0 || j==8) 
						&& (i!=0 || i==0 && j!=0 && j!=8)
						&& (i!=8 || i==8 && j!=0 && j!=8))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}
