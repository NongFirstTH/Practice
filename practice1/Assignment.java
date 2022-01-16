package practice1;
import java.util.Scanner;
class Assignment{
//โปรแกรมเปรียบเทียบตัวเลข
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("เลขตัวที่ 1 = ");
        int o = sc.nextInt(); //o=one เลขตัวแรก
        System.out.print("เลขตัวที่ 2 = ");
        int t = sc.nextInt(); //t=two เลขตัวที่สอง
        if(o>t){
            System.out.println("คำตอบคือ "+o+" > "+t);
        }else if(o<t){
            System.out.println("คำตอบคือ "+o+" < "+t);
        }else{            
            System.out.println("คำตอบคือ "+o+" = "+t);
        }
    }    
}
