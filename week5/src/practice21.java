import java.util.Random;

public class practice21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rg = new Random();
		//(int)(Math.random()*101)써도 됨.
		
		int arr[] = new int[10]; //배열 만드는법!
		int total = 0;
		double average;
		
		for(int i = 0; i < 10; i++) { //idx 사용하여 만들어야 하기 때문
			arr[i] = rg.nextInt(100);
		}
		
		for(int n : arr) {
			System.out.printf("%2d  ", n);
			total += n;
		}
		average = (double)total /10;
		System.out.println();
		
		for(int i = 9; i >= 0; i--) {// idx를 사용하여 역순으로 출력해야 하기 때문
			System.out.printf("%2d  ", arr[i]);
		}
		System.out.println();
		
		System.out.println("난수들의 총합: "+ total);
		System.out.println("난수들의 평균: "+ average);
		
	}

}