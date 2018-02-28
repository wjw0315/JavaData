package Sort;

public class BubbleSort {

	public static void bubble(long[] arr){
		long tmp;
		for(int i=0;i<arr.length-1;i++){
			for(int j=arr.length-1;j<i;j--){
				if(arr[j-1]>arr[j]){
					tmp=arr[j-1];arr[j-1]=arr[j];arr[j]=tmp;
				}
			}
		}
	}
}
