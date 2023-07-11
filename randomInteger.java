
import java.util.Arrays;
import java.util.Scanner; 
class randomInteger{
    //main method
    public static void main (String args[]){
        int i;
        int  []Randomnumbers =new int [10];
        
         //Enter firs3t number and press Enter then enter more numbers
    System.out.println("Enter 10 Random Integers ");
        Scanner sc =new Scanner (System.in);
        //Looping through  the array indices
        for(i=0;i<10;i++)
        Randomnumbers[i]=sc.nextInt();
         System.out.println ("The numbers  are" + Arrays.toString(Randomnumbers));
        
    
        
}
}