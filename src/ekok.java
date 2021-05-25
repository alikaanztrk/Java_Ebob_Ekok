import java.util.Scanner;


public class ekok {
    public static void main(String[] args) {
        int x,y;
        System.out.println("Birinci sayıyı giriniz: ");
        Scanner scn = new Scanner(System.in);
        x= scn.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        y= scn.nextInt();
        System.out.println("EKOK DEĞERİNİZ:" + ekok(x,y));
        }
    public static int ekok(int x, int y){
        int ekok=0;
        for (int i = 1; i < x*y; i++) {
            if(i%x==0 && i%y==0){
            ekok=i;
            break;
            
        }
                
    }
    return ekok;
    
    
    }
}
