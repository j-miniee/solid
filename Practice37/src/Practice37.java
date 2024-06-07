
public class Practice37 {

	public static void main(String[] args) {
		Plane p1 = new Plane();
		Plane p2= new Plane();
		Plane p3 = new Plane();
		
		p1.id = 0;
		p1.model = "모름";
		p1.capacity = 0;
		
		p2.id = 1030615;
		p2.model = "보잉 737";
		p2.capacity = 75;
		
		p3.id = 2464737;
		p3.model = "보잉 747";
		p3.capacity = 150;
		
		System.out.println("디폴트 비행기의 정보입니다.");
		System.out.println("식별번호: "+p1.id+"편");
		System.out.println("모델: "+p1.model);
		System.out.println("승객수: "+p1.capacity+"명");
		
		System.out.println("제주행 비행기의 정보입니다.");
		System.out.println("식별번호: "+p2.id+"편");
		System.out.println("모델: "+p2.model);
		System.out.println("승객수: "+p2.capacity+"명");
		
		System.out.println("서울행 비행기의 정보입니다.");
		System.out.println("식별번호: "+p3.id+"편");
		System.out.println("모델: "+p3.model);
		System.out.println("승객수: "+p3.capacity+"명");

	}

}
