package EX03_03;

public class dowhilesample {
	public static void main (String[] args) {
		char z = 'z';
		
		do {
			System.out.print(z);
			z = (char) (z - 1);
		} while (z >= 'a'); 	
	}
}
