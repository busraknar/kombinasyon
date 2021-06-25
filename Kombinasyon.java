import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Küme eleman sayısını giriniz:");
        int n=input.nextInt();
        System.out.println("Oluşturulacak grupların sayısını giriniz:");
        int r= input.nextInt();
        int i, nfakt=1, rfakt=1,tfakt=1,komb=0;
        for(i=1; i<=n; i++){
            nfakt= nfakt*i;
        }
        for(i=1; i<=r; i++) {
            rfakt= rfakt*i;
        }for(i=1; i<=(n-r); i++) {
            tfakt= tfakt*i;
        }
        komb= nfakt /(rfakt * tfakt);
        System.out.println(n+"'in "+r+"'li kombinasyonu="+ komb);

    }
}
