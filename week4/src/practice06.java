
public class practice06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 2; j<=5; j++) {
				System.out.print(j+ "*" +i+ "=" + i*j+ "\t");
				if(j % 5 == 0)
					System.out.println();
			}
		}
		System.out.println();
		for(int i = 1; i <= 5; i++) {
			for(int j = 6; j<=9; j++) {
				System.out.print(j+ "*" +i+ "=" + i*j+ "\t");
				if(j % 9 == 0)
					System.out.println();
			}
		}
	}

}