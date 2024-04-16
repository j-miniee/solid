import java.util.Scanner;

public class practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: "); //17
		int n = sc.nextInt();
		
		boolean isPrime = true;
		
		if(n < 0) {
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			System.out.print("숫자를 입력하세요: ");
			n = sc.nextInt();
		}
		
		for(int i = 2; i < n; i++) {
			if(n % i == 0)
				isPrime = false;
		}
		
		if(isPrime)
			System.out.println("입력된 숫자 "+n+"은 소수입니다.");
		else 
			System.out.println("입력된 숫자 "+n+"은 소수가 아닙니다.");
	}

}
