public class TaskTwoA {
	
public static boolean happy = false;

public static void main(String  args[]) {
   if (iAmHappy())
   {
     System.out.println("I clap my hands");
   }
   else
   {
     System.out.println("I don't clap my hands"); 
   }
   returnSum(10,15);
   upperCaseString("hejLucas");
   upperCaseCheck("Hej");
   
}


public static boolean iAmHappy()
{
  // fill out what is missing here: 
  return happy;
}

public static int returnSum(int a, int b){
	return a + b;

}
public static String upperCaseString(String tempString) {
	String myString = tempString;
	System.out.println(myString.toUpperCase()); //tjek for at metoden virker
	return myString.toUpperCase();
}
public static boolean upperCaseCheck(String tempString) {
	char charCheck = tempString.charAt(0);
	if(Character.isUpperCase(charCheck)) {
		System.out.println("true");
		return true;
	}
	System.out.println("false");
	return false;
}



}