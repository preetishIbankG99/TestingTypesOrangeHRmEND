package practisejava;

public class SumOFArray {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,4,3,6};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
System.out.println(sum);
	}

}
