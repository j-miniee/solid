import java.util.Random;
import java.util.Scanner;

public class practice15 {
	
	public static int whoswin(String com, String you) {
		if ((com.equals("가위") && you.equals("보")) ||
                (com.equals("보") && you.equals("바위")) ||
                (com.equals("바위") && you.equals("가위"))) {
           return -1;
        } else if ((you.equals("가위") && com.equals("보")) ||
                (you.equals("보") && com.equals("바위")) ||
                (you.equals("바위") && com.equals("가위"))) {
           return 1;
        } else {
            return 0;
        }
	}
	
	public static void main(String[] args) {
		Random rg = new Random();
		Scanner sc = new Scanner(System.in);
		
		String s1, s2;
		String[] choice = {"가위", "바위", "보"};
		
		s1 = choice[rg.nextInt(3)];
		System.out.println("컴퓨터의 생성: " + s1 );
		
		System.out.print("당신의 입력: " );
		s2 = sc.next();
		if(s2.equals("가위")==false&&s2.equals("바위") ==false && s2.equals("보") == false) {
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			System.out.print("당신의 입력: " );
			s2 = sc.next();
		}

		//문자열 비교는 'equals()메서드'이용
		if (whoswin(s1, s2) == -1) {
            System.out.println("컴퓨터가 이겼습니다.");
        } else if (whoswin(s1, s2) == 1) {
            System.out.println("당신이 이겼습니다.");
        } else {
            System.out.println("비겼습니다.");
        }
	}

}