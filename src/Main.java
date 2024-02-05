import java.util.*;
public class Main {

    public static void main(String[] args) {

     Marble[] arr = new Marble[5];
     Scanner sc = new Scanner(System.in);
     for(int i=0;i< arr.length;i++){
         arr[i]=new Marble();
         System.out.println("Enter the colour of the marble:");
         arr[i].setColour(sc.next());
         System.out.println();
         System.out.println("Enter the price of the marble:");
         arr[i].setPrice(sc.nextInt());
         System.out.println();

     }
        int count=0,sum=0;

     for(int i=0;i< arr.length;i++){

         if(arr[i].getColour().equals("red")){
             count++;
             sum+=arr[i].getPrice();
         }
     }
     if(count!=0) {
         int avg = sum / count;
         System.out.println("The average price of Red colour is:" + avg);
     } else{
         System.out.println("No Red marbles found");
     }

    }
}