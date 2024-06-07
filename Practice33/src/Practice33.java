import java.util.Scanner;

public class Practice33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 입력: ");
		r1.height = sc.nextInt();
		System.out.print("세로 입력: ");
		r1.width = sc.nextInt();
	
		System.out.println("면적은 "+(r1.height*r1.width)+"입니다.");
		System.out.println("둘레는 "+((r1.height+r1.width)*2)+"입니다.");
		
	}

}
