
public class SortingArray {

	public  static void main(String[] args) {
	  int[] number = {55, 59,39,45,65};
	  int n=number.length;
	  for(int i=0;i<n;i++){
		  for(int j=i+1;j<n;j++){
		  if(number[i]<number[j])
		  {
		  int temp=number[i];
		  number[i]=number[j];
		  number[j]=temp;
		  }
		  }
	  }
	  System.out.println("The descending orderlist is shown below.");
	  for (int item : number) //use of enhanced for loop
	  {
	  System.out.println(" " + item);
	  }
	  System.out.println(" ");
	}

}
