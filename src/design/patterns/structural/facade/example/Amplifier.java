package design.patterns.structural.facade.example;

class Amplifier {
    private String description;
    private DvdPlayer dvd;

    Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    void off() {
        System.out.println(description + " off");
    }

    public void setStereoSound() {
        System.out.println(description + " stereo mode on");
    }

    void setSurroundSound() {
        System.out.println(description + " surround sound on (5 speakers, 1 subwoofer)");
    }

    void setVolume() {
        System.out.println(description + " setting volume to " + 5);
    }

    public void setTuner(Tuner tuner) {
        System.out.println(description + " setting tuner to " + dvd);
    }

    void setDvd(DvdPlayer dvd) {
        System.out.println(description + " setting DVD player to " + dvd);
        this.dvd = dvd;
    }

    public void setCd(CdPlayer cd) {
        System.out.println(description + " setting CD player to " + cd);
    }

    public String toString() {
        return description;
    }
}
