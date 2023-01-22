package ch5ex2;
import java.util.Scanner;

public class Ch5Ex2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int height,weight,width,length,volume;
        
        System.out.println("Please enter a weight");
            weight=input.nextInt();
        System.out.println("Please enter a length");
            length=input.nextInt();
        System.out.println("Please enter a width");
            width=input.nextInt();
        System.out.println("Please enter a height");
            height=input.nextInt();
                        
                volume=height*length*width;
                
                
                if(volume>100000&&weight>27){
                    System.out.println("The package is too large and heavy");
                }
                else if(volume>100000){
                    System.out.println("The package is too large");
                }
                else if(weight>27){
                    System.out.println("The package is too heavy");
                }
                else{
                    System.out.println("The package meets the requirements");
                }
    }
    
}
