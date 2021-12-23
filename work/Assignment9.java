package work;
import java.util.Scanner;
public class Assignment9 {//โปรแกรมหาเลขคู่-คี่
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("ป้อนค่าตัวเลขลงมา = ");
            int n=sc.nextInt();
            if(n<0)break;
        if(n%2==0){
            System.out.println("เลขคู่");
        }else{
            System.out.println("เลขคี่");
            }
        }
    }

}
