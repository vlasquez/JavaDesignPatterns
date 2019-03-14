package design.principles.solid.dependencyInversion.correct;

import design.principles.solid.dependencyInversion.DBConnectionInterface;

public class PasswordReminder {

    public DBConnectionInterface dbConnection;

    public PasswordReminder(DBConnectionInterface dbConnection) {
        this.dbConnection = dbConnection;
    }
}
