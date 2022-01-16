package practice1;
import java.util.Scanner;
public class Assignment7 {//โปรแกรมหาผลบวก
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0,count=0,avg=0;
        while(true){
            System.out.print("ป้อนตัวทเลขของคุณ : ");
            int number=sc.nextInt();
            if(number<0)break;
            count++;
            sum+=number;
        }
        System.out.println("ผลรวม = "+sum);
        System.out.println("จำนวนที่ป้อน = "+count);
        System.out.println("ค่าเฉลี่ย = "+(sum/count));
    }
}
