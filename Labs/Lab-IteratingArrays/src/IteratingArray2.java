
public class IteratingArray2 {
	public static void main(String[] args) {
		int[] myArray = {2,5,7,10,14,20};
		
		for (int index = 0; index < myArray.length; index++) {
			if (myArray[index] >= 0) {
				System.out.println(myArray[index]);
			}
		}
	}
}