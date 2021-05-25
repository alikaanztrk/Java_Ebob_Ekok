
import java.util.Scanner;


public class ebob {


    public static void main(String[] args) {
        int n1,n2;
        int ebob = 1;
        int i= 1;
        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz: ");
        n1=scn.nextInt();
        n2=scn.nextInt();
        
        while(i<=n1 && i<=n2){
            i++;
            if(n1%i==0 & n2%i==0){
                ebob=i;
            }
        }
        System.out.println(n1 + " ve " + n2 + " sayısının EBOB değeri:"+ ebob);
      
    }


}



