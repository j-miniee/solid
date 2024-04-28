import java.util.Scanner;
public class mid_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		String n  = sc.next();
		
		try {
			//문자열 비교할 때 n != "그만"하면 안되고, equals() 메서드 사용
			while(! n.equals("그만")) {
				total += Integer.parseInt(n);
				/*문자열을 정수로 변환할 때는 (int)n으로 강제형 변환 하는게 아니라 
				Integer.parseInt() 메서드 사용*/
				n  = sc.next();
			}
			System.out.println("합계: "+total);
		}
		catch(NumberFormatException e){
			System.out.println("잘못된 입력입니다.");
		}
		finally {
			System.out.println("프로그램을 종료합니다.");
		}
	}

}
