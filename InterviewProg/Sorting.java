package InterviewProg;

public class Sorting {
public static void main(String args[]) {
	int arr[] = {1,2,3,4,5};
	int a;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				a=arr[i];
				arr[i]=arr[j];
				arr[j]=arr[a];
			}
		}
	}
	System.out.println(arr[arr.length -1]);
	System.out.println(arr[arr.length -2]);
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
}
}
