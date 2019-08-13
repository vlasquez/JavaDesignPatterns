package design.patterns.structural.composite.challenge;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        Supervisor technologyDean = new Supervisor("Dr. Mike", "Dean of Technology");
        Supervisor chairOfMathDeparment = new Supervisor("Dr. John", "Chair of Math Deparment");
        Supervisor chairOfComputerScienceDeparment = new Supervisor("Dr. Ian", "Chair of Computer Science Deparment");

        Professor mathProf1 = new Professor("Math Professor1", "Adjunct", 302);
        Professor mathProf2 = new Professor("Math Professor2", "Associate", 304);

        Professor cseProf1 = new Professor("CSE Professor1", "Adjunct", 303);
        Professor cseProf2 = new Professor("CSE Professor2", "Professor", 306);
        Professor cseProf3 = new Professor("CSE Professor3", "Professor", 305);

        technologyDean.add(chairOfMathDeparment);
        technologyDean.add(chairOfComputerScienceDeparment);

        chairOfMathDeparment.add(mathProf1);
        chairOfMathDeparment.add(mathProf2);

        chairOfComputerScienceDeparment.add(cseProf1);
        chairOfComputerScienceDeparment.add(cseProf2);
        chairOfComputerScienceDeparment.add(cseProf3);
        System.out.println("*** COMPOSITE PATTERN DEMO***");
        System.out.println("\n the college has the following structure\n");
        System.out.println(technologyDean.getDetails());

        List<Faculty> chairs = technologyDean.getFacultyList();
        for (Faculty faculty : chairs) {
            System.out.println("\t" + faculty.getDetails());
        }

        List<Faculty> mathProfessors = chairOfMathDeparment.getFacultyList();
        for (Faculty faculty : mathProfessors) {
            System.out.println("\t\t" + faculty.getDetails());
        }

        List<Faculty> cseProfessors = chairOfComputerScienceDeparment.getFacultyList();
        for (Faculty faculty : cseProfessors) {
            System.out.println("\t\t" + faculty.getDetails());
        }

        chairOfComputerScienceDeparment.remove(cseProf2);

        System.out.println("\n After cseProf2 leaving the organization- CSE department has following professors \n");
        cseProfessors = chairOfComputerScienceDeparment.getFacultyList();
        for (Faculty faculty : cseProfessors) {
            System.out.println("\t\t" + faculty.getDetails());
        }
    }

}
