
public class Hello {
	public static int sum(int n, int m)	{
		return n + m ;
	}
	
	public static void main(String[] args)	{
		int i = 20;
		int s;
		char a;
		int j;
		
		s = sum(i, 10);
		a = '?';
		j = sum(s, i);
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
		System.out.println(j);
		System.out.println(j+s);
		System.out.println(a+a);
	}
}
