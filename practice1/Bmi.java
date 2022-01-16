package practice1;
import java.util.Scanner;
class Bmi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ใส่น้ำหนัก(kg) = ");
        int W = sc.nextInt();
        System.out.print("ใส่ส่วนสูง(cm) = ");
        float H = sc.nextFloat();
        H/=100;
        float BMI = W/(H*H);
        System.out.println("ค่าBMIของคุณ คือ "+BMI);
        if(BMI<18.50){
            System.out.println("อยู่ในเกณฑ์ผอม");
        }else if(BMI>=18.50 && BMI<=22.9){
            System.out.println("อยู่ในเกณฑ์ปกติ");
        }else if(BMI>=23 && BMI<=24.9){
            System.out.println("อยู่ในเกณฑ์ท้วม");
        }else if(BMI>=25 && BMI<=29.9){
            System.out.println("อยู่ในเกณฑ์อ้วน");
        }else if(BMI>=30){
            System.out.println("อยู่ในเกณฑ์อ้วนมาก");
        }
    }
}