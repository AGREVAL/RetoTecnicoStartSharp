package co.com.choucair.cetification.proyectobase.models;

public class ActorData {

    // Data Business Unit
    private String name = "Testing-UB";
    private String parentUnit = "Acme Corp.";
    // Data Creation New Meeting

    private String meetingName = "Project status review";
    private String meetingType = "Strategy";
    private String meetingNubmer = "PSR-01";
    private String meetingLocation = "SD-01";
    private String unit = "Testing-UB";
    private String organizedByName = "Elizabeth Foster";
    private String reporterName = "Allison Bell";
    private String attendeeListName = "Aaron Taylor";

    public ActorData() {
    }

    public ActorData(String name, String parentUnit) {
        this.name = name;
        this.parentUnit = parentUnit;
    }

    public ActorData(String meetingName, String meetingType, String meetingNubmer, String meetingLocation, String unit, String organizedByName, String reporterName, String attendeeListName) {
        this.meetingName = meetingName;
        this.meetingType = meetingType;
        this.meetingNubmer = meetingNubmer;
        this.meetingLocation = meetingLocation;
        this.unit = unit;
        this.organizedByName = organizedByName;
        this.reporterName = reporterName;
        this.attendeeListName = attendeeListName;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getParentUnit() {
        return parentUnit;
    }

    public void setParentUnit(String parentUnit) {
        this.parentUnit = parentUnit;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }

    public String getMeetingType() {
        return meetingType;
    }

    public void setMeetingType(String meetingType) {
        this.meetingType = meetingType;
    }

    public String getMeetingNubmer() {
        return meetingNubmer;
    }

    public void setMeetingNubmer(String meetingNubmer) {
        this.meetingNubmer = meetingNubmer;
    }

    public String getMeetingLocation() {
        return meetingLocation;
    }

    public void setMeetingLocation(String meetingLocation) {
        this.meetingLocation = meetingLocation;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getOrganizedByName() {
        return organizedByName;
    }

    public void setOrganizedByName(String organizedByName) {
        this.organizedByName = organizedByName;
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }

    public String getAttendeeListName() {
        return attendeeListName;
    }

    public void setAttendeeListName(String attendeeListName) {
        this.attendeeListName = attendeeListName;
    }

}
