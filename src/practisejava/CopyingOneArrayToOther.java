package practisejava;

public class CopyingOneArrayToOther {

	public static void main(String[] args) {
		int a[]=new int[]{1,2,4,3,5};
		int b[]=new int[a.length];
		System.out.println(a.length);
		System.out.println(b.length);
        for(int i=0;i<a.length;i++  ) {
	    b[i]=a[i];
}
      //Displaying elements of array a     
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < a.length; i++) {     
           System.out.print(a[i] + " ");    	
        }
        System.out.println();
        //Displaying elements of array b     
        System.out.println("Elements of copy array: ");    
        for (int i = 0; i < b.length; i++) {     
           System.out.print(b[i] + " ");    	
        }
	
	}
	
	

}
