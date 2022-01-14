package work2.company;
abstract class Employee {

    //Attribute
private String id;
private String name;
private Double salary;

//static
static int minSalary=12000;

//default constructor
public Employee(){
    System.out.println("I am employee.");
}
//default constructor2
    public Employee(String id,String name,Double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        display();
    }

//set method
    public void setID(String id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(Double salary){
        this.salary=salary;
    }
    public void display(){
        System.out.println("ID = "+this.id);
        System.out.println("NAME = "+this.name);
        System.out.println("SALARY = "+this.salary);
    }

    //get method
    public String getID(){
        return  this.id;
    }
    public String getName(){
        return  this.name;
    }
    public Double getSalary(){
        return  this.salary;
    }
    //overiding
    public abstract void bonus();
}
