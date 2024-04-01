
public class Book_this {
	String title;
	String author;
	void show() {
		System.out.println(title + " " + author);
	}
	
	public Book_this() {
		this("", "");
		System.out.println("생성자 호출됨");
	}
	
	public Book_this(String title) {
		this(title, "작자미상");
	}
	
	public Book_this(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book_this littlePrince = new Book_this("어린왕자", "생텍쥐페리");
		Book_this loveStory = new Book_this("춘향전");
		Book_this emptyBook = new Book_this();
		loveStory.show();
	}

}
