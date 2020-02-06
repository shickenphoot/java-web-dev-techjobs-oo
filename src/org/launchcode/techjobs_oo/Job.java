package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        id=nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name=name;
        this.employer=employer;
        this.location=location;
        this.positionType=positionType;
        this.coreCompetency=coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Job)) return false;
        Job job=(Job)obj;
        return id == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {

        if(name==null&&employer==null&&location==null&&positionType==null&&coreCompetency==null){
            return "\nOOPS! This job does not seem to exist.\n";
        }else {
            return "\nID: "+this.getId()+
                    "\nName: " + this.getName() +
                    "\nEmployer: " + employer.getValue() +
                    "\nLocation: " + location.getValue() +
                    "\nPosition Type: " + positionType.getValue() +
                    "\nCore Competency: " + coreCompetency.getValue() + "\n";
        }



    }
    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {  return id;   }

    public CoreCompetency getCoreCompetency() {  return coreCompetency; }

    public String getName() {      if(name.equals("")){return "Data not available";}else{ return name; }}

    public Employer getEmployer() {        return employer; }

    public Location getLocation() {        return location; }

    public PositionType getPositionType() {        return positionType; }
}
