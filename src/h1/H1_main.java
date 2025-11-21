package h1;

public class H1_main {

	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5,6};
		int[] extraArray = new int[myArray.length];
		for(int i=0;i<myArray.length;i++) {
			extraArray[(myArray.length-i)-1]=myArray[i];
		}
		myArray = extraArray;
//		for(int i =0;i<myArray.length;i++) {
//			System.out.println(myArray[i]);
//		}
	}
}
