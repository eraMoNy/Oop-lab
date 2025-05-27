public class Teacher {
    String name;
    int id;
    float salary;
    void display(){
        System.out.println("Name is "+this.name+"ID is "+this.id+"Salary is "+this.salary);
    }
    void setvalue(String name, int id,float salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    float getsalary(){
        return this.salary;
    }
}
