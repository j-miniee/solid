import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		System.out.println("양수 5개를 입력하세요.");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		for(int n : arr) {
			if(max < n) {
				max = n;
			}
		}
		System.out.println("가장 큰 수는 "+max+"입니다.");
	}

}
