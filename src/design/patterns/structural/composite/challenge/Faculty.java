package design.patterns.structural.composite.challenge;

public interface Faculty {

    String getDetails();
}

class Professor implements Faculty {
    private String mName;
    private String mPosition;

    public Professor(String mName, String mPosition, int mOfficeNum) {
        this.mName = mName;
        this.mPosition = mPosition;
    }

    @Override
    public String getDetails() {
        return (mName + " is the " + mPosition);
    }
}