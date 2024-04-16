import java.util.Random;
import java.util.Scanner;

public class practice20 {
	public static void printArray(int[]array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"\t");
		}
		System.out.println();
	}
	/*com = 5 2 1
	 * me = 5 7 2
	 * same = 1, differ = 1*/
	public static int searchArray(int[] com, int me[], int me_idx) {
		int j, i;
		for(i = 0; i < com.length; i++) {
			if(me[me_idx] == com[i]) {
				if(me_idx == i)
					return 1;
				else
					return 0;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rg = new Random();
		Scanner sc = new Scanner(System.in);
		
		int same = 0, differ = 0;
		
		int arr[] = new int[3];
		int user[] = new int[3];
		
		for(int i = 0; i < arr.length; i++) {
			if(rg.nextInt(10) != 0) {
				arr[i] = rg.nextInt(10);
			}
		}
		printArray(arr);
		
		for(int i = 0; i < user.length; i++) {
			System.out.print(i+ "번째 숫자 입력: ");
			user[i] = sc.nextInt();
		}
		for(int i = 0; i < user.length; i++) {
			int n = searchArray(arr, user, i);
			if(n == 1) {
				same++;
			}else if(n == 0) {
				differ++;
			}
		}
		
		System.out.println("자리와 값이 모두 같은 숫자: "+same+"개");
		System.out.println("자리는 다르고 값만 같은 숫자: "+differ+"개");
	}

}
