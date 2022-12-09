package Racing;

import static Racing.Validate.*;

public abstract class Driver {
    private  String name;
    private  boolean license;
    private  Integer experience;

    public Driver(String name,
                  Boolean license,
                  Integer experience) {
        this.name = validateString("name","no name");
        this.license = validateBoolean(license);
        this.experience = validateInteger(experience, 1);
    }
    public String getName() {
        return name;
    }

    public boolean isLicense() {
        return license;
    }

    public Integer getExperience() {
        return experience;
    }

    abstract String start();
    abstract String stop();
    abstract String refuel();


}

