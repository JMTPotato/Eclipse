package EX02_05_00;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String args[]) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");

		Scanner scanner = new Scanner(System.in);
		String name = scanner.next(); 
		System.out.println("당신의 이름은 " + name + "입니다.");
		String city = scanner.next(); 
		System.out.println("당신이 사는 도시는 " + city + "입니다.");
		int age = scanner.nextInt(); 
		System.out.println("당신의 나이는 " + age + "살입니다.");
		double weight = scanner.nextDouble(); // 실수 토큰 읽기
		System.out.println("당신의 체중은 " + weight + "kg입니다.");
		boolean single = scanner.nextBoolean();
		System.out.println("당신은 독신 여부는 " + single + "입니다.");
		
		scanner.close();
	}
}