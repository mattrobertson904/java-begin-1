
public class StringMethods4 {
	public static void main(String[] args) {
		String str = "Apples";
		char [] strArray = str.toLowerCase().toCharArray();
		//same as saying
		//char [] strArray=
		//       {'P','a','n','c','a','k','e','s'};
		//variable to hold all the vowels
		String vowels = "aeiou";
		int count = 0;
		//enhanced for loop
		for(char ele: strArray) {
			//if the index isn't -1 it's contained in the
			//String of vowels
			if(vowels.indexOf(ele) != -1 ) {
				count++;
			}
		}
		System.out.println(count);
	}
}
