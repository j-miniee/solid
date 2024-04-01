import java.util.Scanner;

public class practice04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		if(num >= 0) {
		
			if(num %2 == 0)
				System.out.print("입력한 정수 " +num+"은 짝수입니다.");
			else 
				System.out.print("입력한 정수 " +num+"은 홀수입니다.");
		}
		else
			System.out.print("입력한 정수 " +num+"은 음수입니다.");
		
	}

}
