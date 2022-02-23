public class Datamatik{
	
static Student[] studentArray = new Student[10];


public static String findName(int tmpStudentNr) {
	int studentNr = tmpStudentNr;
	System.out.println(studentArray[studentNr].name);
	return studentArray[studentNr].name;
}

public static int findNameString(Student[] tmpStudentArray, String tmpStudentName) {
	Student[] myStudentArray = tmpStudentArray;
	String myStudentName = tmpStudentName;
	for(int i = 0; i < myStudentArray.length; i++){
		if(myStudentArray[i].name == myStudentName){
			System.out.println("Index number: " + i);
			return i;
		}
	}
	return 1;
}



public static void main(String[] args){
	studentArray[0] = new Student("Mikkel", 25, false, 2);
	studentArray[1] = new Student("Mille", 27, true, 2);
	studentArray[2] = new Student("Peter", 24, false, 2);
	studentArray[3] = new Student("Sidsel", 22, true, 2);
	studentArray[4] = new Student("Thor", 35, false, 2);
	studentArray[5] = new Student("Trine", 24, true, 2);
	studentArray[6] = new Student("Torben", 19, false, 2);
	studentArray[7] = new Student("Nikolaj", 28, false, 2);
	studentArray[8] = new Student("Alexander", 26, false, 2);
	studentArray[9] = new Student("Nina", 32, true, 2);
	//findName(4);
	//findName(6);
	//findName(0);
	findNameString(studentArray, "Alexander");
	findNameString(studentArray, "Sidsel");
	findNameString(studentArray, "Nina");
}
}
