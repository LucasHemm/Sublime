public class Main {
	
	public static void main(String args[]){
	
		emptyLine();
		myString("Hello World");
		myOtherString("Lucas", 21);
	}

	static void emptyLine() {
		System.out.println("");
	}
	static void myString(String tmpString){
		String stringToPrint = tmpString;
		System.out.println(stringToPrint);
	}
	static void myOtherString(String tmpname, int tmpage){
		String name = tmpname;
		int age = tmpage;
		System.out.println("My name is "+ name + ", i am " + age + " years old.");
	}




}