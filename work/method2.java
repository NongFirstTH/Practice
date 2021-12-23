package work;
class method2{
    public static void main(String[] args){
    int result= maxnum(1,2);
    System.out.println("ตัวเลขที่มากที่สุด = "+result);
    }
    static int maxnum(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}