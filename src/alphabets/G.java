package alphabets;

public class G {
	
	public static void main(String[] args) {
		
		int n=9;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0 || i==6 && j!=0 || j==0 && i!=7 && i!=8) 
						|| i==4 && j==5 || i==4 && j==6 || i==4 && j==7 || i==4 && j==8
						|| i==5 && j==8 || i==7 && j==8 || i==8 && j==8
						|| i==8 && j==5 || i==8 && j==6 || i==8 && j==7)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}
