
public class ArrayException {

	public static void main(String[] args) {
		int array[] = new int [5];
	
		array[0] = 0;
		
		try {
			for(int i = 0; i < 5; i++) {
				array[i+1] = i+1 + array[i];
				System.out.println("array[" + i+ "]="+array[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
	}

}
