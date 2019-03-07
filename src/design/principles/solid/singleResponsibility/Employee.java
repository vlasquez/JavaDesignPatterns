package design.principles.solid.singleResponsibility;

import java.util.Date;

public class Employee {

    private String employeeId;

    private String name;

    private String address;

    private Date dateOfJoining;



    /** This methods violate the Single Responsibility Principle
     * For solve this we need to move this methods to their respective classes
     **/
    /*public boolean isPromotionDueThisYear(){
        //promotion logic
    }

    public double calcIncomeTaxForCurrentYear(){

    }*/

    /** Getters / Setters **/
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }
}
