
public class FindLargeSmall {
	public static void main(String[] args) {
        
        //numbers array
        int numbers[] = new int[]{55,40,59,60,32,8,90};
       
        //assign first element of an array to largest and smallest
        int smallest = numbers[0];
        int largetst = numbers[0];
       
        for(int i=1; i< numbers.length; i++) { if(numbers[i] > largetst)
                        largetst = numbers[i];
                else if (numbers[i] < smallest)
                        smallest = numbers[i];
               
        }
       
        System.out.println("Largest Number is : " + largetst);
        System.out.println("Smallest Number is : " + smallest);
}
}