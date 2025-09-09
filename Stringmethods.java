public class Stringmethods
{
	public static void main(String[] args)
	{
		String S = " Java Program ";
		String T = " Python Program "; //string literal method to create strings.
		System.out.println(S.length());
		System.out.println(T.charAt(2));
		System.out.println(S.isEmpty());
		System.out.println(T.trim());
		System.out.println(S.toUpperCase());
		System.out.println(T.toLowerCase());
		System.out.println(S.equals(T));
		System.out.println(S.equalsIgnoreCase(T));
		System.out.println(S.compareTo(T));
		System.out.println(S.compareToIgnoreCase(T));
		System.out.println(T.contains("ython"));
		System.out.println(S.startsWith("J"));
		System.out.println(T.endsWith(" "));
		System.out.println(S.indexOf("a"));
		System.out.println(T.lastIndexof("o"));
		System.out.println(S.substring(1));
		System.out.println(T.substring(0,8));
		System.out.println(T.replace("P","Y"));
		System.out.println(S.replace("Java","Python"));	
	}
}
		
