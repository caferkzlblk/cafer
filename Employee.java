public class Employee {


    private String name;
    private double salary;
    private double workHours;
    private int hireYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if (getSalary()<1000){
            double vergi = 0;
            return vergi;
        }
        else
        {
            double vergi = (this.salary*3)/100;
            return vergi;
        }
    }

    public double bonus(){
        if (getWorkHours()<40){
           double bonus = 0;
            return bonus;

        }
        else {
            double bonus = (this.workHours-40)*30;
            return bonus;
        }
    }

    public double raiseSalary(){
        if (2021-getHireYear()<10){
            double maasArtisi = (this.salary*5)/100;
            return maasArtisi;
        }
        else if (2021-getHireYear()>9 && 2021-getHireYear()<20) {
            double maasArtisi = (this.salary*1)/10;
            return maasArtisi;
        }
        else {
            double maasArtisi = (this.salary * 15) / 100;
            return maasArtisi;
        }
    }

    @Override
    public String toString() {
        return "İsim: " + this.name+ "\n"  +
               "Maaşı: " + this.salary + "\n"  +
               "Calışma Saati: " + this.workHours+ "\n"  +
               "Baslangıç Yılı: " + this.hireYear ;
    }
}