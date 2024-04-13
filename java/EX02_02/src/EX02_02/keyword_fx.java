package EX02_02;

public class keyword_fx {
	public static void main(String[] args) {
		int price = 200;	//price는 int 타입으로 결정	//byte빼고 나머지 정수도 가능
		String name = "Kitae";	//name은 String 타입으로 결정	//S대문자
		double pi = 3.14;	//pi는 double 타입으로 결정	//float도 가능
	
		System.out.println("price = " + (price + 1000));
		System.out.println("name = " + name);
		System.out.println("pi = " + pi*10);	//돌리면 31.400000000000002 로 2가 어디서 튀어나옴
	}
}
