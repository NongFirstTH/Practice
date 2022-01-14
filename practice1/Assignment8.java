package practice1;
import java.util.Scanner;
class Assignment8{//โปรแกรมคำนวนค่าสูงสุด-ต่ำสุด
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=0,min=Integer.MAX_VALUE;
        while(true){
            System.out.print("ป้อนตัวเลขของคุณมา = ");
            int n = sc.nextInt();
            if(n<0)break;
            if(n>max)max=n;
            if(n<min)min=n;
        }
        System.out.println("ค่าสูงสุด = "+max);
        System.out.println("ค่าต่ำสุด = "+min);
    }
}