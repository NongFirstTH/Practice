package practice1;
import java.util.Scanner;
class ifstatement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ใส่อายุ = ");
        int x=sc.nextInt();
        
        if(x>0){
            if(x<=15){
                System.out.println("นาย");
            }else{
                System.out.println("นายมากกว่า15แล้ว");
            }
        }
    }
}