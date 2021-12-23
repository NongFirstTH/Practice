package work;
public class array {
    public static void main(String[] args) {
        int [] num={1,2,3};//แบบที่ 1
        num[0]=100;
        System.out.println(num[0]);

        String [] animal=new String[2];//แบบที่2
        animal[0]="กระต่าย";
        animal[1]="กวาง";
        System.out.println(animal.length);//เช็คสมาชิกว่ามีกี่ตัว
    }
}
