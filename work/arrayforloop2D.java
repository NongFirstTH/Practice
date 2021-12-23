package work;
class arrayforloop2D{
    public static void main(String[] args) {
        String [][] table = {//มีมิติ=2
            {"ก","ข","ฃ"},
            {"ค","ฅ","ง"},
            {"จ","ฉ","ฌ"}
        };
        for(int row = 0;row<table.length;row++){
            for(int column =0;column<table[row].length;column++){
                System.out.println("แถวที่ "+row+" คอลัมน์ที่ "+column+
                " = "+table[row][column]);
            }
        }                


    }
}