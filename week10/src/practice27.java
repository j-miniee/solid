class prac27{
	private int year, month, day;
	
	//생성자
	public prac27() {	
		this.year = 1990;
		this.month = 1;
		this.day = 1;
	}
	public prac27(int year) {
		this.year = year;
		this.month = 1;
	    this.day = 1;
	}
	public prac27(int year, int month) {
	    this.year = year;
	    this.month = month;
	    this.day = 1;
	}
	public prac27(int year, int month, int day) {
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
	
	protected boolean isReap(int year) {
		 if (year % 4 == 0) {
	            if (year % 100 == 0) {
	                if (year % 400 == 0) {
	                    return true;
	                } else {
	                    return false;
	                }
	            } else {
	                return true;
	            }
	        }
	        return false;
	}
	
	 public String testReapYears() {
	        if (isReap(this.year)) {
	            return this.year + "년은 윤년입니다.";
	        } else {
	            return this.year + "년은 윤년이 아닙니다.";
	        }
	 }
	
}
public class practice27 {

	public static void main(String[] args) {
		prac27 d1 = new prac27(2004);
		prac27 d2 = new prac27(1997);
		prac27 d3 = new prac27(1900);
		prac27 d4 = new prac27(2000);

		System.out.println(d1.testReapYears());
        System.out.println(d2.testReapYears());
        System.out.println(d3.testReapYears());
        System.out.println(d4.testReapYears());
	}
	

}
