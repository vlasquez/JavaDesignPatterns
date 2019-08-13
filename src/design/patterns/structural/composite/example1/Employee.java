package design.patterns.structural.composite.example1;

public interface Employee {
    void showEmployeeDetails();
}

class Developer implements Employee {
    private String name;
    private long id;
    private String position;

    public Developer(String name, long id, String position) {
        this.name = name;
        this.id = id;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(id + " " + name + " " + position);
    }
}

class Manager implements Employee {
    private String name;
    private long id;
    private String position;

    public Manager(String name, long id, String position) {
        this.name = name;
        this.id = id;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(id + " " + name + " " + position);
    }
}
