class Circle{
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public String toString() {
		//toString 메소드는 객체의 문자열 표현을 반환한다. 
		return "Circle(r="+radius+")";
	}
}
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle(10);
		System.out.println(obj);
	}

}
