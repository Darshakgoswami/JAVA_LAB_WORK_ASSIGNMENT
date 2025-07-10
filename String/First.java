package String;

public class First
{

	public static void main(String[] args)
	{
		String s = " Hello World ";
		String s1 = "Hello";
		System.out.println(s.length());
		System.out.println(s.indexOf('e'));
		System.out.println(s.charAt(3));
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s1.compareTo(s));
		System.out.println(s1.concat("world"));
		System.out.println(s.contains("h"));
		System.out.println(s.replace("H", "x"));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());
		int i=10;
		String s5=String.valueOf(i);
		System.out.println(s5);
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb.reverse());
	}

}