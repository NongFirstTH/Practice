package practice1;

public class looploop {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            System.out.println("รอบนอก : "+i);
            for(int j=1;j<=5;j++){
                System.out.println("ใน : "+j);
            }
        }
    }
}
