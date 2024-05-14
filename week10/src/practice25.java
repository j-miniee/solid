class Date{
	private int year, month, day;
	
	//생성자
	public Date(int year, int month, int day) {
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
public class practice25 {

	public static void main(String[] args) {
		Date d1 = new Date(2010, 8, 31);
        Date d2 = new Date(1998, 9, 15);

        System.out.println(d1.toString());
        System.out.println(d2.toString());
		
	}

}
