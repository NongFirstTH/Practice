package work;
import java.util.Scanner;
public class Assignment5 {
    //โปรแกรมแปลงอุณหภูมิ
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("อุณภูมิ ==> ฟาเรนไฮต์ (พิมพ์ 1)");
        System.out.println("ฟาเรนไฮต์ ==> อุณภูมิ (พิมพ์ 2)");
        System.out.print("=");
        float i = sc.nextFloat();

        if(i==1){System.out.print("ใส่อุณหภูมิ(C):");
        float c = sc.nextFloat();
        float f=(c*9/5)+32;
        System.out.println(c+" องศา = "+f+" ฟาเรนไฮต์");
        }if(i==2){System.out.print("ใส่อุณหภูมิ(F):");
        float f = sc.nextFloat();
        float c=(f-32)*5/9;
        System.out.println(f+" ฟาเรนไฮต์ = "+c+" องศา");    
        }
    }
}
