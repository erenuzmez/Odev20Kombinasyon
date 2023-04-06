package CDonguler;
import java.util.Scanner;
public class Odev20Kombinasyon{
    public static void main(String[] args) {
        int n,r,sonuc,fark,totali=1,totalx=1,totalfark=1;
        Scanner input=new Scanner(System.in);
        System.out.println("n değerini giriniz:");
        n=input.nextInt();
        System.out.println("r değerini giriniz:");
        r=input.nextInt();
        fark=n-r;
        for(int i=1; i<=n; i++){
            totali=totali*i;
        }for(int x=1; x<=r; x++){
            totalx=totalx*x;
        }for(int y=1;y<=fark;y++){
            totalfark=totalfark*y;
        }sonuc=totali/(totalx*(totalfark));
        System.out.println("C("+n+","+r+")="+sonuc);
    }
}
