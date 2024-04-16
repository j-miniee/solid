import java.util.Random;
import java.util.Scanner;

public class practice16 {
	
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
		
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		String s1, s2;
		String[] choice = {"가위", "바위", "보"};
		
		while(true) {
			System.out.println("현재 당신의 전적: "+win+"승 "+ lose+"패 "+draw+"무 ");
			
			s1 = choice[rg.nextInt(3)];
			System.out.println("컴퓨터의 생성: " + s1 );
			
			System.out.print("당신의 입력(가위/바위/보/그만): " );
			s2 = sc.next();
			
			
			if(s2.equals("가위")==false&&s2.equals("바위") ==false && s2.equals("보") == false&& s2.equals("그만") == false) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				System.out.print("당신의 입력(가위/바위/보/그만): " );
				s2 = sc.next();
			}else if(s2.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
	
			//문자열 비교는 'equals()메서드'이용
			if (whoswin(s1, s2) == -1) {
	            System.out.println("컴퓨터가 이겼습니다.");
	            lose++;
	        } else if (whoswin(s1, s2) == 1) {
	            System.out.println("당신이 이겼습니다.");
	            win++;
	        } else {
	            System.out.println("비겼습니다.");
	            draw++;
	        }
		}
	}

}
