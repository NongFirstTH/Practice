package practice1;
class method {
    public static void main(String[] args){
       screen();
       animal("กระต่าย","แมว");
       String result=getip();
       System.out.println(result);

    }
    //method ธรรมดา
    static void screen(){
        System.out.println("OK");
    }
    //method รับค่า
    static void animal(String a,String b){
        System.out.println(a+" , "+b);
    }
    //method return
    static String getip(){
        return "198.0.0.1";
    }
}
