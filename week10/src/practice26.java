class prac26{
	private int year, month, day;
	
	//생성자
	public prac26() {	
		this.year = 1990;
		this.month = 1;
		this.day = 1;
	}
	public prac26(int year) {
		this.year = year;
		this.month = 1;
	    this.day = 1;
	}
	public prac26(int year, int month) {
	    this.year = year;
	    this.month = month;
	    this.day = 1;
	}
	public prac26(int year, int month, int day) {
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
	
	public String toString() {
		return year + "년 "+month+"월 "+day+"일";
	}
	
}

public class practice26 {

	public static void main(String[] args) {
		prac26 d1 = new prac26(2007, 2, 18);
		prac26 d2 = new prac26(2006, 3, 2);
		prac26 d3 = new prac26(2007, 2, 27);
		prac26 d4 = new prac26(2007, 3, 2);
		prac26 d5 = new prac26(2007, 4, 20);
		prac26 d6 = new prac26(2007, 4, 26);

        System.out.println("오늘은 "+ d1.toString()+"입니다.");
        System.out.println("내가 동덕여자대학교에 입학한 날짜는 "+ d2.toString()+"입니다.");
        System.out.println("2007학년도 개강일은 "+ d3.toString()+"에서 "+d4.toString()+"로 변경되었습니다.");
        System.out.println("중간고사 기간은 "+ d5.toString()+"부터 "+d6.toString()+"까지 입니다. ");
	}

}
