package Sort;

public class QuickSort {
	public static int QuickSort(int[] arr,int left,int right){
		//选择最左边的数为关键字
		int key=arr[left];
		while(true){
			//从右开始，找到比关键字小的数放到左边
			while(left<right && arr[right]>=key)
				right--;
			arr[left]=arr[right];
			//找到比关键字大的数移动到右边
			while(left<right && arr[left]<=key)
				left++;
			arr[right]=arr[left];
			}
		//关键字到了最终位置
		arr[left] = key;
		//返回关键字的位置
		return left;

	}
	public void sort(int[] arr,int left,int right){
		if(left<right){
			int result=QuickSort(arr, left, right);
			sort(arr,left,result-1);
			sort(arr,result+1,right);
		}
	}
}

