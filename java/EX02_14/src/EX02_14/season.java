package EX02_14;

import java.util.Scanner;

public class season {
	public static void main(String[] args)	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("월(1~12)을 입력하시오:");
		int month = scanner.nextInt();	//정수로 월 입력
		
		/*switch(month)	{
			case 3:
			case 4:
			case 5:
				System.out.println("봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println("여름입니다."); break;
			case 9: case 10: case 11:
				System.out.println("가을입니다."); break;
			case 12: case 1: case 2:
				System.out.println("겨울입니다."); break;
			default:
				System.out.println("잘못된 입력입니다.");	
		}*/
		
		if((month>=3) && (month<=5))
			System.out.println("봄입니다.");
		else if((month>=6) && (month<=8))
			System.out.println("여름입니다.");
		else if((month>=9) && (month<=11))
			System.out.println("가을입니다.");
		else if((month==12) && (month==1) && (month==2))
			System.out.println("겨울입니다.");
		else
			System.out.println("잘못된 입력입니다.");
		
		scanner.close();
	}
}
