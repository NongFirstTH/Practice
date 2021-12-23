package work;
import java.util.Scanner;
class Assignment3 {//โปรแกรมแปลง พ.ศ=>ค.ศ.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ใส่ พ.ศ. = ");
        int p = sc.nextInt();
        p-=543;
        System.out.println("ปี ค.ศ. = "+p);
    }
}
