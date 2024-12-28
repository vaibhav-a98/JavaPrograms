package alphabets;

public class S {
	
	public static void main(String[] args) {
		
		int n=9;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==4 || i==8
						|| i==1 && j==0 || i==2 && j==0 || i==3 && j==0
						|| i==5 && j==8 || i==6 && j==8 || i==7 && j==8)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}
