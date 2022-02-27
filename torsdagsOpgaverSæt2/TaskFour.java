
import java.util.Random;
public class TaskFour{

static int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };


public static void divideByParameter(int tmpNum){
	int num = tmpNum;
	for(int i = 0; i <= 100; i++){
		if(i % num == 0){
			System.out.println(i);
		}
	}
}

public static void randomPrint(){
	Random randomNum = new Random();
	int x = randomNum.nextInt(21);
	System.out.println(arr[x]);
}

public static void recursionInt(int tmpNum){
	System.out.println(tmpNum);
	if(num > 0){
		recursionInt(num);
	}


}


public static void main(String[] args){
//divideByParameter(3);
randomPrint();
}
}