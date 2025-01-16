
public class StringMethods5 {
	public static void main(String[] args) {
		String str = "supercalifragilisticexpialidocious";
		char [] strArray = str.toCharArray();
		
		String vowels = "i";
		int count = 0;
		
		for(char ele: strArray) {
			
			if(vowels.indexOf(ele) != -1 ) {
				count++;
			}
		}
		System.out.println(count);
	}
}


