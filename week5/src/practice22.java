import java.util.Random;
import java.util.Scanner;

public class practice22 {
	
	public static void printArray(int[]array) {
		
		for(int n : array) {
			System.out.print(n+"\t");
		}
		
		System.out.println();
	}
	
	public static int searchArray(int[] array, int key) {
		int Idx = 0;
		
		for(int n : array) {
			Idx++;
			if(n == key) {
				return Idx;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rg = new Random();
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10]; //배열 만드는법!
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rg.nextInt(100);
		}
		printArray(arr);
		
		int find;
		int find_Idx;
		System.out.print("찾고 싶은 숫자를 입력하세요: ");
		find = sc.nextInt();
		
		find_Idx = searchArray(arr,find);
		
		if(find_Idx == -1) {
			System.out.println("입력한 숫자 "+find+"는 배열에 없습니다.");
		}else {
			System.out.println("입력한 숫자 "+find+"는 배열의 "+ find_Idx+"번 자리에 있습니다.");
		}

		
	}

}
