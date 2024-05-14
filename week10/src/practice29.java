class p29_Person{
	private String name;
	private int age;
	private String address;
	
	 public p29_Person() {
	        this.name = "모름";
	        this.age = -1;
	        this.address = "모름";
	    }

	    public p29_Person(String name) {
	        this.name = name;
	        this.age = -1;
	        this.address = "모름";
	    }

	    public p29_Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	        this.address = "모름";
	    }

	    public p29_Person(String name, int age, String address) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	    }

	    public String toString() {
	        return "이름: " + name + ", 나이: " + age + ", 주소: " + address;
	    }
	}
public class practice29 {

	public static void main(String[] args) {
		p29_Person p1 = new p29_Person("김동덕", 22, "서울시");
		p29_Person p2 = new p29_Person("홍길동", 30, "제주시");
		p29_Person p3 = new p29_Person("성춘향", 16, "남원시");
		
		System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
	}

}
