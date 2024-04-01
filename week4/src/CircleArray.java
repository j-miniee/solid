class Won{
	int r;
	public Won(int r) {
		this.r = r;
	}
	public double getArea() {
		return 3.14*r*r;
	}
}
public class CircleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Won c [] = new Won[5];
		
		for(int i = 0; i < c.length; i++) {
			c[i] = new Won(i);
		}
		for(int i = 0; i < c.length; i++) {
			System.out.print((int)(c[i].getArea())+" ");
		}
	}

}
