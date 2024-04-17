import java.util.Random;
import java.util.Scanner;

public class practice19 {
	
	public static void printArray(int[]array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"\t");
		}
		System.out.println();
	}
	
	public static int searchArray(int[] array, int key) {
		int cnt = 0;
		for(int i =0; i < array.length; i++) {
			cnt++;
			if(array[i] == key) {
				return cnt-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rg = new Random();
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5]; //배열 만드는법!
		
		int find_Idx; 
		int cnt = 0;
		
		do {
			cnt++;
			for(int i = 0; i < arr.length; i++) {
				arr[i] = rg.nextInt(101);
			}
			printArray(arr);
			find_Idx= searchArray(arr,100);
				
			
		}while(find_Idx != 1);
		System.out.print(cnt + "차 실행에서 난수 100이 발생했으므로 프로그램을 종료합니다.");		
		
	}

}