import java.util.Scanner;
/**
 * Write a description of class binar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class binar
{
    public static void main (String []args){
        Scanner scan = new Scanner (System.in);
        System.out.println("enter regular number");
        int num =scan.nextInt();
        int j=1,place=0;
        String res="";
        
        int arrlength=0;
        for (int i=1;i<=num;i*=2)
        {
           arrlength++; 
        }
        int [] save=new int [arrlength];
        while (j<=num){
            save[place]=j;
            j*=2;
            place+=1;
        }
        for (int i=arrlength-1;i>=0;i--)
        {
         if (num>save[i])
         {
             res+='1';
             num=num-save[i];
         }
         else if(num<save[i])
         {
             res+='0';
         }
         else if(num==save[i])
         {
             res+='1';
         }
        }
        
        System.out.println(res);
        
    }
}
