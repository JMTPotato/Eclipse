package EX02_03;


public class CircleArea {
	static final double PI = 3.14;		//원주율을 상수로 선언	//상수 선언시 static으로 선언하는 것이 바람직함(5장 참조)	//main에 넣으면 안됨

	public static void main(String[] args) {			
		double radius = 10.2;					//원의 반지름
		double circleArea = radius*radius*PI;	//원의 면적 계산
		
		//원의 면적을 화면에 출력한다
		System.out.print("반지름 " + radius + ", ");
		System.out.println("원의 면적 = " + circleArea + "입니다.");
	}
}
