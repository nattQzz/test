public class Loop {
	public static void main(String[] args) {
		for(int row=1; row<=4; row++) {
			for(int i=0; i<4-row; i++) {
				System.out.print(" ");
			}
			for(int col=1; col<=2*row-1; col++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
