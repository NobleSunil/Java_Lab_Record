package QuestionBank;

class Employee{
    final String companyname;
    double salary;

    Employee(String companyname, double salary){
        this.companyname = companyname;
        this.salary = salary;
    }

    double calcBonus(){
        return salary * 0.05;
    }
}

class Manager extends Employee{
    Manager(String companyname,  double salary){
        super(companyname, salary);
    }
    @Override
    double calcBonus(){
        return salary * 0.10;
    }
}

class SeniorManager extends Manager{
    SeniorManager(String companyname,  double salary){
        super(companyname, salary);
    }
    @Override
    double calcBonus(){
        return salary * 0.10;
    }
}

public class Five{
    public static void main(String[] args){
        Employee e = new Employee("John Smith", 25000);
        Manager m = new Manager("John Smith", 25000);
        SeniorManager s = new SeniorManager("John Smith", 25000);

        System.out.println(e.calcBonus());
        System.out.println(m.calcBonus());
        System.out.println(s);
    }
}
