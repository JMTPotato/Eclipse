package asdfa;

import java.util.Scanner;

public class ssss {
	public static void main(String[] args) {
		int Tax;
		Scanner scanner = new Scanner(System.in);

		System.out.print("연봉을 입력하시오(단위: 원) : ");

		int EarnMoney = scanner.nextInt(); 								//입력한 연봉 값 읽기
		if(EarnMoney > 1000000000) 										//연봉이 10억 초과
			Tax = 45;													//세금이 45%
		else if((EarnMoney > 500000000) && (EarnMoney <= 1000000000))	//연봉이 5억원 초과 10억원 이하
			Tax = 42;													//세금이 42%
		else if((EarnMoney > 300000000) && (EarnMoney <= 500000000))	//연봉이 3억원 초과 5억원 이하
			Tax = 40;													//세금이 40%
		else if((EarnMoney > 150000000) && (EarnMoney <= 300000000)) 	//연봉이 1.5억원 초과 3억원 이하
			Tax = 38;													//세금이 38%
		else if((EarnMoney > 88000000) && (EarnMoney <= 150000000))		//연봉이 8800만원 초과 1.5억원 이하
			Tax = 35;													//세금이 35%
		else if((EarnMoney > 50000000) && (EarnMoney <= 88000000))		//연봉이 5000만원 초과 8800만원 이하
			Tax = 24;													//세금이 24%
		else if((EarnMoney > 14000000) && (EarnMoney <= 50000000))		//연봉이 1400만원 초과 5000만원 이하
			Tax = 15;													//세금이 15%
		else 															//연봉이 1400만원 이하
			Tax = 6;													//세금이 6%

		System.out.println("내야하는 세금은 연봉의 " + Tax + "% 입니다.");
		scanner.close();
	}
}
//학점이 아닌 연봉에 따라 세금%를 판단하는 코드로 수정하여 다중 if-else문을 더 잘 사용 할 수 있게 연습했습니다.
//%앞에 들어가는 Tax는 문자가 아니기에 int로 정의를 바꾸고 Tax = 45% 같이 ''를 제거하였습니다. 또한 금액의 범위를 정해주어야 하기에 비교, 논리연산자 둘 다 사용하였습니다.
