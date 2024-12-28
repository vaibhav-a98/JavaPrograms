package alphabets;

public class K {
	
	public static void main(String[] args) {
		
		int n=9;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || i==3 && j==1 || i==2 && j==2 || i==1 && j==3 || i==0 && j==4
					|| i==5 && j==1 || i==6 && j==2 || i==7 && j==3 || i==8 && j==4)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}
