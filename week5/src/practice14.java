import java.util.Random;
import java.util.Scanner;

public class practice14 {
	
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
		if ((s1.equals("가위") && s2.equals("보")) ||
                (s1.equals("보") && s2.equals("바위")) ||
                (s1.equals("바위") && s2.equals("가위"))) {
            System.out.println("컴퓨터가 이겼습니다.");
        } else if ((s2.equals("가위") && s1.equals("보")) ||
                (s2.equals("보") && s1.equals("바위")) ||
                (s2.equals("바위") && s1.equals("가위"))) {
            System.out.println("당신이 이겼습니다.");
        } else {
            System.out.println("비겼습니다.");
        }
		
		/*
		  if(!(com.equals(you))){
		  	if(com.equals("가위")){
		  		if(you.equals("바위"))
		  			내가 이김;
		  		else
		  			컴퓨터가 이김;
		  	}else if(컴 = 바위) {
		  	
		  	}else{
		  	
		  	}
		  }
		  
		 else{
		  	비겼음
		 }

		 */
	}

}