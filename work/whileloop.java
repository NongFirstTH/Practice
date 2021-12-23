package work;
import java.util.Scanner;
public class whileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=1;
        while(true){
            System.out.println("รอบที่ "+x+" x=1");
            x++;
            if(x>10)break;
        }
    }
}
