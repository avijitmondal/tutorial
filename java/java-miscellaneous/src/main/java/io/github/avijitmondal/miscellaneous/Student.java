package io.github.avijitmondal.miscellaneous;

import java.util.Comparator;

public class Student implements Comparable<Student> {

    static Comparator<Student> StudentNameComparator = Comparator.comparing(Student::getName);
    int roll;
    String name;
    String location;

    public Student(int roll, String name, String location) {
        super();
        this.roll = roll;
        this.name = name;
        this.location = location;
    }

    /**
     * @return the roll
     */
    public int getRoll() {
        return roll;
    }

    /**
     * @param roll the roll to set
     */
    public void setRoll(int roll) {
        this.roll = roll;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Student [roll=" + roll + ", " + (name != null ? "name=" + name + ", " : "")
                + (location != null ? "location=" + location : "") + "]";
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Student o) {
        return this.roll - o.roll;
    }
}
