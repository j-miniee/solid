import java.util.Scanner;

public class practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int n = sc.nextInt();
		
		if(n < 0 ) {
			n = -n;
		}
		System.out.print("입력한 정수 "+ n +"의 절대값은 "+ n +"입니다.");
		
	}

}
