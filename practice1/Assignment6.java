package work;
import java.util.Scanner;
public class Assignment6 {//โปรแกรมแม่สูตรคูร
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("สูตรคูณแม่ : ");
        int s=sc.nextInt();
        System.out.print("ถึงสูตรคูณแม่ : ");
        int e=sc.nextInt();
        for(int i=s;i<=e;i++){
           System.out.println("สูตรคูณแม่ "+i);
            for(int j=1;j<=12;j++){
                System.out.println(i+" x "+j+" = "+(s*j));
            }
        }
    }    
}
