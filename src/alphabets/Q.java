package alphabets;

public class Q {
	
	public static void main(String[] args) {
		
		int n=9;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0 || i==7 || j==0 || j==8) 
						&& (i!=0 || i==0 && j!=0 && j!=8)
						&& (i!=8 || i==8 && j!=0 && j!=8)
						&& (i!=7 || i==7 && j!=0 && j!=8)
						|| i==5 && j==5 || i==6 && j==6 || i==7 && j==7 || i==8 && j==8)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}
