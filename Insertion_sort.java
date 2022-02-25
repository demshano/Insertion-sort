public class Insertion_sort{
	
	public static void main(String []args){
		
		int a[]={1,2,3,10,7};
		
		for(int i=1;i<a.length;i++){
			int temp = a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp){
		a[j+1]=a[j];
		j--;
	}
	
	a[j+1]=temp;
}

for(int i=0;i<a.length;i++){			//display the values
	System.out.println(a[i]);
}

}
}
