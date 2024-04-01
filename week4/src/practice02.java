import java.util.Scanner;

public class practice02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨 온도를 입력하세요: ");
		int F = sc.nextInt();
		
		double C = (5.0 / 9.0) *(F-32); 
		//(5/9)로 하면 정수 나눗셈으로 처리되어 항상 0이 반환됨 => 실수로 나누어야 함
		System.out.print("해당하는 섭씨 온도는 "+ C + "입니다.");
		
		
		
	}
	
}
