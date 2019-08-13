package design.patterns.structural.composite.example1;

public class Company {

    public static void main(String[] args) {
        Employee dev1 = new Developer("Andrew", 1, "Pro developer");
        Employee dev2 = new Developer("Angela", 2, "Junior developer");

        Directory engDirectory = new Directory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Employee man1 = new Manager("Oz", 3, "Eng Manager");
        Employee man2 = new Manager("Capo", 4, "Eng Manager 2");

        Directory accDirectory = new Directory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(engDirectory);
        companyDirectory.addEmployee(accDirectory);

        companyDirectory.showEmployeeDetails();
    }
}
