package work;
import java.util.Scanner;
class Assignment2 {//โปรแกรมตำนวณเลขคู่-คี่
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ป้อนตัวเลข = ");
        int num=sc.nextInt();
        String result="";
        /*if(num%2 == 0){
            result = num+" = เลขคู่";
        }else{
            result = num+" = เลขคี่";
        }
        System.out.println(result);*/
        result = (num%2 == 0)? num+" = เลขคู่" : num+" = เลขคี่";
        System.out.println(result); 
    }
}
