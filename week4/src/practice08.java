import java.util.Random;

public class practice08 {

	public static void main(String[] args) {
		Random rg = new Random();
		
		for(int j = 0; j < 10; j++) {
			for(int i = 0; i < 10; i++) {
				int x = rg.nextInt(100);
				System.out.print(x + "\t");
			}
			System.out.println();
		}
	}

}
