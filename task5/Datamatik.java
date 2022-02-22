public class Datamatik{
	

public static void main(String args[]){
	
Teacher myTeacher = new Teacher("Hans",28, false);
Student student1 = new Student("Lucas", 21, false, 1);
Student student2 = new Student("Kevin", 23, false, 2);
System.out.println(myTeacher.name);
System.out.println(student1.name +" team: " + student1.datamatikerTeam);
System.out.println(student2.name +" team: " +  student2.datamatikerTeam);


}


}