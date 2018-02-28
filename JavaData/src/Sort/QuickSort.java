package Sort;

public class QuickSort {
	public static int QuickSort(int[] arr,int left,int right){
		//ѡ������ߵ���Ϊ�ؼ���
		int key=arr[left];
		while(true){
			//���ҿ�ʼ���ҵ��ȹؼ���С�����ŵ����
			while(left<right && arr[right]>=key)
				right--;
			arr[left]=arr[right];
			//�ҵ��ȹؼ��ִ�����ƶ����ұ�
			while(left<right && arr[left]<=key)
				left++;
			arr[right]=arr[left];
			}
		//�ؼ��ֵ�������λ��
		arr[left] = key;
		//���عؼ��ֵ�λ��
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

