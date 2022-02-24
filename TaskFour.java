public class TaskFour {
	/*4.e pseudocode: if the array had a fixed length i would make a for loop which would go through the array 
	with an if statement which would check to see if the index had a lower value than max value,
	if it did it would then be put into index 0 which would be updated if any of the other indexes in 
	the array had a lower value. through the for loop i would do this for each of the indexes.
	*/
static int[] intArray = {5,10,20,5,50};
static String[] stringArray = {"Hej","SuperMand","Computer","Bil","Bord"};
boolean[] booleanArray = {false,true,false,true,true,false};

public static int sum(int[] tmpIntArray) {
	int sum = 0;
	for(int i = 0; i <= tmpIntArray.length-1; i++){
		sum += tmpIntArray[i];
		System.out.println(sum);
	}
	return sum;
}

public static int average(int[] tmpIntArray){
	int average = 0;
	for(int i = 0; i <= tmpIntArray.length-1; i++){
		average += tmpIntArray[i];
		System.out.println(average);
	}
	System.out.println("average " + average / tmpIntArray.length);
	return average / tmpIntArray.length;
}


public static void stringPrinter(String[] tmpStringArray){
	//myStringArray = tmpStringArray;
	for(int i = 0; i < tmpStringArray.length;i++) {
		System.out.println(tmpStringArray[i]);
	}
}
public static void main(String args[]) {
	stringPrinter(stringArray);
	sum(intArray);
	average(intArray);
}
}