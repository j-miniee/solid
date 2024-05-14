class p30_Person{
	private String name;
	private int age;
	private String address;
	
	 public p30_Person() {
	        this.name = "모름";
	        this.age = -1;
	        this.address = "모름";
	    }

	    public p30_Person(String name) {
	        this.name = name;
	        this.age = -1;
	        this.address = "모름";
	    }

	    public p30_Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	        this.address = "모름";
	    }

	    public p30_Person(String name, int age, String address) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	    }
	    
	    // Getter 메서드
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getAddress() {
	        return address;
	    }
	}
class p30_Student extends p30_Person{
	private long sid;
	private String major;
	
	public p30_Student(String name, int age, String address, long sid, String major) {
        super(name, age, address);
        this.sid = sid;
        this.major = major;
    }

    public p30_Student(String name, long sid, String major) {
        super(name);
        this.sid = sid;
        this.major = major;
    }

    public p30_Student(String name, long sid) {
        super(name);
        this.sid = sid;
        this.major = "모름";
    }
	
	public p30_Student() {
        super();
        this.sid = -1;
        this.major = "모름";
    }

    public String toString() {
        return "이름: " + getName() + ", 나이: " + getAge() + "세, 주소: " + getAddress() + ", 학번: " + sid + ", 전공: " + major;
    }

    public String printSafely() {
        return "이름: " + getName() + ", 학번: " + sid + ", 전공: " + major;
    }
}


public class practice30 {

	public static void main(String[] args) {
		 p30_Student p1 = new p30_Student("김동덕", 22, "서울시", 20132468, "컴퓨터학");
	     p30_Student p2 = new p30_Student("홍길동", 30, "제주시", 20111234, "컴퓨터학");
	     p30_Student p3 = new p30_Student("성춘향", 16, "남원시", 20121357, "국문학");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p1.printSafely());
        System.out.println(p2.printSafely());
        System.out.println(p3.printSafely());

	}

}
