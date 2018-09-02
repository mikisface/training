package basics;

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prova[]= {2,4,5,15};
		System.out.println(findMax(prova));
	}
	public static int findMax(int[] arr){

		int max= arr[0];

		for(int i=0;i<arr.length;i++){

		if(arr[i]>max){

		max=arr[i];

		}

		}

		return max;

		}
}
