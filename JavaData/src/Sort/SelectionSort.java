package Sort;

public class SelectionSort {

	public static void SelectionSort(long[] arr){
		long tmp;
		int key=0;
		for(int i=0;i<arr.length-1;i++){
			key=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[key]>arr[j]){
					key=j;
				}
			}
			if(key!=i){
				tmp=arr[i];arr[i]=arr[key];arr[key]=tmp;
			}
		}
	}
	
}
