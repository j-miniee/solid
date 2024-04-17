import java.util.Scanner;

public class practice13 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s1, s2;
		
		System.out.print("철수의 입력: " );
		s1 = sc.next();
		if(s1.equals("가위")==false&&s1.equals("바위") ==false && s1.equals("보") == false) {
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			System.out.print("철수의 입력: " );
			s1 = sc.next();
		}
		
		System.out.print("영희의 입력: " );
		s2 = sc.next();
		if(s2.equals("가위")==false&&s2.equals("바위") ==false && s2.equals("보") == false) {
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			System.out.print("영희의 입력: " );
			s2 = sc.next();
		}

		//문자열 비교는 'equals()메서드'이용
		if ((s1.equals("가위") && s2.equals("보")) ||
                (s1.equals("보") && s2.equals("바위")) ||
                (s1.equals("바위") && s2.equals("가위"))) {
            System.out.println("철수가 이겼습니다.");
        } else if ((s2.equals("가위") && s1.equals("보")) ||
                (s2.equals("보") && s1.equals("바위")) ||
                (s2.equals("바위") && s1.equals("가위"))) {
            System.out.println("영희가 이겼습니다.");
        } else {
            System.out.println("비겼습니다.");
        }
		
		/*
			do{
			
			
			
			} while(!((s1.equals("가위"))||(s1.equals("바위"))||(s1.equals("보"))));
			...
			
			if (s1.equals("바위")) {
				if(s2.equals("보"))
					영희 이김;
				else
					철수 이김;
			}else if ..
		
        	} 
	*/
	}

}