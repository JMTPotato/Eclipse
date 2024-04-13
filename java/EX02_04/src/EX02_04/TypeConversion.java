package EX02_04;

public class TypeConversion {
	public static void main(String[] args)	{
		byte b = 127;
		int i = 100;
		
		//자동 타입 변환
		System.out.println(b+i);					//b가 int 타입으로 자동 변환
		System.out.println(10/4);					//자동 변환이 안생겼다 봐야함
		System.out.println(10.0/4);					//4가 4.0타입으로 자동 변환
		
		//강제 타입 변환
		System.out.println((char)0x12340041);		
		System.out.println((byte)(b+i));			//
		System.out.println((int)2.9 + 1.8);			//연산자 우선 순위에 의해 사칙연산이 가장 늦게 함	//2+1.8로 되고 int가 double로 바뀌면서 2.0+1.8
		System.out.println((int)(2.9 + 1.8));		//4.7을 int로 변환하니까 4 
		System.out.println((int)2.9 + (int)1.8);	//int + int 라서 3
	}
}
