package ebrada;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args)
    {
       
  
   Scanner Shaine = new Scanner(System.in);
   double pG,mG,fG,gG,aG,eG, ave;
  
 
 
   System.out.print("Enter prelim Grade in English: ");
   pG = Shaine.nextDouble();
    System.out.print("Enter prelim Grade in Mat): ");
   mG = Shaine.nextDouble();
     System.out.print("Enter prelim Grade in Science: ");
   fG = Shaine.nextDouble();
   System.out.print("Enter prelim Grade in History: ");
   gG = Shaine.nextDouble();
   System.out.print("Enter prelim Grade in Filipino: ");
   aG = Shaine.nextDouble();
   System.out.print("Enter prelim Grade in Religion: ");
   eG = Shaine.nextDouble();
   
   ave = ()pG + mG+ fG + gG + aG + eG) /6;
       
   System.out.println("Average: " + ave);
   
        if (ave>75) 
            System.out.println("Pass " );
        else if (ave<75)
        System.out.println(" Failed ");
        
   
    }
}

