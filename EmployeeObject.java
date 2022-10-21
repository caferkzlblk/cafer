public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee = new Employee("Cafer", 12000, 45, 1985);

        System.out.println(employee.toString());
        System.out.println("Tax: " + employee.tax());
        System.out.println("Bonus: " + employee.bonus());
        System.out.println("Maaş Artışı: " + employee.raiseSalary());

        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş: " + (employee.getSalary() + employee.bonus() + employee.tax()));
        System.out.println("Toplam Maaş: " + (employee.getSalary() + employee.bonus() + employee.tax() + employee.raiseSalary()));

    }
}