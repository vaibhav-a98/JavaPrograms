package triangle;

public class Tri_34 {
	
	public static void main(String[] args) {
		
		String s="vaibhav";
		char[] ch=s.toCharArray();
		int n=7;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(ch[i]+" ");
			}
			System.out.println();
		}
		
	}

}
