
public class foreachEx {
	enum Week {월, 화, 수, 목, 금, 토, 일}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {1, 2, 3, 4, 5};
		String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
		
		int sum = 0;
		for(int i : n) {
			sum += i;
		}
		for(int i : n) {
			System.out.print(i + " ");
		}
		
		System.out.println("합은 "+ sum);
		
		for(String c : names) {
			System.out.print(c + " ");
		}
		System.out.println();
		for(Week w : Week.values()) { //여기 처음 써보는 부분
			System.out.print(w + "요일 ");
		}
	}

}
