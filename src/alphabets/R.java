package alphabets;

public class R {
	
	public static void main(String[] args) {
		
		int n=9;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0 || i==5 || j==0) && j!=8 || j==8 && i!=5 && i!=0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}
