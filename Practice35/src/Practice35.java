
public class Practice35 {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount();
		
		b1.name = "김상식";
		b1.accountNo = "1234-5678";
		b1.balance = 100;
		b1.rate = 0.0;
		
		b2.name = "홍길동";
		b2.accountNo = "9999-2531";
		b2.balance = 2000;
		b2.rate = 2.15;
		
		System.out.println("첫 번째 은행 계좌의 정보입니다.");
		System.out.println("이름: "+ b1.name);
		System.out.println("계좌 번호: "+ b1.accountNo);
		System.out.println("잔액: "+b1.balance+"원");
		System.out.println("이자율: "+b1.rate+"%");
		
		System.out.println();
		System.out.println("두 번째 은행 계좌의 정보입니다.");
		System.out.println("이름: "+ b2.name);
		System.out.println("계좌 번호: "+ b2.accountNo);
		System.out.println("잔액: "+b2.balance+"원");
		System.out.println("이자율: "+b2.rate+"%");
		
	}
}
