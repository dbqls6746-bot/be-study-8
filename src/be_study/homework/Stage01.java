package be_study.homework;

public class Stage01 {

	public static void main(String[] args) {
		int[] arr1 = {10, 20 ,30, 40,50};
		
		int[] arr2 = new int[5];
		arr2[2] = 50;
		
		System.out.println(arr2.length);
		
		int sum = 0;
		
		for(int i=0; i<arr1.length; i++) {
			sum += arr1[i];
		}
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		
	}
	public static double average(int[] arr) {
		if (arr == null || arr.length == 0)
			return 0;
		int sum =0;
		for (int val : arr) 
			sum += val;
			return (double) sum / arr.length;
	}
	
	public static int maxValue(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (val > max) max = val;
        }
        return max;
    }
	
	public static void incrementAll(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
    }
	
	public static int[] createArray(int length) {
        return new int[length];
    }
	
	public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
	}
}
