package InterviewProg;

public class MergeArray {
	    public static void main(String[] args) {
	        
	        int[] arr1 = {1, 2, 3};
	        int[] arr2 = {4, 5, 6};
	        int[] mergedArray = mergeTwoArrays(arr1, arr2);
	        for (int num : mergedArray) {
	            System.out.print(num + " ");
	        }
	    }
	    static int[] mergeTwoArrays(int[] arr1, int[] arr2) {       
	        if (arr1 == null || arr2 == null) {
	            return new int[0]; 
	        }
	        int n1 = arr1.length;
	        int n2 = arr2.length;
	        int[] result = new int[n1 + n2]; 
	        System.arraycopy(arr1, 0, result, 0, n1);
	        System.arraycopy(arr2, 0, result, n1, n2);
	        return result;
	    }

}
