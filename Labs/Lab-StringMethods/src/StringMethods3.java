
public class StringMethods3 {
	public static void main(String[] args) {
		String str = "Pancakes";
		
		//use the indexOf() method - not it returns
		//the index of the first occurrence of a char
		System.out.println(str.indexOf('a'));
		
		String superc = "supercalifragilisticexpialidocious";
		System.out.println(superc.indexOf('c'));
		System.out.println(superc.indexOf('b'));
	}
}
