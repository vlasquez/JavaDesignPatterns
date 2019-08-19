package design.patterns.structural.flyweight.challenge;

public interface PlayerInterface {
    void setWeapon(String weapon);

    void printPlayer();
}

class Terrorist implements PlayerInterface {
    String weapon;
    String task;

    public Terrorist(String task) {
        this.task = task;
    }

    @Override
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void printPlayer() {
        System.out.println("Terrorist with weapon " + weapon + " | Task is " + task);
    }
}

class CounterTerrorist implements PlayerInterface {
    String weapon;
    String task;

    public CounterTerrorist(String task) {
        this.task = task;
    }

    @Override
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void printPlayer() {
        System.out.println("Counter Terrorist with weapon " + weapon + " | Task is " + task);

    }
}
