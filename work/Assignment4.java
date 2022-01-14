package work;
import java.util.Scanner;
class Assignment4{ 
    //โปรแกรมแลกธนบัตร มีแบงค์ 1000 500 100 50 20
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("ใส่จำนวนเงินของคุณ = ");
            int m=sc.nextInt();
            if(m>=1000){
                System.out.println("แลก 1000฿ ได้  "+(m/1000)+"   ใบ");
                m%=1000;
            }if(m>=500){
                System.out.println("แลก  500฿ ได้  "+(m/500)+"   ใบ");
                m%=500;
            }if(m>=100){
                System.out.println("แลก  100฿ ได้  "+(m/100)+"   ใบ");
                m%=100;
            }if(m>=50){
                System.out.println("แลก   50฿ ได้  "+(m/50)+"    ใบ");
                m%=50;
            }if(m>=20){
                System.out.println("แลก   20฿ ได้  "+(m/20)+"   ใบ");
                m%=20;
            }if(m>=10){
                System.out.println("แลก   10฿ ได้  "+(m/10)+"   เหรียญ");
                m%=10;
            }if(m>=1){
                System.out.println("แลก    1฿ ได้  "+(m/1)+"   เหรียญ");
            }
        }
    }
}