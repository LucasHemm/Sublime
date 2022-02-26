import java.util.Arrays;

public class Main{
/* opgaven er lavet anderledes end beskrivelsen. den er lavet i sublime istedet for proccessing, 
og der er brugt end anden sorting metode end den som opgaven kom med.*/
	static int[] myArr = { 8, 9, 1, 5, 11, 13, 7, 4, 6, 3, 12, 10, 2 };

	public static void sort(int[] tmpArray){
		System.out.println("Original array:");
		for(int k = 0; k < myArr.length;k++){
			System.out.print(myArr[k] + " ");
		}
		for(int i = 0; i < myArr.length;i++){
			for(int j = i+1; j < myArr.length;j++){
			if(myArr[i] > myArr[j]){
				int tmpNum = myArr[i];
				myArr[i] = myArr[j];
				myArr[j] = tmpNum;
			}
		}
        }
    	System.out.println("\nArray sorted in ascending order: ");    
       	for (int i = 0; i < myArr.length; i++){     
       	System.out.print(myArr[i] + " ");
    }
	}



	public static void main(String[] args){
		sort(myArr);
		
	}
}