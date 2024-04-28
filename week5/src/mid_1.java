import java.util.Scanner;

public class mid_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int total = 0;
		
		do {
			n = sc.nextInt();

			if(n < 0) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			} else if(n > 0){
				total += n;
			}
		}while(n != 0);
		
		System.out.println("합계: "+ total);
		System.out.println("프로그램을 종료합니다.");
		
	}

}
