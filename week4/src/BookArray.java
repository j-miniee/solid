import java.util.Scanner;
class Chek{
	String title, author;
	public Chek(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class BookArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chek book[] = new Chek[2];
		
		Scanner sc = new Scanner (System.in);
		for(int i = 0; i < book.length; i++) {
			System.out.print("제목>>");
			String title = sc.nextLine();
			System.out.print("저자>>");
			String author = sc.nextLine();
			book[i] = new Chek(title, author);
		}
		for(int i = 0; i < book.length; i++) {
			System.out.print("(" + book[i].title + ", "+ book[i].author+")");
		}

	}
	
}
