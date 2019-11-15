package design.principles.solid.dependencyInversion.incorrect;


import design.principles.solid.dependencyInversion.MySqlConnection;

public class PasswordReminder {

    /**
     * MySqlConnection is a low level module(class)
     * our PasswordReminder is a high level module(class)
     * this code is violating the Dependency Inversion Principle
     * because PasswordReminder is being forced to depend
     * on the MySqlConnection
     */

    public PasswordReminder(MySqlConnection dbConnection) {
        int dbConnection1 = dbConnection.connect();
    }
}
