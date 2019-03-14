package design.principles.solid.dependencyInversion;

public class MySqlConnection implements DBConnectionInterface {

    @Override
    public int connect() {
        return 1;
    }
}
