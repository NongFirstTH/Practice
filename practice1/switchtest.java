package practice1;

import java.util.Scanner;

public class switchtest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("เดือน : ");
        int month = sc.nextInt();
        switch(month){
            case 1 : System.out.println("มากราคม");
            break;
            case 2 : System.out.println("กุมภาพันธ์");
            break;
            default : System.out.println("ไม่มีอะไรนอกจากเงิน");
        }
    }
}
