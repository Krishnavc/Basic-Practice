
public class FindPrime {
	/*public static void main(String[] args){
	int n = 50;
	for(int i=1;i<=n;i++){
		if(i%2!=0){
			System.out.println(i);		}
	}
	}*/
	public static void main(String[] args) {

		  int num = 50, count;

		  for (int i = 1; i <= num; i++) {
		   count = 0;
		   for (int j = 2; j <= i / 2; j++) {
		    if (i % j == 0) {
		     count++;
		     break;
		    }
		   }

		   if (count == 0) {
		    System.out.println(i);
		   }
		  }
		 }
}

