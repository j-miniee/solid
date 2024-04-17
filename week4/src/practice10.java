import java.util.Scanner;

public class practice10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int cnt = 0;
		/* 
			while(true){
				System.out.print("숫자를 입력하세요: ");
				int n = sc.nextInt();
				
				if(n < 0) {
					System.out.println("음수가 입력되었습니다. 다시 입력하세요");
				} else if(n > 0) {
					sum += n;
					cnt++;
				} else{
					break;
				} 
		 } */
		
		int max_cnt = 0;
		double avg = 0;
		int n;
		do {
			System.out.print("숫자를 입력하세요: ");
			n = sc.nextInt();
			if(n < 0) {
				System.out.println("음수가 입력되었습니다. 다시 입력하세요");
			} else if(n > 0) {
				sum += n;
				cnt++;
			}
			if(n > 0)
				max_cnt++;
		} while(n != 0);
		avg = (double)sum/cnt;
		
		System.out.println("입력된 숫자들의 합은 "+ sum + "입니다.");
		System.out.println("입력된 숫자들 중에서 0보다 큰 숫자의 개수는 "+ max_cnt+"입니다.");
		System.out.println("입력된 숫자들의 평균은 "+avg+"입니다.");
	}
	
}
