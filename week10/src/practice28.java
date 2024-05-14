class prac28{
	private int year, month, day;
	
	//생성자
	public prac28() {	
		this.year = 1990;
		this.month = 1;
		this.day = 1;
	}
	public prac28(int year) {
		this.year = year;
		this.month = 1;
	    this.day = 1;
	}
	public prac28(int year, int month) {
	    this.year = year;
	    this.month = month;
	    this.day = 1;
	}
	public prac28(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
	
	//접근자(getter): 멤버변수(private)의 값을 읽어옴. 접근자 통해 멤버변수 가져옴
	//설정자(setter): 멤버변수의 값을 설정함. 설정자 통해 private 변수 값 변경함.
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth() {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	public String printWestern() {
		String m[]= {"January", "February", "March", "April", "May", "June", "July",
	                "August", "September", "October", "November", "December"};
		
	    return m[this.month - 1] + " " + this.day + ", " + this.year;
	}
	public String toString() {
		return year + "년 "+month+"월 "+day+"일";
	}
	
}
public class practice28 {
	public static void main(String[] args) {
		prac28 d1 = new prac28(2010, 9, 2);
		prac28 d2 = new prac28(1997, 4, 1);
		
		System.out.println(d1.toString());
		System.out.println(d1.printWestern());
        System.out.println(d2.toString());
        System.out.println(d2.printWestern());
	}
}
