
public class StringMethods {
	public static void main(String[] args) {
		String str = "Pancakes";
		String s = new String("Pancakes");
		System.out.println(str.equals(s));
		System.out.println(str == s);
		
		String dog = "GoldenRetriever";
		String d = new String("GoldenRetriever");
		System.out.println(dog.equals(d));
		System.out.println(dog == d);
	}
}
