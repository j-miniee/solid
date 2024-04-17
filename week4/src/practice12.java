import java.util.Scanner;

public class practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int n = sc.nextInt();
		
		if(n < 0) {
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			System.out.print("정수를 입력하세요: ");
			n = sc.nextInt();
		}
		
		int cnt = 0;
		for(int i = 1; i <= n; i++) {
			if(i %5 != 0) {
				System.out.print(i+"\t");
				cnt++;
			}
			if(cnt % 7 == 0)
				System.out.println();
		}
		
		/*
		 * while(true){
				System.out.print("숫자를 입력하세요: "); 
				int n = sc.nextInt();
				
				if(n <= 0) {
					System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				}else{
								int cnt = 0;
					for(int i = 1; i <= n; i++) {
						if(i %5 != 0) {
							System.out.print(i+"\t");
							cnt++;
						}
						if(cnt % 7 == 0)
							System.out.println();
					}
				}
		  }
		 */
	}

}
