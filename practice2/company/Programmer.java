package practice2.company;
class Programmer extends Employee{
    public void skill(){
        System.out.println("No skill");
    }
    public void skill(String...language){
        for(int i=0;i<language.length;i++){
            System.out.println("skill = "+language[i]);
            }
        }
    public void bonus(){
System.out.println("s");
    }
}
