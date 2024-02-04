public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name=name;
        this.workHours=workHours;
        this.hireYear=hireYear;
        this.salary=salary;
    }

    double tax(){
        if(this.salary>1000) {
            return this.salary * 0.03;
        }
        else{
            return 0;
        }
    }

    double bonus(){
        if(this.workHours>40){
            return (workHours-40)*30;
        }
        else return 0;
    }

    double raiseSalary()
    {
        int year=2021-this.hireYear;
        if(year<10){
            return this.salary*0.05;
        }
        else if(year>9&&year<20){
            return this.salary*0.1;
        }
        else return this.salary*0.15;
    }


    void ToString(){
        System.out.println("Name : "+this.name);
        System.out.println("Salary : "+this.salary);
        System.out.println("Working Hours : "+this.workHours);
        System.out.println("Starting Year : "+this.hireYear);
        System.out.println("Tax : "+ tax());
        System.out.println("Bonus : "+ bonus());
        System.out.println("Salary Increase : "+ raiseSalary());
        System.out.println("Salary with Tax and Bonuses :"+ (this.salary-tax()+bonus()));
        System.out.println("Total Salary : "+ (this.salary-tax()+bonus()+raiseSalary()));
    }
}