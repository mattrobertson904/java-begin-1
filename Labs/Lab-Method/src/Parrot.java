
public class Parrot {
	
	public static void main(String[] args) {
		//create a class instance
		Parrot parrot = new Parrot();
		//call your first method here
		parrot.talk();
		
		String[] words = {"Howdy", "Polly", "wanna", "cracker"};
		
		String[] moreWords = {"Just", "A", "Test"};
		
		parrot.repeat(words);
		parrot.repeat(moreWords);
		
		int numOfCrackers = parrot.countCrackers(10,11);
		System.out.println(numOfCrackers);
		
	}
	//create your first method here
	public void talk(){
		System.out.println("squawk");
	}
		
	public void repeat(String[] word){
		for(int i = 0; i < word.length; i++) {
		System.out.println(word[i]);
		}
	}
		
	public int countCrackers(int crackersGiven, int crackersStolen) {
		return crackersGiven + crackersStolen;
	}
}	


